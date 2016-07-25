package example.rule9.code.sample2.after;

class Client {
    Member member;

    void doSomeAdminWork() {
        if (member.isAdmin()) {
            System.out.println("do Some Admin Work");
        }
    }

    void doOtherAdminWork() {
        if (member.isAdmin()) {
            System.out.println("do Other Admin Work");
        }
    }
}
