package ch20_swing_event_graphic;

import javax.swing.*;
import java.awt.*;

public class ch11_3_GraphicsDrawLineEx extends JFrame {
	public ch11_3_GraphicsDrawLineEx() {
		setTitle("drawLine 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel5());
		setSize(300, 400);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED); // 빨간색을 선택한다.
			g.drawLine(20, 20, 100, 100);
		}
	}
	
	class MyPanel2 extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawOval(20,20,80,80);
		}
	}

	
	class MyPanel3 extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawRect(20,20,80,80);
		}
	}

	
	class MyPanel4 extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawRoundRect(20,20,120,80,40,60);
		}
	}

	
	class MyPanel5 extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawArc(20,100,80,80,90,270);
		}
	}

	
	class MyPanel6 extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);

			int []x = {80,40,80,120};
			int []y = {40,120,200,120}; 
			g.drawPolygon(x, y, 4);
		}
	}


	public static void main(String [] args) {
		new ch11_3_GraphicsDrawLineEx();
	}
}
