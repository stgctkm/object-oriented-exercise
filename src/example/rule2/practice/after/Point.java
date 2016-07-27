package example.rule2.practice.after;

class Point {

    CustomerType type;

    Point(CustomerType type) {
        this.type = type;
    }

    int payPoint() {
        return type.getPoint();
    }
}
