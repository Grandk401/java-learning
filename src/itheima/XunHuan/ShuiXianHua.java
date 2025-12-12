package itheima.XunHuan;

public class ShuiXianHua {
    //水仙花数是一个三位数，个位、十位、百位的数字立方和等于原数
    public static void main(String[] args) {
        int n=0;
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if (i == ge * ge * ge + shi * shi * shi + bai * bai * bai) {
                n++;
                if(n==2){
                    System.out.println(i);
                    n=0;
                }
                else{
                    System.out.print(i+" ");
                }
            }
        }
    }
}

