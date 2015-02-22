package demo;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

public class Button extends JComponent {

	public boolean drawX = false;
	public boolean drawCircle = false;
	
	private static final int xPadding = 50;
	
	public void paint(Graphics g) {
		super.paint(g);
		String title = getName();
		
	
		Graphics2D g2D = (Graphics2D) g;
		g2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			
		
		g.drawRect(0, 0, getWidth()-1, getHeight()-1);
		
		if(title != null) {
			FontMetrics fm = g.getFontMetrics();
			Rectangle2D bounds = fm.getStringBounds(title, g);
			
			g.drawString(title, (int)(getWidth()/2 - bounds.getWidth()/2), (int)(getHeight()/2 - bounds.getHeight()/4));
			
			if(drawCircle) {
				g.drawOval((int)(getWidth()/2 - bounds.getWidth()), (int)(getHeight()/2 - bounds.getWidth()), (int)bounds.getWidth()*2, (int)bounds.getWidth()*2);
			}
			
			if(drawX) {
				g.setColor(Color.red);
				g.drawLine(xPadding, xPadding, getWidth()-xPadding, getHeight()-xPadding);
				g.drawLine(getWidth()-xPadding, xPadding, xPadding, getHeight()-xPadding);
			}

		}
		
	}
	
}
