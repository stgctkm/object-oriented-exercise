package example.rule3.practice.after;

class Client {

    ItemCode getCompanyItemCode(ItemCode itemCode) {
        return itemCode.forCompanyCode();
    }

    boolean isScraped(ItemCode itemCode) {
        return itemCode.isScraped();
    }
}
