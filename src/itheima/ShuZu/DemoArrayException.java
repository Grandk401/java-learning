package itheima.ShuZu;

public class DemoArrayException {
    public static void main(String[] args) {
        int[] arr = {5,44,33,55,22};
        int max=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
