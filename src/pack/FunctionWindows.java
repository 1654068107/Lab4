package pack;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FunctionWindows extends Frame implements ActionListener//GUI主体框架定义
{
	private static final long serialVersionUID = 1L;
	static FunctionWindows frm1=new FunctionWindows();
	static FunctionWindows frm2=new FunctionWindows();
	static FunctionWindows frm3=new FunctionWindows();
	static FunctionWindows frm4=new FunctionWindows();
	static FunctionWindows frm5=new FunctionWindows();
	
	static Button btn11=new Button("展示");
	static Button btn12=new Button("退出");
	static TextArea txa11=new TextArea("",6,10,TextArea.SCROLLBARS_NONE);
	
	static TextArea txa211=new TextArea("",6,10,TextArea.SCROLLBARS_NONE);
	static TextArea txa212=new TextArea("",6,10,TextArea.SCROLLBARS_NONE);
	static TextArea txa22=new TextArea("",6,10,TextArea.SCROLLBARS_VERTICAL_ONLY);
	static Button btn21=new Button("确定");
	static Button btn22=new Button("退出");
	
	static TextArea txa31=new TextArea("",6,10,TextArea.SCROLLBARS_VERTICAL_ONLY);
	static TextArea txa32=new TextArea("",6,10,TextArea.SCROLLBARS_VERTICAL_ONLY);
	static Button btn31=new Button("开始生成");
	static Button btn32=new Button("退出");
	
	static TextArea txa411=new TextArea("",6,10,TextArea.SCROLLBARS_NONE);
	static TextArea txa412=new TextArea("",6,10,TextArea.SCROLLBARS_NONE);
	static TextArea txa42=new TextArea("",6,10,TextArea.SCROLLBARS_VERTICAL_ONLY);
	static Button btn41=new Button("确定");
	static Button btn42=new Button("退出");
	
	static TextArea txa51=new TextArea("",6,10,TextArea.SCROLLBARS_NONE);
	static TextArea txa52=new TextArea("",6,10,TextArea.SCROLLBARS_VERTICAL_ONLY);
	static Button btn51=new Button("游走");
	static Button btn52=new Button("退出");
	
	
	public static void CreateGraphWindow() throws IOException{//GUI：文件读取
		File f;
		String path ="";
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "仅限txt文件", "txt");//建立过滤器，只显示jpg和gif
		    chooser.setFileFilter(filter);//开始过滤
		int returnVal = chooser.showOpenDialog(null);
	    if(returnVal == JFileChooser.APPROVE_OPTION) {
	    	f=chooser.getSelectedFile();
	    	path=path+f.getPath();
	    }
	    path=path.replaceAll("\\\\","\\\\\\\\");
	    //System.out.println(path);
	    Directed_graph.CreateGraph(path);		
	}
	public static void showDirectedGraph() {//GUI：展示图窗口
	    Directed_graph.showDirectedGraph();
		frm1.setLayout(null);
		frm1.setSize(640, 480);
		btn11.addActionListener(frm1);
		btn11.setBounds(280, 160, 80, 40);
		txa11.setBounds(200, 240, 240, 40);
		btn12.addActionListener(frm1);
		btn12.setBounds(280,320, 80, 40);
		txa11.setEditable(false);
		frm1.add(btn11);
		frm1.add(btn12);
		frm1.add(txa11);
		frm1.setVisible(true);
		
	}
	public static void queryBridgeWordsWindow()//GUI：获取桥接词的窗口
	{
		frm2.setLayout(null);
		frm2.setSize(640, 480);
		btn21.addActionListener(frm2);
		btn22.addActionListener(frm2);
		txa211.setBounds(220, 80, 80, 40);
		txa212.setBounds(340, 80, 80, 40);
		btn21.setBounds(280, 160, 80, 40);
		txa22.setBounds(200, 240, 240, 40);
		btn22.setBounds(280, 320, 80, 40);
		txa22.setEditable(false);
		frm2.add(txa211);
		frm2.add(txa212);
		frm2.add(txa22);
		frm2.add(btn21);
		frm2.add(btn22);
		frm2.setVisible(true);
	}
	public static void generateNewTextWindow() {//GUI：生成新文本窗口
		frm3.setLayout(null);
		frm3.setSize(640,480);
		btn31.addActionListener(frm3);
		btn32.addActionListener(frm3);
		txa31.setBounds(100, 80, 440, 100);
		btn31.setBounds(80, 350, 80, 40);
		txa32.setBounds(100, 240, 440, 100);
		btn32.setBounds(480, 350, 80, 40);
		
		txa32.setEditable(false);
		frm3.add(txa31);
		frm3.add(txa32);
		frm3.add(btn31);
		frm3.add(btn32);
		frm3.setVisible(true);
	}
	public static void calcShortestPathWindow()//GUI：计算最短路径窗口
	{
		frm4.setLayout(null);
		frm4.setSize(640, 480);
		btn41.addActionListener(frm4);
		btn42.addActionListener(frm4);
		txa411.setBounds(220, 80, 80, 40);
		txa412.setBounds(340, 80, 80, 40);
		btn41.setBounds(280, 160, 80, 40);
		txa42.setBounds(120, 240, 400, 120);
		btn42.setBounds(280, 400, 80, 40);
		txa42.setEditable(false);
		frm4.add(txa411);
		frm4.add(txa412);
		frm4.add(txa42);
		frm4.add(btn41);
		frm4.add(btn42);
		frm4.setVisible(true);
		
	}
	public static void randomWalkWindow() {//GUI：随机游走窗口
		frm5.setLayout(null);
		frm5.setSize(640, 480);
		btn51.addActionListener(frm5);
		btn52.addActionListener(frm5);
		txa51.setBounds(200, 80, 240, 40);
		txa51.setEditable(false);
		btn51.setBounds(280, 160, 80, 40);
		txa52.setBounds(100, 240, 440, 90);
		txa52.setEditable(false);
		btn52.setBounds(280, 420, 80, 40);
		frm5.add(btn51);
		frm5.add(btn52);
		frm5.add(txa51);
		frm5.add(txa52);
		frm5.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)//GUI：主窗口
	{
		Button btn=(Button) e.getSource();
		if(btn==btn11)
		{
			//ShowPhoto.showpho();
			txa11.setText("图片已保存于D:\\www\\Lab4\\Lab4\\src\\miao.jpg");
		}
		else if(btn==btn12)
		{
			frm1.dispose();
			txa11.setText("");
		}
		else if (btn==btn21)
		{
			String temp2,word1,word2;
			word1=txa211.getText();
			word2=txa212.getText();
			if (word1!=null && word2!=null)
			{
				temp2=Directed_graph.queryBridgeWords(word1,word2);
				txa22.setText(Directed_graph.outPut2(temp2, word1, word2));
			}
			else
				txa22.setText("error!");
		}
		else if (btn==btn22){
			frm2.dispose();
			txa22.setText("");
		}
		else if(btn==btn31)
		{
			txa32.setText(Directed_graph.generateNewText(txa31.getText()));
		}
		else if(btn==btn32)
		{
			frm3.dispose();
			txa32.setText("");
		}
		else if(btn==btn41)
		{
			String temp4,word1,word2;
			StringBuffer temp4_buf;
			word1=txa411.getText();
			word2=txa412.getText();
			int flag=-1;
			if (word1.length()!=0 && word2.length()!=0)
			{
				temp4=Directed_graph.calcShortestPath(word1,word2);
				txa42.setText(Directed_graph.outPut4(temp4, word1, word2));
			}
			else if(word1.length()!=0 && word2.length()==0)
			{
				for (int i=0;i<Directed_graph.G.point_num;i++)
				{
					if (Directed_graph.G.point[i].equals(word1)==true)
					{
						flag=i;
						break;
					}
				}
				if (flag==-1)
				{
					temp4=Directed_graph.calcShortestPath(word1,Directed_graph.G.point[0]);
					txa42.setText(Directed_graph.outPut4(temp4,word1,Directed_graph.G.point[0]));
				}
				else
				{
					temp4_buf=new StringBuffer(10000);
					for (int i=0;i<Directed_graph.G.point_num-1;i++)
					{
						temp4=new String();
						if (i!=flag)
						{
							temp4=Directed_graph.calcShortestPath(word1,Directed_graph.G.point[i]);
							temp4_buf.append(Directed_graph.outPut4(temp4,word1,Directed_graph.G.point[i]));
						}
					}
					txa42.setText(temp4_buf.toString());
				}
			}
			else if(word1.length()==0 && word2.length()!=0)
			{
				for (int i=0;i<Directed_graph.G.point_num;i++)
				{
					if (Directed_graph.G.point[i].equals(word2)==true)
					{
						flag=i;
						break;
					}
				}
				if (flag==-1)
				{
					temp4=Directed_graph.calcShortestPath(word2,Directed_graph.G.point[0]);
					txa42.setText(Directed_graph.outPut4(temp4,word2,Directed_graph.G.point[0]));
				}
				else
				{
					temp4_buf=new StringBuffer();
					for (int i=0;i<Directed_graph.G.point_num;i++)
					{
						temp4=new String();
						if (i!=flag)
						{
							temp4=Directed_graph.calcShortestPath(word2,Directed_graph.G.point[i]);
							temp4_buf.append(Directed_graph.outPut4(temp4,word2,Directed_graph.G.point[i]));
						}
					}
					txa42.setText(temp4_buf.toString());
				}  
			}
			else
				txa42.setText("error!");
		}
		else if(btn==btn42){
			frm4.dispose();
			txa42.setText("");
		}
		else if(btn==btn51)
		{
			System.out.println("miao\n");
			if(Directed_graph.time==-1)
			{
				txa51.setText("这是空图  游走结束");
			}
			else if(Directed_graph.time==-2)
			{
				txa51.setText("无出边  游走结束");
			}
			else if(Directed_graph.time==-3)
			{
				txa51.setText("边重复  游走结束");
			}
			else
			{
				try {
					txa52.setText(Directed_graph.randomWalk());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
		else if(btn==btn52)
		{
			frm5.dispose();
			//System.out.println("\n" + Directed_graph.out +"\n");
			//Directed_graph.random_pos = 0;
			Directed_graph.out = "";
			Directed_graph.time=0;
			Directed_graph.visted= new int[1000][1000];
			txa51.setText("");
			txa52.setText("");
			
			//System.exit(0);
		}
	}
}