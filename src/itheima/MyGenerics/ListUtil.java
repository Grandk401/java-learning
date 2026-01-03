package itheima.MyGenerics;

import java.util.ArrayList;

public class ListUtil {
    private ListUtil(){}
    //类中定义一个静态方法addALL用来添加多个集合的元素
    public static<E>  void addALL(ArrayList<E> list, E e1,E e2,E e3,E e4){
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
    }
    public void show(){
        System.out.println("杰哥");
    }
}
