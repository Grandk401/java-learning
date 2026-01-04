package itheima.MySet;

import java.util.TreeSet;

public class TreeSetDemo02 {
    public static void main(String[] args) {
        //1.创建学生对象
        StudentOfTs s1 = new StudentOfTs("zhangsan",18);
        StudentOfTs s2 = new StudentOfTs("lisi",19);
        StudentOfTs s3 = new StudentOfTs("wangwu",20);
        TreeSet<StudentOfTs> ts = new TreeSet<>();
        //2.添加元素
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        //3.打印集合
        System.out.println(ts);
    }


}
