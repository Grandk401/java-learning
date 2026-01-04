package itheima.MySet;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class TreeSetDemo01 {
    public static void main(String[] args) {
        //1，创建集合
        TreeSet<Integer> ts = new TreeSet<>();
        //2.添加元素
        ts.add(4);
        ts.add(2);
        ts.add(3);
        ts.add(1);
        ts.add(5);
        //3.打印集合
        System.out.println(ts);
        //4.遍历
        //迭代器遍历
        System.out.println("__________");
        Iterator<Integer> it = ts.iterator();
        while(it.hasNext()){
            int i = it.next();
            System.out.println(i);
        }
        //增强for
        System.out.println("__________");

        for (Integer t : ts) {
            System.out.println(t);
        }
        //Lambda表达式
        System.out.println("__________");
        ts.forEach(integer-> System.out.println(integer));
    }
}
