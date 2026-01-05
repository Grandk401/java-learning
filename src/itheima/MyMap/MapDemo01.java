package itheima.MyMap;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {
    public static void main(String[] args) {
        //1.创建map集合对象
        Map<String,String > m = new HashMap();
        //2.添加元素
        //put方法的细节：添加和覆盖
        //添加数据的时候如果键不存在就直接添加到集合中，返回null
        //如果键是存在的，会把原有键值对对象覆盖，把被覆盖的值进行返回

        m.put("1","aaa");
        m.put("2","bbb");
        m.put("3","ccc");
        //3.打印集合
        System.out.println(m);
        //4.删除元素，根据键来删除整个键值对
        m.remove("1");
        m.remove("2");
        System.out.println(m);
        //5.清空集合,无返回值
        m.clear();
        System.out.println(m);
        //6.判断是否包含元素
        boolean b = m.containsKey("1");
        boolean aaa = m.containsValue("aaa");
        System.out.println(b);
        System.out.println(aaa);
        //7.判断集合是否为空
        boolean empty = m.isEmpty();
        System.out.println(empty);
        //8.输出集合长度
        int size = m.size();
        System.out.println(size);
    }
}
