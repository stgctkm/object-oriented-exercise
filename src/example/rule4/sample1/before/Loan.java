package example.rule4.sample.before;

class Loan {

    Condition condition;

    String conditionPrecedent() {
        return condition.precedent.content();
    }
}

