package example.rule9.sample.before;

class Client {

    void printFullName(Name name) {
        String fullName = name.getLastName() + " " + name.getFirstName();
        System.out.println(fullName);
    }
}
