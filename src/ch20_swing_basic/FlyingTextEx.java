package ch20_swing_basic;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FlyingTextEx extends JFrame {
	// 상,하,좌,우 키를 입력하면, 문자열이 10픽셀씨 이동.

	private JPanel contentPane = new JPanel();
	private JLabel la = new JLabel("Hello");
	
	public FlyingTextEx() {
		super("상,하,좌,우 키를 이용해 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.addKeyListener(new MyKeyListener());
		
		la.setLocation(50,50);
		la.setSize(100,20);
		c.add(la);
		
		setSize(200,200);
		setVisible(true);
		
		c.setFocusable(true);//컨텐트 팬에 포커스를 받도록 설정
		c.requestFocus(); // 컨텐트 팬에 포커스 설정. 
		
	}
	
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode(); // 입력된 키코드
			
			switch(keyCode){
				case KeyEvent.VK_UP:
					la.setLocation(la.getX(), la.getY() - 10); 
					System.out.println("(" +la.getX() + ", " +la.getY()+")");
					break;
				
				case KeyEvent.VK_DOWN:
					la.setLocation(la.getX(), la.getY() + 10); 
					System.out.println("(" +la.getX() + ", " +la.getY()+")");
					break;
					
				case KeyEvent.VK_LEFT:
					la.setLocation(la.getX() - 10, la.getY()); 
					System.out.println("(" +la.getX() + ", " +la.getY()+")");
					break;
					
				case KeyEvent.VK_RIGHT:
					la.setLocation(la.getX()+ 10, la.getY()); 
					System.out.println("(" +la.getX() + ", " +la.getY()+")");
					break;
					
				case KeyEvent.VK_Q:
					System.out.println("종료합니다.");
					System.out.println("(" +la.getX() + ", " +la.getY()+")");
					System.exit(0);
				
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlyingTextEx();

	}

}
