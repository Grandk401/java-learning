package itheima.MySet;

import org.w3c.dom.ls.LSOutput;

public class HashSetDemo01 {
    public static void main(String[] args) {
        Student s1 = new Student("张三",18);
        Student s2 = new Student("张三",18);
        //如果没有重写hashcode方法，计算出的哈希值是不同的
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        //哈希碰撞
        System.out.println("abc".hashCode());
        System.out.println("acD".hashCode());
    }
}
