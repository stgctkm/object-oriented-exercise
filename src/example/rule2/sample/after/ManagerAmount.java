package example.rule2.sample.after;

class ManagerAmount implements PayAmount {

    int monthlySalary;
    int bonus;

    public int getAmount() {
        return monthlySalary + bonus;
    }
}
