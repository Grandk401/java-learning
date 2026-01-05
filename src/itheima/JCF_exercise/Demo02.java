package itheima.JCF_exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Demo02 {
    public static void main(String[] args) {
        //自动点名器，并且使男生被点的概率是百分之七十，女生是百分之三十
        //1.创建集合,在集合中加入7个1和3个0
        ArrayList<Integer> al1 = new ArrayList<>();
        Collections.addAll(al1,1,1,1,1,1,1,1,0,0,0);
        //2.分别创建男生和女生的集合，并往集合中添加对应的学姓名
        ArrayList<String> alb = new ArrayList<>();
        ArrayList<String> alg = new ArrayList<>();
        Collections.addAll(alb,"张三","李四","王五","赵六","钱七","张八","李九");
        Collections.addAll(alg,"张靓","李梅","王子琪","赵娟");
        //3.写一个随机数，随机到1则在男生集合中抽取姓名，0则在女生中抽取姓名
        Random m = new Random();
        int index0 = m.nextInt(al1.size());
        int num = al1.get(index0);
        if(num==1){
            Random r = new Random();
            int index = r.nextInt(alb.size());
            String name = alb.get(index);
            System.out.println(name);
        }else{
            Random r = new Random();
            int index = r.nextInt(alg.size());
            String name = alg.get(index);
            System.out.println(name);
        }

    }
}
