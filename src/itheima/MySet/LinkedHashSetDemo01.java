package itheima.MySet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo01 {
    public static void main(String[] args) {
        Student s1 = new Student("张三",18);
        Student s2 = new Student("张3",18);
        Student s3 = new Student("张2",18);
        Student s4 = new Student("张三",18);
        LinkedHashSet<Student> it = new LinkedHashSet<>();
        it.add(s1);
        it.add(s3);
        it.add(s2);
        it.add(s4);
        System.out.println(it);
        //得到的是add顺序的输出，LinkedHashSet的存取顺序一致
    }
}
