package example.rule4.sample.after;

class Condition {

    Precedent precedent;

    String precedentContent() {
        return precedent.contentValue();
    }
}
