package itheima.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo03 {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        Collections.addAll(list,"张1","张2","张3","张3","葛1","宋1");
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                boolean b = s.startsWith("张");
                return b;
            }
        }).forEach(s-> System.out.println(s));
        //lambda表达式写法
        list.stream().filter(s->s.startsWith("张")).forEach(s-> System.out.println(s));
        //limit()获取前几个元素
        list.stream().limit(3).forEach(s-> System.out.println(s));
        //skip()跳过前几个元素
        list.stream().skip(2).forEach(s-> System.out.println(s));
        //distinct去重
        list.stream().distinct().forEach(s-> System.out.print(s));
        //contact合并
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"王五","赵六");
        Stream.concat(list.stream(),list2.stream()).forEach(s-> System.out.println(s));
        //map转换流中的数据类型
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3,"张三-18","王五-28");
        //Function的第一个类型表示流中原本的数据类型，第二个表示要转换成的数据类型
        //返回值表示转换后的数据
        //泛型里不能写基本数据类型
        list3.stream().map(new Function<String, Integer>() {

            @Override
            public Integer apply(String s) {
                String[] arr = s.split(("-"));
                String ageString = arr[1];
                int age = Integer.parseInt(ageString);
                return age;
            }
        }).forEach(s-> System.out.println(s));
        //map方法执行完毕后，流上的数据变成了整数
        //在foreach中，s依次表示流中的每一个整数

        //lambda表达式写法
        list3.stream().map(s->Integer.parseInt(s.split("-")[1])).forEach(s-> System.out.println(s));
    }
}
