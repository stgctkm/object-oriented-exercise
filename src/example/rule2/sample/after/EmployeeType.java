package example.rule2.sample.after;

enum EmployeeType {
    ENGINEER(new EngineerAmount()),
    SALESMAN(new SalesManAmount()),
    MANAGER(new ManagerAmount()),
    WRONG(new WrongAmount());

    private PayAmount amount;

    private EmployeeType(PayAmount amount) {
        this.amount = amount;
    }

    int getAmount() {
        return amount.getAmount();
    }
}
