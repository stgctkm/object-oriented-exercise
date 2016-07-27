package example.rule2.practice.after;

class IntermediatePoint implements PayPoint {

    int monthlyPoint;
    int middlePoint;

    public int getPoint() {
        return monthlyPoint + middlePoint;
    }
}
