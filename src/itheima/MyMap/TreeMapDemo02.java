package itheima.MyMap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo02 {
    public static void main(String[] args) {
        //需求：创建一个TreeMap集合并添加键学生对象，值籍贯
        //按学生年龄升序排列，年龄一样则比较姓名，
        //同姓名且同年龄认为是同一个学生
        //由于要比较姓名和年龄，因此需要先写一个stu类
        //1.创建TreeMap集合
        TreeMap<StudentTSM,String> tm = new TreeMap<>();
        //2.创建学生对象
        StudentTSM s1 = new StudentTSM("zhangsan",18);
        StudentTSM s2 = new StudentTSM("lisi",19);
        StudentTSM s3 = new StudentTSM("wangwu",21);
        StudentTSM s4 = new StudentTSM("zhangsan",18);
        StudentTSM s5 = new StudentTSM("zhangsan",22);
        //3.添加学生键值对
        tm.put(s1,"广东");
        tm.put(s2,"广东");
        tm.put(s3,"广东");
        tm.put(s4,"广东");
        tm.put(s5,"广东");
        //4.比较规则写在了学生类中，直接输出集合
        System.out.println(tm);
        System.out.println("-----------------------------------------");
        //5.也可以自行遍历输出，更可视化
        Set<StudentTSM> studentTSMS = tm.keySet();
        for (StudentTSM studentTSM : studentTSMS) {
            System.out.print(studentTSM+" ");
            String home = tm.get(studentTSM);//get()方法根据传入的键获取相应的值并返回
            System.out.println(home);
        }

    }
}
