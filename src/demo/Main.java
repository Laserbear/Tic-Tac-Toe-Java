package demo;

import java.awt.GridLayout;

public class Main {

	private static Button[] buttons = new Button[9];
	
	public static void main(String[] args) {
		Frame frame = new Frame();

		frame.setLayout(new GridLayout(3,3));
		
		
		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new Button();
			buttons[i].setName("Button #"+(i+1));
			frame.add(buttons[i]);
		}
		
		frame.addKeyListener(new Key(buttons));
		frame.setVisible(true);	
	}

}