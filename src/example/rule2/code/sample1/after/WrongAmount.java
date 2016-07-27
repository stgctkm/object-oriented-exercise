package example.rule2.code.sample1.after;

class WrongAmount implements PayAmount {

    public int getAmount() {
        throw new RuntimeException("不正な従業員");
    }
}
