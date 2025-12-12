package itheima.Exception;

public class ExceptionDemo08 {
    public static void main(String[] args) {

    }
    interface IPerson{
        void sleep();
    }
    class User implements IPerson{
        @Override
        public void sleep() throws NullPointerException{

        }
    }
}
