package itheima.Stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo02 {
    public static void main(String[] args) {
        //单列集合的Stream流获取
        ArrayList<String> list  = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e");
        Stream<String> stream1 = list.stream();//成功获取到Stream并把集合中的数据放到了Stream上
        //遍历Stream的数据（中终结方法）
        stream1.forEach( s->System.out.print(s));
        System.out.println();
        //一般写法，链式编程
        list.stream().forEach(s-> System.out.print(s));
        System.out.println();
        //双列集合无法直接获取stream流，用单列集合转换即可
        HashMap<String, Integer> hm  =new HashMap<>();
        hm.put("aaa",111);
        hm.put("bbb",222);
        hm.put("ccc",333);
        //获取stream流（无法直接获取）
        Set<String> set = hm.keySet();
        set.stream().forEach(s-> System.out.print(s+" "));
        System.out.println();
        Collection<Integer> values = hm.values();
        values.stream().forEach(v-> System.out.print(v+" "));
        System.out.println();
        hm.entrySet().stream().forEach(s-> System.out.println(s));
        //数组获取stream流
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(arr).forEach(s-> System.out.println(s));
        String[] arr2 = {"1","2"};
        Arrays.stream(arr2).forEach(s-> System.out.println(s));
        //零散数据获得stream流
        Stream.of(1,2,3,4,5,"2").forEach(s-> System.out.println(s));
        //Stream.of方法中，方法的形参是一个可变参数，可以传递一对零散数据也可以传递数组
        //传入的数组必须要引用数据类型，如果是基本数据类型，会把整个数组当成一个元素放到Stream流中
    }
}
