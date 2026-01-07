package itheima.Immutable;

import java.util.Map;
import java.util.Set;

public class ImmutableDemo03 {
    public static void main(String[] args) {
        Map<String, String> map = Map.of("张三", "南京", "李四", "北京");//键不能重复
        //of方法最多只能传递10个键值对，有上限
        Set<String> set = map.keySet();
        for (String s : set) {
            String value = map.get(s);
            System.out.println(s+" "+value);
        }
        System.out.println("==================");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" "+value);
        }

    }
}
