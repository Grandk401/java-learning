package ObjectOriented.experience;
import java.util.Scanner;
public class sout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的出生年");
        int year = sc.nextInt() ;
        int age = 2025 - year;
        System.out.println("你的年龄是"+age);

    }
}
