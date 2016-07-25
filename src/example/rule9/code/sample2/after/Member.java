package example.rule9.code.sample2.after;

class Member {
    Role role;

    boolean valid;

    boolean isAdmin() {
        return role == Role.ADMIN && valid;
    }
}
