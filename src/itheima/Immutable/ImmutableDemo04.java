package itheima.Immutable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ImmutableDemo04 {
    public static void main(String[] args) {
        HashMap<String ,String> hm  =new HashMap<>();
        hm.put("张三","南京");
        hm.put("张4","南京");
        hm.put("张5","南京");
        hm.put("张6","南京");
        hm.put("张7","南京");
        hm.put("张8","南京");
        hm.put("张9","南京");
        hm.put("张1","南京");
        //把以上键值对创建一个不可变集合
        //获取所有键值对对象，用一个数字存储
        Set<Map.Entry<String, String>> set = hm.entrySet();
        //toArray在底层会比较集合和数组的长度,作为数组存储的是整个键值对对象
        //如果集合长度>数组长度，会根据实际集合长度重新创建数组
        //如果集合<=数组，表示放得下，不会创建新的数组，直接用原来的
        Map.Entry[] array = set.toArray(new Map.Entry[0]);
        //可以用mapofentries传递创建一个不可变的map集合
        Map map = Map.ofEntries(array);
        //究极个人简化写法
        Map<Object, Object> map1 = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));
        //Java官方写法.生成一个不可变的map集合可以直接调用,jdk10以上可用
        Map<String, String> map2 = Map.copyOf(hm);
    }
}
