package itheima.test2;

import java.util.Scanner;

public class StudentTools {
    /*实现键盘录入学生信息的功能
    封装为学生对象并返回
    明群参数与返回值
     */
    public Student getStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        //将信息封装为学生对象
        Student stu = new Student(name,age);
        return stu;
    }
}
