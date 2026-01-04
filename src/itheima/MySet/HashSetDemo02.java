package itheima.MySet;

import java.util.HashSet;

public class HashSetDemo02 {
    public static void main(String[] args) {
        //创建一个存储多个学生对象的集合
        //使用程序实现在控制台遍历该集合
        //要求：学生对象的成员变量值相同时，我们认为是同一个对象
        Student s1 = new Student("张三",18);
        Student s2 = new Student("李四",18);
        Student s3 = new Student("王五",18);
        Student s4= new Student("张三",18);
        //1.创建集合
        HashSet<Student> it = new HashSet<>();
        //2.添加元素
        System.out.println(it.add(s1));
        System.out.println(it.add(s2));
        System.out.println(it.add(s3));
        System.out.println(it.add(s4));
        System.out.println(it);
        //自定义对象必须自己手动重写hashCode和equals方法才能得到预期内的结果

    }
}
