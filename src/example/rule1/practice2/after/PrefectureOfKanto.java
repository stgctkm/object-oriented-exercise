package example.rule1.practice2.after;

enum PrefectureOfKanto {

    茨城県,
    栃木県,
    群馬県,
    埼玉県,
    千葉県,
    東京都,
    神奈川県,
    その他;

    String dumpPrefectureList(){
        StringBuilder builder = new StringBuilder();
        appendName(builder);
        return builder.toString();
    }

    void appendName(StringBuilder builder) {
        for (PrefectureOfKanto prefecture : values()) {
            if (!isOther()) builder.append(prefecture.name());
        }
    }

    boolean isOther() {
        return this.equals(その他);
    }

}
