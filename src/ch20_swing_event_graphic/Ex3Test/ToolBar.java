package ch20_swing_event_graphic.Ex3Test;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JToolBar;

public class ToolBar extends JToolBar {
	Buttons buttons = new Buttons();
	
	ToolBar() {
		setBackground(Color.LIGHT_GRAY);
		
				for (int i = 0; i < buttons.drawbuttons.length; i++)
			add(buttons.drawbuttons[i]);
				
		addSeparator(new Dimension(880,1));
	}
}
