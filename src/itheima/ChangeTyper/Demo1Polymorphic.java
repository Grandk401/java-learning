package itheima.ChangeTyper;

class Fu{
 public void method(){
     System.out.println("Fu...method");
 }
}
class Zi extends Fu{
    @Override
    public void method() {
        System.out.println("Zi...method");
    }
}
public class Demo1Polymorphic {
    public static void main(String[] args) {
        Fu f =new Zi();//向上转型
        Zi z =(Zi) f;//向下转型
    }
}

