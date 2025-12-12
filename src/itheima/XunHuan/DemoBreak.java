package itheima.XunHuan;

public class DemoBreak {
    public static void main(String[] args) {
        abc:for (int i = 1; i <= 15; i++) {
            if(i==5||i==10){
                break abc;
            }
            System.out.println("老师正在给第"+i+"位同学发冰棍");
        }
        System.out.println(" 1 ");
    }
}
