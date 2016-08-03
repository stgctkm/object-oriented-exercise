package example.rule1.sample3.before;

class EmAlphabet {

    OneByteAlphabet toOneByteAlphabet(String str) {

        StringBuffer sb = new StringBuffer(str);

        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c >= 'ａ') {
                if (c <= 'ｚ') {
                    c = (char)(c - 'a' + 'ａ');
                    sb.setCharAt(i, c);
                }
            } else if (c >= 'Ａ') {
                if (c <= 'Ｚ') {
                    c = (char)(c - 'A' + 'Ａ');
                    sb.setCharAt(i, c);
                }
            }
        }

        return new OneByteAlphabet(sb.toString());
    }
}
