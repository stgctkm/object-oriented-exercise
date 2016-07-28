package example.rule1.sample3.after;

class EmAlphabet {

    String value;

    OneByteAlphabet toOneByteAlphabet() {

        StringBuffer target = new StringBuffer(value);
        StringBuffer result = new StringBuffer();

        for (int index = 0; index < target.length(); index++) {
            result.append(convertCharacter(target.charAt(index)));
        }

        return new OneByteAlphabet(result.toString());
    }

    char convertCharacter(char target) {
        if (isFromAtoZOfLowerCase(target)) return convertLowerCase(target);
        if (isFromAtoZOfUpperCase(target)) return convertUpperCase(target);
        return target;
    }

    boolean isFromAtoZOfLowerCase(char target) {
        return (target >= 'ａ' && target <= 'ｚ');
    }

    boolean isFromAtoZOfUpperCase(char target) {
        return (target >= 'Ａ' && target <= 'Ｚ');
    }

    char convertLowerCase(char target) {
        return (char)(target - 'a' + 'ａ');
    }

    char convertUpperCase(char target) {
        return (char)(target - 'Ａ' + 'A');
    }
}
