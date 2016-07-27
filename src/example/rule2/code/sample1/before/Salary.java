package example.rule2.code.sample1.before;

class Salary {

    EmployeeType type;

    int monthlySalary;
    int commission;
    int bonus;

    Salary(EmployeeType type) {
        this.type = type;
    }

    int payAmount() {
        switch (type) {
            case ENGINEER:
                return monthlySalary;
            case SALESMAN:
                return monthlySalary + commission;
            case MANAGER:
                return monthlySalary + bonus;
            default:
                throw new RuntimeException("不正な従業員");
        }
    }
}
