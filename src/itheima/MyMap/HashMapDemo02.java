package itheima.MyMap;

import java.util.*;

public class HashMapDemo02 {
    public static void main(String[] args) {
        //需求：某个班级80名学生，现在投票选择景点，每个学生只能投一次，求票数最多的景点

        //先定义一个数组存储四个景点
        String[] arr = {"a","b","c","d"};
        //利用随机数模拟投票输入和结果
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80 ; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }
        //如果要统计的东西比较多，不方便使用计数器思想
        //定义map集合，利用集合统计
        HashMap<String ,Integer> hashMap =new HashMap<>();
        //这一步其实说白了就是把list集合循环遍历一遍，前面的投票是投一次a就添加一次a到list中
        //所以可以直接遍历list，把景点名和投票数（也就是在list中的存在数）分别作为键、值存储到hashmap中即可
        for (String s : list) {
            //判断当前景点在map集合中是否存在
            if(hashMap.containsKey(s)){
                //存在
                //先获取当前景点已经被投票的次数
                int count = hashMap.get(s);
                count++;
                //把新的次数添加到集合中
                hashMap.put(s,count);//覆盖原有键值对
            }else {
                //不存在
                hashMap.put(s,1);//往集合中添加新的键值对对象
            }
        }
        System.out.println(hashMap);//输出hashmap
        //求最大值，定义一个第三方变量max,获取键值对的值
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if(count>max){
                max = count;
            }
        }
        //得到最大值，但此时需要考虑
        //景点的投票次数有可能是一样的
        //对于投票次数一样的景点，一起打印输出
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            String name = entry.getKey();
            if(count == max){
                System.out.println(name+ " " +max);
            }
        }
        //注意！一个循环只做一件事！
    }
}
