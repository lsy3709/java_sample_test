package ch20_swing_event_graphic;

import java.awt.Color;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Stack;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


 class Sketch {
	static Vector<Point> sketch = new Vector<Point>();
	static Stack<Integer> start = new Stack<Integer>();
	static Stack<Integer> end = new Stack<Integer>();
	
	static Stack<Integer> redoStart = new Stack<Integer>();
	static Stack<Integer> redoEnd = new Stack<Integer>();
	int next;
	
}

public class ch11_9_GraphicsDrawLineMouseEx3 extends JFrame {
	public ch11_9_GraphicsDrawLineMouseEx3() {
		setTitle("버튼 클릭, 선,타원, 사각형,그리기 응용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel panel1 = new MyPanel();
		setContentPane(panel1);
		setSize(300, 300);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private Vector<Point> vStart = new Vector<Point>();
		private Vector<Point> vEnd = new Vector<Point>();
		
		private Vector<Point> vStart2 = new Vector<Point>();
		private Vector<Point> vEnd2 = new Vector<Point>();
		
		int state = 0;
		
		JButton btn1 = new JButton("선");
		JButton btn2 = new JButton("타원");
		
		public MyPanel() {
		
			add(btn1);
			add(btn2);
			
			btn1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					getParent().repaint(); 
					addMouseListener(new MouseAdapter(){
						public void mousePressed(MouseEvent e) {
							state = 0;
							Point startP = e.getPoint();
							vStart.add(startP);
							
						}
						public void mouseReleased(MouseEvent e) {
							Point endP = e.getPoint();
							vEnd.add(endP);
							
							// 패널의 다시 그리기를 요청한다.
							getParent().repaint(); // 주목
							//repaint(); // 주목
						}
					});
					
				}
			});
			
	btn2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					getParent().repaint(); 
					addMouseListener(new MouseAdapter(){
						
						public void mousePressed(MouseEvent e) {
							state = 1;
							Point startP2 = e.getPoint();
							vStart2.add(startP2);
						}
						public void mouseReleased(MouseEvent e) {
							Point endP2 = e.getPoint();
							vEnd2.add(endP2);
							
							// 패널의 다시 그리기를 요청한다.
							getParent().repaint(); // 주목
							//repaint(); // 주목
						}
					});
					
				}
			});
			
			
		
			
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE); 
			if(state == 0) {
			for(int i=0; i<vStart.size(); i++) {
				Point s = vStart.elementAt(i); 
				Point e = vEnd.elementAt(i);
				
				g.drawLine((int)s.getX(), (int)s.getY(), 
								(int)e.getX(), (int)e.getY());
				
				
				} 
			
			for(int i=0; i<vStart2.size(); i++) {
				Point s2 = vStart2.elementAt(i); 
				Point e2 = vEnd2.elementAt(i);
			int x = Math.min((int)s2.getX(), (int)e2.getX());
		int y = Math.min((int)s2.getY(), (int)e2.getY());
		int width = Math.abs((int)s2.getX() - (int)e2.getX());
		int height = Math.abs((int)s2.getY() - (int)e2.getY());
		g.drawOval(x, y, width, height); // 타원 그리기
	}
			
			}
				else {
					for(int i=0; i<vStart2.size(); i++) {
						Point s2 = vStart2.elementAt(i); 
						Point e2 = vEnd2.elementAt(i);
					int x = Math.min((int)s2.getX(), (int)e2.getX());
				int y = Math.min((int)s2.getY(), (int)e2.getY());
				int width = Math.abs((int)s2.getX() - (int)e2.getX());
				int height = Math.abs((int)s2.getY() - (int)e2.getY());
				g.drawOval(x, y, width, height); // 타원 그리기
			}
		}
	}
}
	
	public static void main(String [] args) {
		new ch11_9_GraphicsDrawLineMouseEx3();
	} 


}
