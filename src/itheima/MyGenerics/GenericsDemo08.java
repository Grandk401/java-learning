package itheima.MyGenerics;

import java.util.ArrayList;

public class GenericsDemo08 {
    //需求：定义一个方法，形参是一个集合，集合中的数据类型不确定
    public static void main(String[] args) {
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();
        method(list1);
        method(list2);
        method(list3);
    }
    //定义一个泛型方法则可以解决泛型不继承的问题
    //泛型方法可以接收任意数据类型，但不代表泛型本身有继承性，不管这几个类有没有继承关系都是可以被接收的
    public static<E> void method(ArrayList<E> list){

    }
    //然而我们希望本方法虽然不确定类型，以后应该只接收这几个有继承关系的类
    //此时可以使用通配符
    // ?(使用通配符还可以这样写）和method方法同语义
    public static void method1(ArrayList<?> list){

    }
    // ？表示不确定的类型，可以进行类型限定如
    // ？extends E：表示可以传递E或者E所有的子类类型
    // ？super E：表示可以传递E或者E所有的父类类型
    public static void method2(ArrayList<? extends Ye> list){

    }//此时泛型通过通配符拥有了“继承性”

}
