package itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        //细节：如果我们要王lIst集合中添加数据，那么返回值永远返回true，因为其元素运行重复
        //细节;若是set，只有不重复的时候才返回true；重复返回false
        coll.add("aaa");
        coll.add("bbb");
        System.out.println(coll);
        coll.remove("aaa");
        boolean result = coll.contains("aaa");
        System.out.println(result);
        System.out.println(coll);
        boolean s = coll.isEmpty();
        System.out.println(s);
        int size = coll.size();
        System.out.println(size);
    }
}