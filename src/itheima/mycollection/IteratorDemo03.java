package itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo03 {
    public static void main(String[] args) {
        //创建集合并添加元素
        Collection<String> coll = new ArrayList<>();//多态写法
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        coll.add("zzz");

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
       // while(it.hasNext()){
            //next方法先获取当前元素再将箭头后移
            //String str = it.next();
            //System.out.println(str);
        //}
        //System.out.println(it.next());
        //循环结束后迭代器已经指向了没有元素的位置，因此一直是false，遍历完毕后不会复位
        //System.out.println(it.hasNext());

        //如果要使用迭代器进行第二次遍历，必须新获取一个迭代器对象
        Iterator<String> it2 = coll.iterator();
        while(it2.hasNext()){
            String str = it.next();
            //以下coll的写法会导致并行异常ConcurrentModificationException，因为没有执行迭代器的方法触发了fail-fast
            if("bbb".equals(str)){
                //coll.remove("bbb");
                it.remove();//应该使用迭代器的方法删除（添加暂时没有办法，迭代器中没有提供相关的方法）
            }
            System.out.println(str);
        }
        //安全删除

    }
}
