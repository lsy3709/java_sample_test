package ch20_swing_basic;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventAllEx extends JFrame {
	// 마우스 이벤트 처리 실행.
	// 컨텐트 팬에 들어오거나 나가면 색이 변경.
	// 드래그 및 , 프레스 등을 했을 때 제목에 좌표값 표기.
	
	private JLabel la = new JLabel("Move Me");
	private JButton b = new JButton("clicked");
//	private JCheckBox checkBox = new JCheckBox("pressed");
	
	
	
	public MouseEventAllEx() {
		setTitle("MouseListener와 Mouse MotionListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		
		c.setLayout(null);
		
		la.setSize(80,20);
		la.setLocation(100,80);
		
		
//		checkBox.setSize(80,20);
//		checkBox.setLocation(100,100);
		
		b.setSize(80,20);
		b.setLocation(100,120);
//		b.setBackground(Color.BLUE);
		
		
		c.add(la);
		c.add(b);
//		c.add(checkBox);
		
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b2 =  (JButton) e.getSource();
				if(b2.getText().equals("clicked")) {
					b2.setText("클릭했음!! 버튼색도 변경됨.");
//					Color color =b2.getBackground();
//					System.out.println(color.getRed());
//					System.out.println(color.getGreen());
//					System.out.println(color.getBlue());
					b2.setBackground(Color.ORANGE);
				} else {
					b2.setText("clicked");
					b2.setBackground(new Color(238,238,238));
				}
			}
		});
		
		setSize(300,200);
		setVisible(true);
		
		
	
	}
	

	
	
	class MyMouseListener implements MouseListener, MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			la.setLocation(e.getX(),e.getY());
			setTitle("mouseDragged("+e.getX()+ "," + e.getY()+ ")");
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			la.setLocation(e.getX(),e.getY());
			setTitle("mouseMoved("+e.getX()+ "," + e.getY()+ ")");
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			b.setLocation(e.getX(),e.getY());
			setTitle("mouseClicked("+e.getX()+ "," + e.getY()+ ")");
		}

		@Override
		public void mousePressed(MouseEvent e) {
//			checkBox.setLocation(e.getX(),e.getY());
//			setTitle("mousePressed("+e.getX()+ "," + e.getY()+ ")");			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			la.setLocation(e.getX(),e.getY());
			setTitle("mouseReleased("+e.getX()+ "," + e.getY()+ ")");
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			Component comp = (Component) e.getSource();
				comp.setBackground(Color.CYAN);
		}
			

		@Override
		public void mouseExited(MouseEvent e) {
			Component comp = (Component) e.getSource();
			comp.setBackground(Color.YELLOW);
			
			setTitle("mouseExited("+e.getX()+ "," + e.getY()+ ")");
		}
		
	}
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEventAllEx();
	}

}
