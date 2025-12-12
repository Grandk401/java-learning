package itheima.Exception;



public class ExceptionDemo02 {
    public static void main(String[] args) {
        int i;
        //编译异常System.out.println(i);
        //运行异常System.out.println(i/10);
        //errro错误
        //栈溢出show();
    }
    public static void show(){
        System.out.println("show......");
        String[] s = new String[1024^2];
        show();
    }
}
