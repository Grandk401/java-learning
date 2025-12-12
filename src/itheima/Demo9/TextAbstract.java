package itheima.Demo9;

public class TextAbstract {
    public static void main(String[] args) {

    }
}

abstract class Employe{
    public abstract void work();
}
class Coder{
    public void work(){
        System.out.println("编写代码");
    }
}
class Manager extends Employe{
    @Override
    public void work() {
        System.out.println("管理程序员");
    }
}