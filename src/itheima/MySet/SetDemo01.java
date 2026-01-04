package itheima.MySet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class SetDemo01 {
    public static void main(String[] args) {
        /*
        利用Set集合中的方法，添加字符串并使用多种方式遍历
        迭代器遍历
        增强for遍历
        Lambda表达式
         */

        //1.创建Set集合对象，Set是一个接口，要用多态的手段创建一个实现类
        Set<String> s = new HashSet<>();
        //2.添加元素（ps：通过ctr + alt + v可以快速生成接收变量，或者alt+enter
        boolean aaa = s.add("aaa");
        s.add("bbb");
        s.add("ccc");
        System.out.println(aaa);
        //3.打印输出的时候可以发现存和取的顺序不同
        System.out.println(s);
        //4.迭代器遍历方法
        System.out.println("________________");
        Iterator<String> it = s.iterator();
        while(it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
        System.out.println("________________");
        //5.增强for遍历方法
        for (String string : s) {
            System.out.println(string);
        }
        System.out.println("________________");
        //6。Lambda表达式遍历
        s.forEach(str->System.out.println(str));
    }
}
