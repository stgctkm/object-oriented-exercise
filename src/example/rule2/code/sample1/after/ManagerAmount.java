package example.rule2.code.sample1.after;

class ManagerAmount implements PayAmount {

    int monthlySalary;
    int bonus;

    public int getAmount() {
        return monthlySalary + bonus;
    }
}
