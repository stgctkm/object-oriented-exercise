package example.rule8.code.sample1.befoer;

import java.util.Set;

class Person {
    Set<Course> courses;

    Set<Course> getCourses() {
        return courses;
    }

    void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
