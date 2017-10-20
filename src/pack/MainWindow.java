package pack;

import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.io.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;//孙旭岩添加
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JButton; 

 public class MainWindow extends Frame implements ActionListener//GUI：监听器注册
{	
	private static final long serialVersionUID = 1L;
	   static MainWindow frm=new MainWindow();
	   static Button btn1=new Button("展示图");
	   static Button btn2=new Button("求桥接词");
	   static Button btn3=new Button("生成新文本");
	   static Button btn4=new Button("计算两个单词最短路径");
	   static Button btn5=new Button("随机游走");
	   static Button btn6=new Button("退出");
	   public static void main(String args[]) throws IOException
	   {
		   btn1.addActionListener(frm); // 把事件监听器frm向btn1注册
		   btn2.addActionListener(frm); // 把事件监听器frm向btn2注册
		   btn3.addActionListener(frm); // 把事件监听器frm向btn3注册
		   btn4.addActionListener(frm); // 把事件监听器frm向btn1注册
		   btn5.addActionListener(frm);
		   btn6.addActionListener(frm);// 把事件监听器frm向btn2注册
		   frm.setTitle("Action Event");
		   frm.setLayout(null);
		   frm.setSize(900,600);
		   btn1.setBounds(350,20,200,100);
		   btn2.setBounds(50,170,200,100);
		   btn3.setBounds(650,170,200,100);
		   btn4.setBounds(200,295,200,100);
		   btn5.setBounds(500,295,200,100);
		   btn6.setBounds(250,450,400,100);
		   frm.setVisible(true);
		   frm.add(btn1);
		   frm.add(btn2);
		   frm.add(btn3);
		   frm.add(btn4);
		   frm.add(btn5); 
		   frm.add(btn6); 
		   FunctionWindows.CreateGraphWindow();
	   }
	public void actionPerformed(ActionEvent e)
	   {
	      Button btn=(Button) e.getSource();  // 取得事件来源对象
	      if(btn==btn1) {           // 如果是按下btn1按钮
	    	  FunctionWindows.showDirectedGraph();
	      }
	      else if(btn==btn2)     // 如果是按下btn2按钮
	    	  FunctionWindows.queryBridgeWordsWindow();
	      else if(btn==btn3)                     // 如果是按下btn3按钮
	    	  FunctionWindows.generateNewTextWindow();
	      else if(btn==btn4)
	    	  FunctionWindows.calcShortestPathWindow();
	      else if(btn==btn5)
	    	  FunctionWindows.randomWalkWindow();
	      else if(btn==btn6)
	    	  frm.dispose();
	   }
	}