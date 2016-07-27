package example.rule3.code.sample1.after;

class Client {

    PlanCode getCustomerPlanCode(PlanCode planCode) {
        return planCode.forCustomerCode();
    }

    boolean isNonPublished(PlanCode planCode) {
        return planCode.isNonPublished();
    }
}
