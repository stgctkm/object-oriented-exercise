package example.rule3.practice.after;

class ItemCode {

    String value;

    ItemCode(String value) {
        this.value = value;
    }

    ItemCode forCompanyCode() {
        return new ItemCode(value.substring(3, 4) + value.substring(8, value.length()));
    }

    boolean isScraped() {
        return value.startsWith("9");
    }
}
