package example.rule8.code.sample1.after;

class Course {

    String name;
    boolean advanced;

    Course(String name, boolean isAvanced) {
        this.name = name;
        this.advanced = isAvanced;
    }

    boolean isAdvanced() {
        return advanced;
    }
}
