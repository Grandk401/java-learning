package itheima.JCF_exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class
Demo03 {
    public static void main(String[] args) {
        //班级里有n个学生，要求被点到的同学不再被点到
        //如果点完了，再次重新开始
        Scanner scanner = new Scanner(System.in);
        //1.创建两个集合，原集合不动，抽取的时候只操作被复制的集合
        ArrayList<String> al = new ArrayList<>();
        ArrayList<String> alc = new ArrayList<>();
        //2.批量添加学生姓名
        Collections.addAll(al,"张三","李四","王五","赵六","钱七","张八","李九");
        // 手动添加空元素，直到 alc.size() ≥ al.size()
        while (alc.size() < al.size()) {
            alc.add(null); // 添加null作为占位符
        }
        Collections.copy(alc,al);
        //3.使用随机数开始点名环节
        System.out.println("按n然后回车，开始抽取，按其他字母键退出");
        int count = 1;
        while(true) {
            String userInput = scanner.nextLine().trim();
            if ("n".equalsIgnoreCase(userInput)) {
                if(alc.isEmpty()){
                    System.out.println("第"+count+"轮抽取结束！重置并开始第"+(count+1)+"轮！");
                    count++;
                    while (alc.size() < al.size()) {
                        alc.add(null); // 添加null作为占位符
                    }
                    Collections.copy(alc,al);
                }
                Random r = new Random();
                int index = r.nextInt(alc.size());
                String name = alc.remove(index);//抽取到之后就在被操作的集合中移除该元素
                System.out.println("本轮抽取到 "+name);
            } else {
                System.out.println("程序已退出！");
                scanner.close();
                return;
            }
        }
    }
}
