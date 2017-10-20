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
import java.util.Random;//���������
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JButton; 

 public class MainWindow extends Frame implements ActionListener//GUI��������ע��
{	
	private static final long serialVersionUID = 1L;
	   static MainWindow frm=new MainWindow();
	   static Button btn1=new Button("չʾͼ");
	   static Button btn2=new Button("���ŽӴ�");
	   static Button btn3=new Button("�������ı�");
	   static Button btn4=new Button("���������������·��");
	   static Button btn5=new Button("�������");
	   static Button btn6=new Button("�˳�");
	   public static void main(String args[]) throws IOException
	   {
		   btn1.addActionListener(frm); // ���¼�������frm��btn1ע��
		   btn2.addActionListener(frm); // ���¼�������frm��btn2ע��
		   btn3.addActionListener(frm); // ���¼�������frm��btn3ע��
		   btn4.addActionListener(frm); // ���¼�������frm��btn1ע��
		   btn5.addActionListener(frm);
		   btn6.addActionListener(frm);// ���¼�������frm��btn2ע��
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
	      Button btn=(Button) e.getSource();  // ȡ���¼���Դ����
	      if(btn==btn1) {           // ����ǰ���btn1��ť
	    	  FunctionWindows.showDirectedGraph();
	      }
	      else if(btn==btn2)     // ����ǰ���btn2��ť
	    	  FunctionWindows.queryBridgeWordsWindow();
	      else if(btn==btn3)                     // ����ǰ���btn3��ť
	    	  FunctionWindows.generateNewTextWindow();
	      else if(btn==btn4)
	    	  FunctionWindows.calcShortestPathWindow();
	      else if(btn==btn5)
	    	  FunctionWindows.randomWalkWindow();
	      else if(btn==btn6)
	    	  frm.dispose();
	   }
	}