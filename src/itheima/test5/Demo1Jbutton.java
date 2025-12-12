package itheima.test5;

import javax.swing.*;

public class Demo1Jbutton {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("JButton按钮演示");
        frame.setSize(514,538);
        frame.setLocationRelativeTo(null);
        frame.setAlwaysOnTop(true);
        frame.setDefaultCloseOperation(3);//设置窗体关闭模式

        //1.通过窗体对象，取消默认布局
        frame.setLayout(null);
        //2.创建按钮对象
        JButton button = new JButton("Hello World");
        button.setBounds(50,50,100,100);//手动确定组件位置
        JButton button2 = new JButton("Hello World");
        button2.setBounds(150,150,100,100);
        //3.通过窗体对象获取到面板对象，并调用add方法添加按钮组件
        frame.getContentPane().add(button);
        frame.getContentPane().add(button2);
        frame.setVisible(true);//设置窗体可见
    }
}
