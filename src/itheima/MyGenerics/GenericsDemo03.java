package itheima.MyGenerics;

import java.util.ArrayList;

public class GenericsDemo03 {
    public static void main(String[] args) {
        ArrayList<String> List = new ArrayList<>();
        ListUtil.addALL(List, "AAA", "BBB", "CCC", "DDD");
        System.out.println(List);

    }
}
