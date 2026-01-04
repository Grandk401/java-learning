package itheima.MySet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo03 {
    public static void main(String[] args) {
        //1.创建集合
        TreeSet<String> ts = new TreeSet<>();
        //2.添加元素
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");
        //3.打印集合,此时默认排序
        System.out.println(ts);
        //可以使用比较器排序
        TreeSet<String> ts1 = new TreeSet<>((o1,  o2)->{
                //按长度排序，长度一样再按照字母排序
                int i = o1.length()-o2.length();
                i= i ==0 ? o1.compareTo(o2):i;
                return i;
        });
        ts1.add("c");
        ts1.add("ab");
        ts1.add("df");
        ts1.add("qwer");
        System.out.println(ts1);


    }
}
