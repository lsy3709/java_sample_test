package ch20_swing_event_graphic;

import javax.swing.*;
import java.awt.*;

public class ch11_2_GraphicsColorFontEx extends JFrame {
	public ch11_2_GraphicsColorFontEx() {
		setTitle("문자열, Color, Font 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(500, 500);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE); // 파란색 지정
			g.drawString("자바가 정말 재밋다.~~", 30,30);
			g.setColor(new Color(255, 0, 0)); // 빨간색 지정
			g.setFont(new Font("Arial", Font.ITALIC, 30));
			g.drawString("How much?", 30, 70);
			g.setColor(new Color(0x00ff00ff));
			for(int i=1; i<=4; i++) {
				g.setFont(new Font("Jokerman", Font.ITALIC, i*10));
				g.drawString("This much!!", 30, 60+i*40);
			}
		}
	}
	public static void main(String [] args) {
		new ch11_2_GraphicsColorFontEx();
	}
}
