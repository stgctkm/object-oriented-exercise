package example.rule4.sample1.after;

class Loan {

    Condition condition;

    String conditionPrecedent() {
        return condition.precedentContent();
    }
}

