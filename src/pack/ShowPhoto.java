package pack;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ShowPhoto extends JFrame {//GUI��������ͼ������ļ�
	private static final long serialVersionUID = 1L;
	public static void showpho() {
		JFrame mainframe = new JFrame("graph");
	    JPanel cp = (JPanel) mainframe.getContentPane();
	    cp.setLayout(new BorderLayout());
	    ImageIcon background = new ImageIcon("D:\\www\\Lab4\\Lab4\\src\\graph.jpg");
	    JLabel label=new JLabel(background);
	    cp.add("Center", label);
	    mainframe.pack();
	    mainframe.setVisible(true);
		}
	}
