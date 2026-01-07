package itheima.ExceptionHeiMa;

import itheima.MyMap.Student;

public class ExceptionDemo02 {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        String name = arr[0].getName();
        System.out.println(name);
    }
}
