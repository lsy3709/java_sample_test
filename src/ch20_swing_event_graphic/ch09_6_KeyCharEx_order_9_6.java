package ch20_swing_event_graphic;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ch09_6_KeyCharEx_order_9_6 extends JFrame {
	// KeyListener 활용 - 입력된 문자 키 판별
	// 컨텐트팬에 키 리스너를 달고, 포커스를 주어, 키 입력을 받도록 해야함. 
	// 색은 rgb 0~255 사이 램덤하게
	
	private JLabel la = new JLabel("<Enter>키로 배경색이 바뀜.");
	
	public ch09_6_KeyCharEx_order_9_6() {
		super("KeyListener 의 문자 키 입력 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		c.addKeyListener(new MyKeyListener());
		setSize(250,150);
		setVisible(true);
		c.setFocusable(true);//컨텐트 팬에 포커스를 받도록 설정
		c.requestFocus(); // 컨텐트 팬에 포커스 설정. 
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int r = (int) (Math.random()*256);
			int g = (int) (Math.random()*256);
			int b = (int) (Math.random()*256);
			
			switch(e.getKeyChar()){
				case '\n':
					la.setText("r = " + ", g = " + g + ", b = " + b);
					getContentPane().setBackground(new Color(r,g,b));
					break;
				case 'q':
					System.out.println("종료합니다.");
					System.exit(0);
				
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch09_6_KeyCharEx_order_9_6();
	}

}
