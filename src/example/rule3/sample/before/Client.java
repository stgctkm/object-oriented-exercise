package example.rule3.sample.before;

class Client {

    String getCustomerPlanCode(String planCode) {
        return planCode.substring(3, 4) + planCode.substring(8, planCode.length());
    }

    boolean isNonPublished(String planCode) {
        return planCode.startsWith("9");
    }
}
