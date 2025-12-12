package itheima.test4;

public class Student {
    private String name;
    private int age;
    //私有成员变量
    public Student(){
    }//空参构造
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }//有参构造
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
