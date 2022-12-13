package ch20_swing_event_graphic;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ch10_10_ComboActionEx_order_10_10 extends JFrame {
	private String[] chaName = {"라바","브레드","아이"};
	private ImageIcon [] images = {new ImageIcon("image/라바1.png"),new ImageIcon("image/브레드s2.png"),new ImageIcon("image/childLook.gif")};
	private JLabel imgLabel = new JLabel(images[0]);
	
	public ch10_10_ComboActionEx_order_10_10() {
		setTitle(" 텍스트필드와 버튼,드롭다운 리스트로 구성된 콤보박스 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox<String> combo = new JComboBox<String>(chaName);
		c.add(combo);
		c.add(imgLabel);
		
		combo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>) e.getSource();
				int index = cb.getSelectedIndex();
				imgLabel.setIcon(images[index]);
						
			}
		});
		setSize(700,400);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new ch10_10_ComboActionEx_order_10_10();
	}

}
