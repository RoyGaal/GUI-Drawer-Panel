package myGUIpanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class DrawAndType extends Drawing implements KeyListener{
	
	private static final long serialVersionUID = 1L;

	public static Color color;
	
	private FontMetrics fm;
	private int fontSize = 40;
	
	Font font = new Font("Serif", Font.ITALIC, fontSize);
	
	public DrawAndType(){
		super();
		color = (Color.black);
		addKeyListener(this);
		fm = getFontMetrics(font);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		String s = String.valueOf(e.getKeyChar());
		Graphics g = getGraphics();
		g.setColor(color); 
		g.setFont(new Font("Serif", Font.ITALIC, Drawing.size));
		fm = getFontMetrics(new Font("Serif", Font.ITALIC, Drawing.size));
		g.drawString(s, getLastX(), getLastY());
		record(getLastX() + fm.stringWidth(s), getLastY());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
