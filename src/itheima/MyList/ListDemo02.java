package itheima.MyList;

import java.util.ArrayList;
import java.util.List;

public class ListDemo02 {
    public static void main(String[] args) {
        //List系列集合中两个删除的方法
        //1、直接删除元素
        //2、通过索引删除

        //创建集合并添加元素
        List<Integer> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list2.add("AAA");
        list2.add("BBB");
        list2.add("CCC");
        //删除元素
        list.remove(2);
        //可以发现，remove里无法直接删除int（或者说整数）类型元素，也就是重载现象，
        // idea会首先调用实参和形参一致的那个方法

        //手动装箱，手动把基本数据类型的1变成Integer类型
        Integer i= Integer.valueOf(1);
        list.remove(i);
        System.out.println(list);

        String result = list2.set(0,"QQQ");
        System.out.println(result);//返回被修改元素
        Integer i1 = list.get(0);
        System.out.println(i1);
    }
}
