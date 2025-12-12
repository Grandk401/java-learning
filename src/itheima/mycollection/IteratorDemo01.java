package itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo01 {
    public static void main(String[] args) {
        //创建集合并添加元素
        Collection<String> coll = new ArrayList<>();//多态写法
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //获取迭代器对象，直接用之前创建的集合调用Iterator即可
        //迭代器相当于一罐箭头指向索引处

        Iterator<String> it = coll.iterator();

        /*it是iterator这个接口的实现类，接口不能被直接实例化；
        coll同理，调用coll.iterator会返回一个coll内部的iterator类型的对象，
        这个对象知道如何按顺序访问 coll 中的每一个元素；
        不能直接 new Iterator<>()，因为 Iterator 是一个接口（interface）；
        具体的实现类（如 ArrayList$Itr）是 ArrayList 内部定义的私有类；
        所以 coll.iterator() 实际上是 集合自己创建了一个内部迭代器对象并返回给你；
        这叫 “工厂方法”：集合负责生产适合自己的迭代器。
         */

        //使用循环遍历获取集合中的每一个元素
        //hasNext可以判断当前索引是否存在元素
        while(it.hasNext()){
            //next方法先获取当前元素再将箭头后移
            String str = it.next();
            System.out.println(str);
        }
    }
}
