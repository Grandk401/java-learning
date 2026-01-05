package itheima.MyMap;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo01 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("g",789);
        lhm.put("a",123);
        lhm.put("b",123);
        lhm.put("c",123);
        lhm.put("d",123);
        lhm.put("e",123);
        System.out.println(lhm);
    }
}
