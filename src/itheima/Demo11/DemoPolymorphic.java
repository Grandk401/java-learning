package itheima.Demo11;

public class DemoPolymorphic {
    public static void main(String[] args) {
        //当前事物是一个员工
        Employe e=new Coder();
        //房钱事物是一个程序员
        Coder c =new Coder();
    }
}
class Employe{
    public void work(){
        System.out.println("工作");
    }
}
class Coder extends Employe{
    @Override
    public void work() {
        System.out.println("程序员写代码");
    }
}