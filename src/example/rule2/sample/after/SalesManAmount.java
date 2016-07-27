package example.rule2.sample.after;

class SalesManAmount implements PayAmount {

    int monthlySalary;
    int commission;

    public int getAmount() {
        return monthlySalary + commission;
    }
}
