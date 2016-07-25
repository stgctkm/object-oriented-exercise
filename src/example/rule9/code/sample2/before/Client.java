package example.rule9.code.sample2.before;

class Client {
    Member member;
    void doSomeAdminWork() {
        if (member.getRole() == Role.ADMIN && member.isValid()) {
            System.out.println("do Some Admin Work");
        }
    }

    void doOtherAdminWork() {
        if (member.getRole() == Role.ADMIN && member.isValid()) {
            System.out.println("do Other Admin Work");
        }
    }
}
