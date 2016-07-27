package example.rule9.sample.after;

class Name {
    String firstName;
    String lastName;

    String fullName() {
        return String.format("%s %s", lastName, firstName);
    }
}
