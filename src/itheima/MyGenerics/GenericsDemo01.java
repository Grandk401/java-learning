package itheima.MyGenerics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class GenericsDemo01 {
    public static void main(String[] args) {
        //没有泛型的时候集合如何存储数据？
        //如果我们没有指定数据类型，默认添加全是obj类型
        //此时可以添加任意数据类型
        //但我们获取数据的时候无法使用特有行为

        //1、创建集合对象
        ArrayList list = new ArrayList();
        //2、添加数据
        list.add(123);
        list.add("aaa");
        list.add(new Student(123,"张三"));
        //3、遍历获取集合中的元素
        Iterator it = list.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
        //多态弊端：不能访问子类特有功能，无法用obj调用引用数据类型子类的功能
        //强转数据类型还会导致报错（集合中的数据不一定就能被强转。比如Stirng不能强转成int

    }
}
