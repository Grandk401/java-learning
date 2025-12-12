package itheima.Demo6;

public class Student extends  Person{
    private  int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    //子类是不能继承到父类的构造方法进行使用的，需要手动重写
    public  Student(){

    }
    public Student(String name,int age,int score){
        super(name,age);
        this.score=score;
    }
}
