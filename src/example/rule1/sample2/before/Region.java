package example.rule1.sample2.before;

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

    String dumpRegionList(){
        StringBuilder sb = new StringBuilder();
        for (Region item : values()) {
            if (!item.equals("その他")) {
                sb.append(item.name());
            }
        }
        return sb.toString();
    }

}
