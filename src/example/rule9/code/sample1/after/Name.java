package example.rule9.code.sample1.after;

class Name {
    String firstName;
    String lastName;

    String fullName() {
        return String.format("%s %s", lastName, firstName);
    }
}
