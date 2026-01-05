package itheima.JCF_exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Demo04 {
    //需求：集合嵌套
    //键表示省份，值表示城市，城市有多个
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        ArrayList<String> js = new ArrayList<>();
        ArrayList<String> hub = new ArrayList<>();
        ArrayList<String> heb = new ArrayList<>();
        Collections.addAll(js,"南京市","扬州市");
        Collections.addAll(hub,"武汉市","孝感市");
        Collections.addAll(heb,"石家庄市","唐山市");
        hm.put("江苏省",js);
        hm.put("湖北省",hub);
        hm.put("河北省",heb);
        System.out.println(hm);
    }
}
