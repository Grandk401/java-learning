package itheima.Demo7;

public class TextDemo7 {
    public static void main(String[] args) {
        final int NUM=10;
        final int NUM_TWO=10;
    }
    class Fu{
        public void method(){
            System.out.println("父类的method方法");
        }
    }
    class Zi extends Fu{
        public void show(){
         method();
        }
        @Override
        public void method(){
            System.out.println("子类的method方法");
        }


    }
}
