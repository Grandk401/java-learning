package itheima.test;

public class Teacher {
    /*明确参数；明确返回值*/
    public void usePhone(Phone p){
        p.sendMessage();
        p.call("张三");

        System.out.println(p.getBrand()+ "-----"+p.getPrice());    }
}
