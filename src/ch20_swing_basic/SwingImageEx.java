package ch20_swing_basic;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingImageEx extends JFrame {

	public SwingImageEx() {
		setTitle(" 이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon imglavar = new ImageIcon("image/라바1.png");
		ImageIcon imgChildLook = new ImageIcon("image/childLook.gif");
		ImageIcon imgBread = new ImageIcon("image/브레드s2.png");
		
		JButton btn = new JButton(imgChildLook);
		btn.setPreferredSize(new Dimension(700,500));
		btn.setPressedIcon(imglavar);
		btn.setRolloverIcon(imgBread);
		
		
		c.add(btn);
		setSize(800,600);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new SwingImageEx();
	}

}
