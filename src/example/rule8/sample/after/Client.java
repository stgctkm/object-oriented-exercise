package example.rule8.sample.after;

import java.util.HashSet;
import java.util.Set;

class Client {

    Person person;

    void howToUse() {
        Person kent = new Person();
        Set<Course> s = new HashSet<>();
        s.add(new Course("Smalltalk プログラミング ", false));
        s.add(new Course(" シングルモルトの味わい ", true));
        kent.initializeCourses(s);

        Course refact = new Course(" リファクタリング ", true);
        kent.addCourse(refact);
        kent.addCourse(new Course(" 冷酷な皮肉 ", false));
        kent.removeCourse(refact);
    }

    int getNumberOfAdvancedCourses() {
        return person.getNumberOfAdvancedCourses();
    }

}
