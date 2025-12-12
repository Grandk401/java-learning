package itheima.test;

import itheima.domain.Student;

public class TestStudent {
    public static void main(String[] args) {
        //1.空参方法创建对象，setXX方法赋值
        Student stu = new Student();
        stu.setName("李明");
        stu.setAge(10);
        System.out.println(stu.getName() + "----" + stu.getAge());
        //2. 有参构造方法创建对象，创建对象的时候直接赋值
        Student stu2 = new Student("李华",18);
        System.out.println(stu2.getName() + "----" + stu2.getAge());

    }
}
