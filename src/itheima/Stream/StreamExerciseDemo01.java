package itheima.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExerciseDemo01 {
    public static void main(String[] args) {
        //定义一个集合，并添加一些整数
        //过滤奇数只留下偶数
        //并将结果保存起来

        //1.创建集合
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
        //2.使用stream流过滤奇数
        List<Integer> collect = list.stream()
                .filter(s -> s % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(collect);


    }
}
