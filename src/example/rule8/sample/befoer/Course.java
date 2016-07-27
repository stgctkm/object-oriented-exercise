package example.rule8.sample.befoer;

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
