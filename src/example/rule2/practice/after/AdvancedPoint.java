package example.rule2.practice.after;

class AdvancedPoint implements PayPoint {

    int monthlyPoint;
    int highBonus;

    public int getPoint() {
        return monthlyPoint + highBonus;
    }
}
