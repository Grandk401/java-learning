package itheima.Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class FunctionDemo02 {
    public static void main(String[] args) {
        //引用静态方法
        //集合中有以下数字，把他们变成int类型
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5");
        list.stream().map(Integer::parseInt);
        System.out.println(list);
        //引用成员方法
        //格式：对象::成员方法
        //需求：集合中有一些名字，只要以张开头，名字三个字的数据
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张三三","张铭铭","陈2","王五");
        list1.stream().filter(new StreamOperationDemo01()::stringJudge).forEach(System.out::println);


    }
}
