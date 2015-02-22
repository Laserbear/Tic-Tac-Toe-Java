package demo;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Key implements KeyListener {

	private Button[] buttons;
	private boolean player1turn = true;
	
	public Key(Button[] buttons) {
		this.buttons = buttons;
	}

	
	public void keyPressed(KeyEvent e) {
		if(Character.isDigit(e.getKeyChar())) {
			for(Button button: buttons) {
			
				if(button.getName().contains(e.getKeyChar()+"")) {
					if(button.drawCircle == false && button.drawX == false) {
						if(player1turn) {
							button.drawCircle = true;
							player1turn = false;
						} else {
							button.drawX = true;
							player1turn = true;
						}
					}
					button.repaint();
				}
			}
		}
	}

	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}
	
	

}
