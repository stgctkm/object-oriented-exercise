package example.rule8.code.sample1.after;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Person {
    Set<Course> courses = new HashSet<>();

    void initializeCourses(Set<Course> courses) {
        for (Course course : courses) {
            addCourse(course);
        }
    }

    void addCourse(Course course) {
        courses.add(course);
    }

    void removeCourse(Course course) {
        courses.remove(course);
    }

    int getNumberOfAdvancedCourses() {
        Iterator<Course> iter = courses.iterator();
        int count = 0;
        while (iter.hasNext()) {
            Course each = iter.next();
            if (each.isAdvanced()) count++;
        }
        return count;
    }

}
