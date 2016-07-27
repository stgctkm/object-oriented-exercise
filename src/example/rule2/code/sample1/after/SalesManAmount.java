package example.rule2.code.sample1.after;

class SalesManAmount implements PayAmount {

    int monthlySalary;
    int commission;

    public int getAmount() {
        return monthlySalary + commission;
    }
}
