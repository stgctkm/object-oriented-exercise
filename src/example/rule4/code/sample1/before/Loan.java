package example.rule4.code.sample1.before;

class Loan {

    Condition condition;

    String conditionPrecedent() {
        return condition.precedent.content();
    }
}

