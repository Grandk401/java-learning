package itheima.MyList;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Collection;

public class ListDemo04 {
    public static void main(String[] args) {
        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        //2.利用增强for遍历
        for(String s:coll){
        //s就是一个第三方变量，在循环过程中会依次表示数据
            System.out.println(s);
            //修改s并不会改变集合原本的数据
        }
        //快捷生成coll.for+回车
    }
}
