package example.rule3.code.sample1.after;

class PlanCode {

    String value;

    PlanCode(String value) {
        this.value = value;
    }

    PlanCode forCustomerCode() {
        return new PlanCode(value.substring(3, 4) + value.substring(8, value.length()));
    }

    boolean isNonPublished() {
        return value.startsWith("9");
    }
}
