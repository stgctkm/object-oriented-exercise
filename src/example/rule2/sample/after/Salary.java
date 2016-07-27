package example.rule2.sample.after;

class Salary {

    EmployeeType type;

    Salary(EmployeeType type) {
        this.type = type;
    }

    int payAmount() {
        return type.getAmount();
    }
}
