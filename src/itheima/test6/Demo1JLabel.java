package itheima.test6;

import javax.swing.*;
import java.awt.*;

public class Demo1JLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        frame.setSize(524,538);
        frame.setDefaultCloseOperation(3);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);//窗口居中显示
        frame.setTitle("JLabel演示");
        //1.创建JLabel对象，展示文本
        JLabel jl1 = new JLabel("这是文字");
        jl1.setBounds(50,50,100,100);
        //2.创建JLabel对象，展示图片
        ImageIcon img = new ImageIcon("D:\\HuaweiMoveData\\Users\\22247\\Desktop\\大三上课程\\机器学习\\实验三\\实验三问题2结果.png");
        JLabel jl2 = new JLabel(img);
        jl2.setBounds(150,150,500,500);
        //3.将JLabel对象添加在面板中
        frame.getContentPane().add(jl1);
        frame.getContentPane().add(jl2);
        frame.setVisible(true);
    }
}
