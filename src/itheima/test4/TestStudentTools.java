package itheima.test4;

public class TestStudentTools {
    public static void main(String[] args) {
        StudentTools st = new StudentTools();
        Student s =st.getStudent();
        System.out.println(s.getName()+"----"+s.getAge());
    }
}
