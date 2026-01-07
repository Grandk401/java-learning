package itheima.Immutable;

import java.util.Iterator;
import java.util.Set;

public class ImmutableDemo02 {
    public static void main(String[] args) {
        Set<String> set = Set.of("张三","赵四","王五");//一样无法修改
        //当获取一个不可变set集合时，要保证元素唯一性
        for (Object o : set) {
            System.out.println(o);
        }
        System.out.println("-----------------");
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //增删依旧报错
        set.add("123");
        set.remove("张三");
    }
}
