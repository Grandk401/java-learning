package itheima.Demo11;

public class Demo2Polymorphic {
    public static void main(String[] args) {
        Fu f = new Zi();
        System.out.println(f.NUM);
        f.show();
    }
}
class Fu{
    int NUM=10;
    public void show(){
        System.out.println("Fu...show");
    }
}
class Zi extends Fu{
   int NUM=20;
    @Override
    public void show() {
        System.out.println("Zi...show");
    }
}