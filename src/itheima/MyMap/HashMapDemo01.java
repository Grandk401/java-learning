package itheima.MyMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo01 {
    public static void main(String[] args) {
        //需求：创建一个HashMap集合并添加键学生对象，值籍贯
        //存储三个键值对元素并遍历
        //要求：同姓名且同年龄认为是同一个学生

        //1.创建学生对象
        Student s1 = new Student("zhangsan",18);
        Student s2 = new Student("lisi",18);
        Student s3 = new Student("wangwu",18);
        Student s4 = new Student("wangwu",18);

        //2.创建hashmap集合
        HashMap<Student,String> hm = new HashMap();
        hm.put(s1,"广东");
        hm.put(s2,"广东");
        hm.put(s3,"广东");
        hm.put(s4,"广东");

        //3.遍历hashmap集合
        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student stu = entry.getKey();
            String home = entry.getValue();
            System.out.println(stu+home);
        }
    }
}
