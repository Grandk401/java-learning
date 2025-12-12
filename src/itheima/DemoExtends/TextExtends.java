package itheima.DemoExtends;

public class TextExtends {
    public static void main(String[] args) {
        Coder c = new Coder();
        c.age = 18;
        c.name = "zhangsan";
        System.out.println(c.age);
    }
}

class Employee{
    String name;
    int  age;
    double salary;
}
class Coder extends Employee{

}
class Manager extends Employee{

}