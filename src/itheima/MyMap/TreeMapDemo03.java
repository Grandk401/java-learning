package itheima.MyMap;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class TreeMapDemo03 {
    //需求：有一个字符串aababcabcdabcde
    //统计字符串中每一个字符出现的次数，并按照以下格式输出
    //输出结果：a(5)b(4)c(3)d(2)e(1)

    public static void main(String[] args) {
        //1.定义要求字符串并使用数组存储
        String s = "aababcabcdabcde";
        //2.使用循环将字符串的每一个字符存入一个arraylist
        ArrayList<Character> al = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            al.add(c);
        }
        //3.创建一个treemap集合，键是abcde
        //值随着arraylist中每个键的出现次数增加并覆盖原有值
        TreeMap<Character, Integer> tm = new TreeMap<>();
        for (Character c : al) {
            if(tm.containsKey(c)){
                //已经存在该键
                int count = tm.get(c);//获取已有值，即已出现的次数
                count++;//自增一次并覆盖集合中的原有键值对
                tm.put(c,count);
            }else {
                //该键还未被添加
                tm.put(c,1);
            }
        }
        //4.输出结果
        Set<Map.Entry<Character, Integer>> entries = tm.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            char key = entry.getKey();
            int value = entry.getValue();
            System.out.print(key+"("+value+")");
        }
        System.out.println();
        //5.一种高效的拼接方法如下
        StringBuilder sb = new StringBuilder();
        tm.forEach(new BiConsumer<Character, Integer>() {
            @Override
            public void accept(Character key, Integer value) {
                sb.append(key).append("(").append(value).append(")");
            }
        });
        System.out.println(sb);
    }
}
