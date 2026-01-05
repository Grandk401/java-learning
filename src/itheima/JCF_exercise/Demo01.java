package itheima.JCF_exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Demo01 {
    public static void main(String[] args) {
        //需求：班里有N个学生，做一个随机点名器
        //1.创建集合
        ArrayList<String> al = new ArrayList<>();
        //2.批量添加学生姓名
        Collections.addAll(al,"张三","李四","王五","赵六","钱七","张八","李九");
        //3.使用随机数
        Random r = new Random();
        int index = r.nextInt(al.size());
        String name = al.get(index);
        System.out.println(name);
    }
}
