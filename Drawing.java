package myGUIpanel;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class Drawing extends JPanel implements MouseListener, MouseMotionListener{

	private static final long serialVersionUID = 1L;
	
	int x;
	int y;
	
	boolean draw = false;
	
	public static String shapeType;
	
	public static Color color;

	public static int size = 40;
	
	public int lastX=0, lastY=0;

	
	public Drawing(){
		setBackground(Color.WHITE);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		
		 int x = e.getX();
		 int y = e.getY();
		 //System.out.println("X IS " + x + ", Y IS "+y);
		 Graphics g = getGraphics();
		 Graphics g2d = (Graphics2D)g;
		 ((Graphics2D) g2d).setStroke(new BasicStroke(size - 10));//Drawing size
		 g2d.setColor(color);  //use a variable that will have the drawing color
		 //g2d.drawOval(lastX-(size/2), lastY-(size/2), size, size);
		 if(draw == true){
			 g2d.drawLine(lastX, lastY, x, y);
		 }
		 record(x,y);
	}
	protected void record(int x, int y){
		lastX = x;
		lastY = y;
	}
	
	public int getLastX(){
		return lastX;
	}
	public int getLastY(){
		return lastY;
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		record(e.getX(), e.getY());
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void mousePressed(MouseEvent e) {
		
			//times++;
			
			record(e.getX(), e.getY()); //store the lastX and lastY values
			//lastX = e.getX();
			//lastY = e.getY();
			Graphics g = getGraphics();
			Graphics2D g2d = (Graphics2D)g;
			g2d.setColor(color);
			//g2d.fillOval(lastX, lastY, circleSize, circleSize);
			// notice circle is NOT drawn around the click
			if(shapeType == "filledCircle"){
				draw = false;
				g2d.fillOval(lastX-(size/2), lastY-(size/2), size, size);
			}
			if(shapeType == "circle"){
				draw = false;
				g2d.drawOval(lastX-(size/2), lastY-(size/2), size, size);
			}
			if(shapeType == "filledRec"){
				draw = false;
				g2d.fillRect(lastX-(size/2), lastY-(size/2), size, size);
			}
			if(shapeType == "rec"){
				draw = false;
				g2d.drawRect(lastX-(size/2), lastY-(size/2), size, size);
			}
			if(shapeType == "poly"){
				draw = false;
				int [] xs =  {lastX-(size/2) ,lastX+(size/2), lastX};
			    int [] ys = {lastY-(size/2),lastY-(size/2),lastY+(size/2)};
			    g2d.drawPolygon(xs , ys,3);
			}
			if(shapeType == "filledPoly"){
				draw = false;
				int [] xs =  {lastX-(size/2) ,lastX+(size/2), lastX};
			    int [] ys = {lastY-(size/2),lastY-(size/2),lastY+(size/2)};
				g2d.fillPolygon(xs , ys,3);
			}
			if(shapeType == "draw"){
				draw = true;
			}
			
			
			
			
			//g2d.fillRect(lastX-(circleSize/2), lastY-(circleSize/2), circleSize, circleSize);//same idea for other shapes
			//draw a hollow circle
			//g2d.setStroke(new BasicStroke(10));
			//g2d.drawOval(lastX-(circleSize/2), lastY-(circleSize/2), circleSize, circleSize);
			
			//draw a triangle.... polygon
			
			
		
		
	}
	
	/*public void drawCircle(){
		Graphics g = getGraphics();
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.RED);
		g2d.fillOval(lastX-(size/2), lastY-(size/2), size, size);
	}*/
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		requestFocus();
		record(e.getX(), e.getY());
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}

