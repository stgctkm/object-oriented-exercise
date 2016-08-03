package example.rule1.practice3.before;

class OneByteAlphabet {

    EmAlphabet toEmAlphabet(String str) {

        StringBuffer sb = new StringBuffer(str);

        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c >= 'a') {
                if (c <= 'z') {
                    c = (char)(c - 'ａ' + 'a');
                    sb.setCharAt(i, c);
                }
            } else if (c >= 'A') {
                if (c <= 'z') {
                    c = (char)(c - 'Ａ' + 'A');
                    sb.setCharAt(i, c);
                }
            }
        }

        return new EmAlphabet(sb.toString());
    }
}
