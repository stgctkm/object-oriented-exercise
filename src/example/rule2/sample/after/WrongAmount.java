package example.rule2.sample.after;

class WrongAmount implements PayAmount {

    public int getAmount() {
        throw new RuntimeException("不正な従業員");
    }
}
