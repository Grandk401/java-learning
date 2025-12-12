package itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<Student> coll = new ArrayList<>();
        Student s1 = new Student("张三",23);
        Student s2 = new Student("李四",23);
        Student s3 = new Student("王五",25);

        coll.add(s1);
        coll.add(s2);
        coll.add(s3);

        Student s4 = new Student("张三",23);

        System.out.println(coll.contains(s4));
    }
}
