package itheima.MySet;

public class StudentOfTs implements Comparable<StudentOfTs>{
    private String name;
    private int age;

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

    @Override
    public String toString() {
        return "StudentOfTs{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public StudentOfTs(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(StudentOfTs o) {
        //指定排序规则
        //比如只看年龄
        return this.getAge()-o.getAge();
    }
}
