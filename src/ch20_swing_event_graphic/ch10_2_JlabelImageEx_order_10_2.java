package ch20_swing_event_graphic;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ch10_2_JlabelImageEx_order_10_2 extends JFrame {

	public ch10_2_JlabelImageEx_order_10_2() {
		setTitle("레이블 이미지 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("라바와 gif 예제");
		
		//파일 경로 기준 기본은 프로젝트
		ImageIcon imglavar = new ImageIcon("image/라바1.png");
		JLabel imageLabel = new JLabel(imglavar);
		
		ImageIcon imgChildLook = new ImageIcon("image/childLook.gif");
		JLabel imageLabel2 = new JLabel("움직이죠?",imgChildLook,SwingConstants.CENTER);
		
		c.add(textLabel);
		c.add(imageLabel);
		c.add(imageLabel2);
		
		setSize(800,800);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ch10_2_JlabelImageEx_order_10_2();
	}

}
