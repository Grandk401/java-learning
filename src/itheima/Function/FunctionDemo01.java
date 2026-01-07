package itheima.Function;

import java.util.Arrays;
import java.util.Comparator;

public class FunctionDemo01 {
    public static void main(String[] args) {
        //需求：创建一个数组进行倒序排列
        Integer[] arr = {1,3,5,2,7,9};
        //匿名内部类实现需求
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(arr));//将数组转为字符串打印
        //lambda表达式
        Arrays.sort(arr, (Integer o1, Integer o2) -> o2-o1);
        System.out.println(Arrays.toString(arr));//将数组转为字符串打印
        //方法引用
        Arrays.sort(arr,FunctionDemo01::subtraction);
        System.out.println(Arrays.toString(arr));//将数组转为字符串打印
    }
    public static int subtraction(int num1 ,int num2){
        return num2-num1;
    }
}
