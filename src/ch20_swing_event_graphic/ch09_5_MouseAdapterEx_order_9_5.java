package ch20_swing_event_graphic;

import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ch09_5_MouseAdapterEx_order_9_5 extends JFrame {
	private JLabel la = new JLabel("Hello");
	

	public ch09_5_MouseAdapterEx_order_9_5() {
		super();
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseAdapter());
		
		c.setLayout(null);
		la.setSize(50,20);
		la.setLocation(30,30);
		c.add(la);
		
		setSize(200,200);
		setVisible(true);
	}

	class MyMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x,y);
			System.out.println("(" +x + ", " +y+")");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch09_5_MouseAdapterEx_order_9_5();

	}

}
