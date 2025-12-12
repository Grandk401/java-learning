package itheima.Demo12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class JF extends JFrame implements KeyListener {
    JButton j = new JButton("点一下");
    public JF(){
        intFrame();
        paintFrame();
        setVisible(true);
    }
    public void intFrame(){
        setSize(514,538);
        setLocationRelativeTo(null);//设置居中
        setLayout(null);//取消绝对容器位置，手动定义组件位置
        setDefaultCloseOperation(3);
    }
    public void paintFrame(){

        j.setBounds(0,0,100,100);
        getContentPane().add(j);
        j.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("你成功用键盘点击了按钮");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        char code = e.getKeyChar();
        System.out.println("按住了键盘"+code);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("键盘松开了");
    }
}

