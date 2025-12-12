package itheima.ShuZu;

public class DemoJiaoHuan {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        //定义一个第三方变量来实现变量数值交换
        int temp = arr[0];
        arr[0] = arr[4];
        arr[4] = temp;
        System.out.println(arr[0]);
        System.out.println(arr[4]);
    }
}
