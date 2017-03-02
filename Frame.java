package myGUIpanel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;


public class Frame extends JFrame implements MouseListener{

	private static final long serialVersionUID = 1L;
	private NorthJPanel  np;
	private SouthJPanel  sp;
	private WestJPanel   wp;
	private EastJPanel   ep;
	public static Drawing draw;
	
	public static boolean drawShapes;
	
	boolean drawSapes;
	
	public Frame(){
		drawShapes = false;
		np = new NorthJPanel(); 
		wp = new WestJPanel(); 
		sp = new SouthJPanel();
		ep = new EastJPanel();
		draw = new Drawing();
    	
        
    	//JPanel mainContent = new JPanel();
		setLayout(new BorderLayout());
		
		addMouseListener(this);
		
		add(BorderLayout.NORTH, np);
		add(BorderLayout.SOUTH, sp);
	    add(BorderLayout.WEST, wp);
		add(BorderLayout.EAST, ep);
		add(BorderLayout.CENTER, draw);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void mousePressed(MouseEvent e){
	}
	

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
