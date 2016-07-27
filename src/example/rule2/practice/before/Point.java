package example.rule2.practice.before;

class Point {

    CustomerType type;

    int monthlyPoint;
    int middleBonus;
    int highBonus;

    Point(CustomerType type) {
        this.type = type;
    }

    int payAmount() {
        switch (type) {
            case BEGINNER:
                return monthlyPoint;
            case INTERMEDIATE:
                return monthlyPoint + middleBonus;
            case ADVANCED:
                return monthlyPoint + highBonus;
            default:
                throw new RuntimeException("不正な顧客");
        }
    }
}
