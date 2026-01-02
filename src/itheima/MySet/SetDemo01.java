package itheima.MySet;

import java.util.HashSet;
import java.util.Set;

public class SetDemo01 {
    public static void main(String[] args) {
        /*
        利用Set集合中的方法，添加字符串并使用多种方式遍历
        迭代器遍历
        增强for遍历
        Lambda表达式
         */

        //1.创建Set集合对象，Set是一个接口，要用多态的手段创建一个实现类
        Set<String> s = new HashSet<>();
        //2.添加元素（ps：通过ctr + alt + v可以快速生成接收变量
        boolean aaa = s.add("aaa");
    }
}
