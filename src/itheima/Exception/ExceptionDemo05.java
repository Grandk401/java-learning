package itheima.Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo05 {
    public static void main(String[] args) {
        try {
            show();
        }catch (Exception e){
            e.getStackTrace();
        }
        System.out.println("************");
    }
    public static void show()throws ParseException{
        String str = "2025-12-10";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.parse(str);
    }
}
