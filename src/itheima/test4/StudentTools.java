package itheima.test4;

import java.util.Scanner;

public class StudentTools {
    //键盘录入学生信息（姓名和年龄）
    //封装为学生对象并返回
    //1.参数 2.返回值(Student)
    public Student getStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        int age = sc.nextInt();
        //将信息封装为学生对象
        //先创建学生对象
        Student stu = new Student(name,age);
        return stu;
    }
}
