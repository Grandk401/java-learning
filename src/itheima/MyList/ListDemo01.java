package itheima.MyList;

import java.util.ArrayList;
import java.util.List;

public class ListDemo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");//添加索引1的位置
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);
        //在指定的位置添加元素
        list.add(1,"QQQ");//原有的元素依次往后移动，并不覆盖原有元素
        //删除指定索引处的元素并返回;两种方法，一种看对象一种看索引
        list.remove(2);
        String remove =list.remove(0);
        System.out.println(remove);//返回删除值
        System.out.println(list);
    }
}
