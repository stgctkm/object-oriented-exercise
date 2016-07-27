package example.rule3.practice.before;

class Client {

    String getCompanyItemCode(String itemCode) {
        return itemCode.substring(3, 4) + itemCode.substring(8, itemCode.length());
    }

    boolean isScraped(String itemCode) {
        return itemCode.startsWith("9");
    }
}
