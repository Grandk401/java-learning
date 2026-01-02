package itheima.MyGenerics;

public class GenericsDemo02 {
    public static void main(String[] args) {
        //这是泛型类的测试类
        MyArrayList<String> list = new MyArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);
    }
}
