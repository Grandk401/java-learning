package itheima.Exception;

public class ExceptionDemo07 {
    public static void main(String[] args) {
        try {
            System.out.println(getscore());
        } catch (scoreException e) {
            throw new RuntimeException(e);
        }
        System.out.println("=============");
    }

    public static double getscore() throws scoreException {
        double score = 999;
        if (score < 0 || score > 100) {
            throw new scoreException("分数不合法");
        }
        return score;
    }

}
class scoreException extends Exception {
    public scoreException() {
    }

    public scoreException(String message) {
        super(message);
    }
}
