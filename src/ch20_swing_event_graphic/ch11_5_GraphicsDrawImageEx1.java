package ch20_swing_event_graphic;

import javax.swing.*;
import java.awt.*;

public class ch11_5_GraphicsDrawImageEx1 extends JFrame {
	public ch11_5_GraphicsDrawImageEx1() {
		setTitle("원본 크기로 원하는 위치에 이미지 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(400, 400);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("image/라바1.png");
		private Image img = icon.getImage();

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 20,20, this);
		}
	}

	public static void main(String [] args) {
		new ch11_5_GraphicsDrawImageEx1();
	}
} 
