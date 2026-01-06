package itheima.DouDiZhu1;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
    //静态代码块
    //随着类的加载而加载的，而且只执行一次
    //只有静态能访问静态
    static ArrayList<String> list = new ArrayList<>();//牌盒

    static {
        //准备牌
        String[] color = {"♠","♦","♣","❤"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        for (String c : color) {
            //C依次表示每一种花色
            for (String n : number) {
                //N依次表示每一个数字
                list.add(c + n);//代表每一张牌
            }
        }
        list.add("小王");
        list.add("大王");
    }
    public PokerGame(){
        //洗牌
        Collections.shuffle(list);
        //发牌
        //算上底牌要四个集合
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        //遍历牌盒得到每一张牌
        for (int i = 0; i < list.size(); i++) {
            //i表示索引，当做牌的序号
            String poker = list.get(i);
            if(i<=2){
                lord.add(poker);
                continue;
            }
            //给三个玩家轮流发牌
            //i%3==0的时候发给玩家1,1发给玩家2,2发给玩家3
            if(i%3==0){
                player1.add(poker);
            }else if(i%3==1){
                player2.add(poker);
            }else{
                player3.add(poker);
            }
        }
        lookPoker("底牌",lord);
        lookPoker("玩家1",player1);
        lookPoker("玩家2",player2);
        lookPoker("玩家3",player3);
    }
    //看牌,参数1是玩家，参数2是牌
    public void lookPoker(String name,ArrayList<String> list){
        System.out.print((name+":"));
        for (String poker : list) {
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
