package itheima.MySet;

import java.util.TreeSet;

public class TreeSetDemo04 {
    public static void main(String[] args) {
        //1.创建学生对象
        StudentOfTs2 s1 = new StudentOfTs2("zhangsan",23,90,99,50);
        StudentOfTs2 s2 = new StudentOfTs2("lis",24,90,98,50);
        StudentOfTs2 s3 = new StudentOfTs2("wangwu",25,95,100,30);
        StudentOfTs2 s4 = new StudentOfTs2("zhaoliu",26,60,99,70);
        StudentOfTs2 s5 = new StudentOfTs2("qianqi",26,70,80,70);
        //2.创建集合对象
        //默认ArrayList最常见
        TreeSet<StudentOfTs2> ts = new TreeSet<>();
        //3.添加对象
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        //4.打印输出集合
        for (StudentOfTs2 t : ts) {
            System.out.println(t);
        }
    }
}
