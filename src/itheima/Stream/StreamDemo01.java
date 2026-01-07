package itheima.Stream;

import java.util.ArrayList;

public class StreamDemo01 {
    public static void main(String[] args) {
        //需求：把所有以“张”开头的元素存储到新集合中
        //把所有“张”开头的，长度为3的元素再存储到新集合中
        //遍历打印最终结果
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张三");
        list1.add("周芷若");
        list1.add("赵六");
        list1.add("张强");
        list1.add("张三丰");
        //1.把所有以“张”开头的元素存储到新集合中
        ArrayList<String> list2 = new ArrayList<>();
        for (String name : list1) {
            if(name.startsWith("张")){
                list2.add(name);
            }
        }
        System.out.println(list2);
        System.out.println("===========================");
        //2.把所有“张”开头的，长度为3的元素再存储到新集合中
        ArrayList<String> list3 = new ArrayList<>();
        for (String name : list2) {
            if ((name.length()==3)&&name.startsWith("张")){
                list3.add(name);
            }
        }
        //3.遍历输出
        for (String name : list3) {
            System.out.println(name);
        }
        System.out.println("============================");
        //Stream流
        list1.stream().filter(name->name.startsWith("张")).filter(name->name.length()==3).forEach(name-> System.out.println(name));
    }
}
