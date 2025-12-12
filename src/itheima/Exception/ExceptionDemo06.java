package itheima.Exception;

public class ExceptionDemo06 {
    public static void main(String[] args) {
        int a =10;
        int b =0;
        
        try{
            if(a == 10){
                return;
            }
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println("除数不能为0");
        }finally {
            System.out.println("finally");
        }
        System.out.println(".......");
    }
}
