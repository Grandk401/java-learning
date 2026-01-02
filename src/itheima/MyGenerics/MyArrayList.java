package itheima.MyGenerics;

import java.util.Arrays;

public class MyArrayList<E> {
    /*
        编写一个类的时候，如果不确定类型，则可以定义一个泛型类
     */
    Object[] obj = new Object[10];
    int size;
    /*
        E:不确定的类型，在类名后已经定义过了
        e：变量名，形参名
     */
    public boolean add(E e){
        obj[size] = e;
        size++;
        return true;
    }
    public E get(int index){
        return (E)obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
