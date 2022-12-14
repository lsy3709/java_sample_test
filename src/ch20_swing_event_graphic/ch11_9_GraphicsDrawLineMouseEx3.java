package ch20_swing_event_graphic;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class ch11_9_GraphicsDrawLineMouseEx3 extends JFrame {
	public ch11_9_GraphicsDrawLineMouseEx3() {
		setTitle("버튼 클릭, 선,타원, 사각형,그리기 응용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String [] args) {
		new ch11_9_GraphicsDrawLineMouseEx3();
	} 

	class MyPanel extends JPanel {
		private Vector<Point> vStart = new Vector<Point>();
		private Vector<Point> vEnd = new Vector<Point>();
		int state = 0;
		
		public MyPanel() {
			JButton btn1 = new JButton("선");
			JButton btn2 = new JButton("타원");
			add(btn1);
			add(btn2);
			
			btn1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					addMouseListener(new MouseAdapter(){
						public void mousePressed(MouseEvent e) {
							Point startP = e.getPoint();
							vStart.add(startP);
							state = 0;
						}
						public void mouseReleased(MouseEvent e) {
							Point endP = e.getPoint();
							vEnd.add(endP);
							
							// 패널의 다시 그리기를 요청한다.
							repaint(); // 주목
						}
					});
					
				}
			});
			
	btn2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					addMouseListener(new MouseAdapter(){
						public void mousePressed(MouseEvent e) {
							Point startP = e.getPoint();
							vStart.add(startP);
							state = 1;
						}
						public void mouseReleased(MouseEvent e) {
							Point endP = e.getPoint();
							vEnd.add(endP);
							
							// 패널의 다시 그리기를 요청한다.
							repaint(); // 주목
						}
					});
					
				}
			});
			
			
		
			
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE); 
			for(int i=0; i<vStart.size(); i++) {
				Point s = vStart.elementAt(i); 
				Point e = vEnd.elementAt(i);
				if(state == 0) {
				g.drawLine((int)s.getX(), (int)s.getY(), 
								(int)e.getX(), (int)e.getY());
				}
				else {
					int x = Math.min((int)s.getX(), (int)e.getX());
				int y = Math.min((int)s.getY(), (int)e.getY());
				int width = Math.abs((int)s.getX() - (int)e.getX());
				int height = Math.abs((int)s.getY() - (int)e.getY());
				g.drawOval(x, y, width, height); // 타원 그리기
			}
		}
	}
}
}
