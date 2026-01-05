package itheima.MyMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapDemo02 {
    public static void main(String[] args) {
        //1,创建map集合
        Map<String,String> m =new HashMap<>();
        m.put("1","aaa");
        m.put("2","bbb");
        m.put("3","ccc");
        //2.通过键找值进行遍历
        //2.1获取所有键并把键放进单列集合中
        Set<String> strings = m.keySet();
        //2.2遍历单列集合得到每一个键(迭代器、增强for、Lambda表达式)
        for (String string : strings) {
            System.out.print(string+" ");
            String value = m.get(string);
            System.out.println(value);
        }
        System.out.println("________________");
        //3.键值对对象遍历，通过entrySet方法获取所有键值对对象返回一个单列集合，其中单列集合自动生成会有泛型限制
        Set<Map.Entry<String, String>> entries = m.entrySet();
        //3.1遍历entries集合获得每一个键值对对象
        for (Map.Entry<String, String> entry : entries) {
            //3.2利用entry调用get方法获取键值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" "+value);
        }
        System.out.println("________________");
        //4.Lambda表达式进行遍历
        m.forEach((key, value)-> System.out.println(key+" "+value));



    }
}
