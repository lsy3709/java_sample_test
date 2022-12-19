package ch20_swing_event_graphic.Ex3Test;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.Stack;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;






	class MyPanel extends JPanel {
		
		Memory memory = new Memory();
		Sketch sketch = new Sketch();
		
		Line2D.Double line;
		Rectangle2D.Double rectangle;
		Ellipse2D.Double elipse;


		Point start, end;

//		private Vector<Point> vStart = new Vector<Point>();
//		private Vector<Point> vEnd = new Vector<Point>();
//		
//		private Vector<Point> vStart2 = new Vector<Point>();
//		private Vector<Point> vEnd2 = new Vector<Point>();
		
		public MyPanel() {
			MyMouseListener listener = new MyMouseListener();

			addMouseListener(listener);
			addMouseMotionListener(listener);
			
		}
		
		class MyMouseListener extends MouseAdapter {
			public void mousePressed(MouseEvent e) {
				if(Buttons.draw[0] == true) {
					start = e.getPoint();
					sketch.sketch.add(start);
					sketch.next = sketch.sketch.size()-1;
					sketch.start.add(sketch.sketch.size()-1);
				}
				
				if(Buttons.draw[1] == true) {
					start = e.getPoint();
				}

				if(Buttons.draw[2] == true) {
					start = e.getPoint();
				}
				
			}
			
			public void mouseDragged(MouseEvent e) {
				if(Buttons.draw[0]  == true) {
					end = e.getPoint();
					sketch.sketch.add(end);
					repaint();
				}

				if (Buttons.draw[1] == true) {
					end = e.getPoint();
					line = new Line2D.Double(start.x, start.y, end.x, end.y);
					repaint();
				}

				if(Buttons.draw[2] == true) {
					end = e.getPoint();
					rectangle = new Rectangle2D.Double(Math.min(start.x, end.x), Math.min(start.y, end.y), Math.abs(start.x - end.x), Math.abs(start.y - end.y));
					repaint();
				}
				
			}
			
			public void mouseReleased(MouseEvent e) {
				if (Buttons.draw[0] == true) {
					memory.memory.push(null);
					sketch.end.add(sketch.sketch.size()-1);
				}

				if (Buttons.draw[1] == true) {
					memory.memory.push(line);
				}

				if(Buttons.draw[2] == true) {
					memory.memory.push(rectangle);
				}
			}
			
		}
		

		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			Graphics2D g2 = (Graphics2D)g;
			
		
				int sketchNum = 0;

				for(int i = 0; i < memory.memory.size(); i++) {

					if(memory.memory.get(i)  == null) {
						for (int j = sketch.start.get(sketchNum); j < sketch.end.get(sketchNum)-1; j++)
							g2.drawLine(sketch.sketch.get(j).x, sketch.sketch.get(j).y, sketch.sketch.get(j+1).x, sketch.sketch.get(j+1).y);

						sketchNum++;
					}
					else if(memory.memory.get(i).getClass().getSimpleName().equals("Clear"))
						g2.fill((Shape) memory.memory.get(i));
					else
						g2.draw((Shape)memory.memory.get(i));
				}


				if(start == null)
					return;

				else {
					
					//스케치
					if(Buttons.draw[0] == true) {
						for (int i = sketch.next; i < sketch.sketch.size() -1; i++)
							g2.drawLine(sketch.sketch.get(i).x, sketch.sketch.get(i).y, sketch.sketch.get(i+1).x, sketch.sketch.get(i+1).y);
					}

					//라인
					if(Buttons.draw[1] == true)
						g2.draw(line);

					//사각형
					if (Buttons.draw[2] == true)
						g2.draw(rectangle);

					//타원
					if (Buttons.draw[3] == true)
						g2.draw(elipse);
					
				
				}

			}
		}

	public class ch11_9_GraphicsDrawLineMouseEx3 extends JFrame {
		ToolBar toolbar = new ToolBar();
		public ch11_9_GraphicsDrawLineMouseEx3() {
			setTitle("버튼 클릭, 선,타원, 사각형,그리기 응용 예제");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(1440,800);
			add(toolbar, BorderLayout.NORTH);
			add(toolbar.buttons.canvas);
			//setContentPane(new MyPanel());
			setVisible(true);
		}

		public static void main(String [] args) {
			new ch11_9_GraphicsDrawLineMouseEx3();
		} 
}
