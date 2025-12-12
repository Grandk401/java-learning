package itheima.Exception;

public class ExceptionDemo03 {
    public static void main(String[] args) {
        System.out.println("第一段代码");
        int i = 10;
        String str = null;
        int[] arr = new int[3];
        //程序执行的时候出异常，JVM会帮我们处理；但JVM会直接中断程序执行
        try{
            System.out.println(i/0);
            }catch(ArithmeticException e){
            System.out.println("除数为0");
            }catch(NullPointerException e){
            System.out.println("空指针异常");
            } catch (IndexOutOfBoundsException e){
            System.out.println("数组下标异常");
            }
        System.out.println("第二段代码");
    }
}
