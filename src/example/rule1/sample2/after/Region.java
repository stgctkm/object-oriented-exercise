package example.rule1.sample2.after;

enum Region {

    北海道,
    東北,
    関東,
    甲信越,
    北陸,
    東海,
    関西,
    山陰ー山陽,
    四国,
    九州,
    沖縄,
    その他;

    String dumpRegionList() {
        StringBuilder builder = new StringBuilder();
        appendName(builder);
        return builder.toString();
    }

    void appendName(StringBuilder builder) {
        for (Region item : values()) {
            if (!isOther()) builder.append(item.name());
        }
    }

    boolean isOther() {
        return this.equals(その他);
    }

}
