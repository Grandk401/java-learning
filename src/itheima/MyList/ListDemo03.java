package itheima.MyList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo03 {
    public static void main(String[] args) {
        //创建集合并添加元素
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //迭代器遍历
        /*Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }*/

        //增强for遍历
        //下面的变量s就是一个第三方变量，在遍历的过程中它表示每一个被遍历到的元素
        /*for (String s : list) {
            System.out.println(s);
        }*/

        //Lambda表达式遍历
        //forEach方法的底层其实就是一个循环遍历，依次得到集合中的每一个元素
        //并把每一个元素传给下面的accept方法
        //accept方法的形参s依次表示集合中的每一个元素
        //list.forEach(s-> System.out.println(s));
        
        //普通for循环遍历
        //size方法和get方法还有循环结合的方式，利用索引获取集合中的每一个元素
        /*for (int i = 0; i < list.size() ;i++) {
            String s = list.get(i);
            System.out.println(s);
            
        }*/
        //列表迭代器（同样是接口），可以用列表迭代器的add方法添加，和迭代器只能删除不同

        //列表迭代器对象的获取;遍历过程中可以添加元素
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()){
            String str = it.next();
            if("bbb".equals(str)){
                it.add("qqq");
            }
        }
        System.out.println(list);
    }
}
