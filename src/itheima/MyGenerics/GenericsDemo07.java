package itheima.MyGenerics;

import java.util.ArrayList;

public class GenericsDemo07 {
    public static void main(String[] args) {
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();
        method(list1);
        //泛型不具备继承性，泛型写的什么类型只能传递什么数据，以下写法都会报错
        //method(list2);
        //method(list3);
        //但是数据具备继承性，可以在list1中添加其子类对象
        list1.add(new Fu());
        list1.add(new Zi());
    }

    public static void method(ArrayList<Ye> list){

    }
}
class Ye{}
class Fu extends Ye{}
class Zi extends Fu{}

