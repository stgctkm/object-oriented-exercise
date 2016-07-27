package example.rule8.sample.befoer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Client {

    Person person;

    void howToUse() {
        Person kent = new Person();
        Set<Course> s = new HashSet<>();
        s.add(new Course("Smalltalk プログラミング ", false));
        s.add(new Course(" シングルモルトの味わい ", true));
        kent.setCourses(s);

        Course refact = new Course(" リファクタリング ", true);
        kent.getCourses().add(refact);
        kent.getCourses().add(new Course(" 冷酷な皮肉 ", false));
        kent.getCourses().remove(refact);
    }

    int getNumberOfAdvancedCourses() {
        Iterator iter = person.getCourses().iterator();
        int count = 0;
        while (iter.hasNext()) {
            Course each = (Course) iter.next();
            if (each.isAdvanced()) count++;
        }
        return count;
    }
}
