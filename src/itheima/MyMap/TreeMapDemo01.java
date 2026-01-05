package itheima.MyMap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo01 {
    public static void main(String[] args) {
        //需求：键：整数表示id，值：字符串表示商品名称
        //要求：按照id升序排列（默认）、按照id降序排列（需要自定义）
        TreeMap<Integer,String> tsm = new TreeMap<>();
        tsm.put(10005,"XboxX");
        tsm.put(10002,"Ps5");
        tsm.put(10003,"Ps5pro");
        tsm.put(10007,"XboxS");
        tsm.put(10001,"Ps5slim");
        //默认就是按照键从小到大的升序排序，直接输出
        System.out.println(tsm);
        //使用Comoparator比较器在定义集合的时候指定比较规则,new一个就行
        TreeMap<Integer,String> tsm1 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            //o1是添加的对象，o2是已经在红黑树中存在的对象
            public int compare(Integer o1, Integer o2) {
                return o2-o1;//返回的是正数放后面，负数则放前面，可以理解为默认是o1-o2
            }
        });
        tsm1.put(10005,"XboxX");
        tsm1.put(10002,"Ps5");
        tsm1.put(10003,"Ps5pro");
        tsm1.put(10007,"XboxS");
        tsm1.put(10001,"Ps5slim");
        //输出集合
        System.out.println(tsm1);
    }
}
