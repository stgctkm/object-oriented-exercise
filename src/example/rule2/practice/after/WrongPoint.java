package example.rule2.practice.after;

class WrongPoint implements PayPoint {

    public int getPoint() {
        throw new RuntimeException("不正な顧客");
    }
}
