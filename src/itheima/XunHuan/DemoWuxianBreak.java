package itheima.XunHuan;
import  java.util.Scanner;
public class DemoWuxianBreak {
    public static void main(String[] args) {
        System.out.println("请输入一个1-100之内的整数:");
        Scanner sc = new Scanner(System.in);
        while(true){
            int num = sc.nextInt();
            if(num>=0&&num<=100){
                System.out.println("输入正确，您输入的数字是"+num);
                break;
            }else
            {
                System.out.println("输入错误请重新输入");
            }
        }
    }
}
