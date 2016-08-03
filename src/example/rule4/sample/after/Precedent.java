package example.rule4.sample.after;

// 貸出前提条件
class Precedent {
    Content content;

    String contentValue() {
        return content.value();
    }
}
