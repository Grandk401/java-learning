package itheima.MyList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class ListDemo05 {
    public static void main(String[] args) {
        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        //2.利用匿名内部类的形式进行遍历
        //底层原理：方法底层也会自己遍历集合依次得到每一个元素并把元素传递给下面的accept方法
        //s一次表示集合中的每一个数据，所以直接打印s就行
        coll.forEach(s-> System.out.println(s));
        //lambda表达式
        //()->{}
    }
}

