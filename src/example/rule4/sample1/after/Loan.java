package example.rule4.sample.after;

class Loan {

    Condition condition;

    String conditionPrecedent() {
        return condition.precedentContent();
    }
}

