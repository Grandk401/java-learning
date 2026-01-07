package itheima.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectDemo01 {
    public static void main(String[] args) {
        //collect方法可以收集流中的数据放到集合中
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张三-男-18","王五-男-28","赵六-女-25");
        //收集所有男性的数据
        List<String> collect = list1.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toList());
        System.out.println(collect);
        //收集数据到map集合中
        Map<String, String> collect1 = list1.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(
                s -> s.split("-")[0],
                s -> s.split("-")[2]
        ));
        System.out.println(collect1);

    }
}
