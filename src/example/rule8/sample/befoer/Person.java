package example.rule8.sample.befoer;

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
