package example.rule4.code.sample1.after;

class Loan {

    Condition condition;

    String conditionPrecedent() {
        return condition.precedentContent();
    }
}

