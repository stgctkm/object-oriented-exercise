package example.rule2.code.sample1.after;

class Salary {

    EmployeeType type;

    Salary(EmployeeType type) {
        this.type = type;
    }

    int payAmount() {
        return type.getAmount();
    }
}
