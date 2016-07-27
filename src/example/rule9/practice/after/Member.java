package example.rule9.practice.after;

class Member {
    Role role;

    boolean valid;

    boolean isAdmin() {
        return role == Role.ADMIN && valid;
    }
}
