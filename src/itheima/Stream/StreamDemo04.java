package itheima.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class StreamDemo04 {
    public static void main(String[] args) {
        //终结方法Consumer
        ArrayList<String> list =new ArrayList<>();
        Collections.addAll(list,"张1","张2","张3","张3","葛1","宋1");
        list.stream().forEach(new Consumer<String>() {
            @Override
            //Consumer的泛型表示流中的数据类型
            //s表示流的每一个数据
            //方法体中可以写对每一个数据的处理操作
            public void accept(String s) {
                System.out.println(s);
            }
        });
        //lambda表达式写法
        list.stream().forEach(s-> System.out.println(s));
        //long count()计算有多少数据
        long count = list.stream().count();
        System.out.println(count);
        //toArray收集数据并放到一个数组中,创建一个指定类型的数组
        Object[] array = list.stream().toArray();//空参写法
        System.out.println(Arrays.toString(array));//把数组遍历成字符串进行打印
        //放到指定类型数组中
        //Infunction的泛型表示具体类型的数组
        //apply的形参：流中数据的个数要跟数组的长度保持一致
        //apply的返回值：返回的具体类型的数组
        String[] array1 = list.stream().toArray(value-> new String[value]);
        System.out.println(Arrays.toString(array1));
    }
}
