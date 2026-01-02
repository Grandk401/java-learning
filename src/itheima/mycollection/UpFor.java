package itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class UpFor {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList();
        coll.add("1");
        coll.add("2");
        coll.add("3");
        //增强for循环
        //快捷键：coll.for(集合名字+.for）
        for(String s : coll){
            System.out.println(s);
        }
        //迭代器遍历，获取迭代器之后调用其方法进行遍历
        Iterator<String> it =coll.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
        //内部类遍历
        //底层原理：该方法自己也会使用for循环根据索引遍历集合
        coll.forEach(new Consumer<String>() {
            @Override
            //S表示程序中的每一个数据
            public void accept(String s) {
                System.out.println(s);
            }
        });
        //Lambda表达式遍历：()->{}
        coll.forEach((String s)->{
            System.out.println(s);
        });




    }
}
