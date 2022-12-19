package ch20_swing_event_graphic.Ex3Test;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;





public class Buttons implements MouseListener {
	JButton[] drawbuttons = new JButton[4];
	static boolean[] draw = new boolean[4];
	static CanvasGroup canvas = new CanvasGroup();
	int canvasNum = 0;

	Buttons() {

		//반복문 아이콘 이미지가 없어서 , 일단 보류
//		for(int i = 0; i < drawbuttons.length; i++) {
//			drawbuttons[i] = new JButton("버튼"+i);
//			drawbuttons[i].setBorderPainted(false);
//			drawbuttons[i].addMouseListener(this);
//		}
		drawbuttons[0] = new JButton("자유선");
		drawbuttons[1] = new JButton("직선");
		drawbuttons[2] = new JButton("사각형");
		drawbuttons[3] = new JButton("캔버스추가");
		drawbuttons[0].addMouseListener(this);
		drawbuttons[1].addMouseListener(this);
		drawbuttons[2].addMouseListener(this);
		drawbuttons[3].addMouseListener(this);
	}
		

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton)e.getSource();

		//자유선
		if (button == drawbuttons[0])
			setDraw(button);
		// 직선
		if (button == drawbuttons[1])
			setDraw(button);
		//타원
		if (button == drawbuttons[2])
			setDraw(button);
		
		//캔버스 추가
		if (button == drawbuttons[2])
			setInit();
			addCanvas();

	
	}


	private void setDraw(JButton button) {

		for(int i = 0; i < drawbuttons.length; i++) {
			if (button == drawbuttons[i]) {
				draw[i] = true;
				drawbuttons[i].setBorderPainted(true);
			}
			else {
				draw[i] = false;
				drawbuttons[i].setBorderPainted(false);
			}
		}

	}

	private void setInit() {

		
		for(int i = 0; i < drawbuttons.length; i++) {
			draw[i] = false;
			drawbuttons[i].setBorderPainted(false);
		}

	}

	private void addCanvas() {
		MyPanel newCanvas = new MyPanel();

		newCanvas.setBackground(Color.white);
		newCanvas.setOpaque(true);

		canvas.add("canvas"+canvasNum, newCanvas);
		canvasNum++;
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}