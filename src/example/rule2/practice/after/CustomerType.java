package example.rule2.practice.after;

enum CustomerType {

    BEGINNER(new BeginnerPoint()),
    INTERMEDIATE(new IntermediatePoint()),
    ADVANCED(new AdvancedPoint()),
    WRONG(new WrongPoint());

    private PayPoint point;

    private CustomerType(PayPoint point) {
        this.point = point;
    }

    int getPoint() {
        return point.getPoint();
    }
}
