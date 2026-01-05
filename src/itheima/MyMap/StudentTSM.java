package itheima.MyMap;

public class StudentTSM implements Comparable<StudentTSM>{
    private String name;
    private int age;

    public StudentTSM(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
        return "StudentTSM{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(StudentTSM o) {
        int i = this.getAge()-o.getAge();//按照年龄升序排序
        i = i == 0 ? this.getName().compareTo(o.getName()):i;//年龄一样时对比姓名排序，姓名一样则认为是同一个人，返回0不添加
        return i ;
    }
}
