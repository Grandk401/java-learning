package itheima.domain;


public class Student {
    private String name;
    private int age;
    public Student(){}
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    //提供出成员变量的get（）和set（）方法
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}
