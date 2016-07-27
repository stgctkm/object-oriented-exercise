package example.rule1.practice2.before;

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
        StringBuilder sb = new StringBuilder();
        for (PrefectureOfKanto item : values()) {
            if (!item.equals("その他")) {
                sb.append(item.name());
            }
        }
        return sb.toString();
    }

}
