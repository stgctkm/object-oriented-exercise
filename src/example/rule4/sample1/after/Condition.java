package example.rule4.sample1.after;

class Condition {

    Precedent precedent;

    String precedentContent() {
        return precedent.content();
    }
}
