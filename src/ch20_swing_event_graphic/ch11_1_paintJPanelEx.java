package ch20_swing_event_graphic;

import javax.swing.*;
import java.awt.*;

public class ch11_1_paintJPanelEx extends JFrame {
	public ch11_1_paintJPanelEx() {
		setTitle("JPanel의 paintComponent() 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel()); 
		setSize(300,300);
		setVisible(true);
	}

	// JPanel을 상속받는 새 패널 구현
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g); 
			g.setColor(Color.BLUE); // 파란색 선택
			g.drawRect(10,10,50,50); 
			g.drawRect(50,50,50,50); 

			g.setColor(Color.MAGENTA); // 마젠타색 선택
			g.drawRect(90,90,50,50);
		}
	}

	public static void main(String [] args) {
		new ch11_1_paintJPanelEx();
	}
}
