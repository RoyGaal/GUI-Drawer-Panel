package myGUIpanel;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JPanel;


public class WestJPanel extends JPanel implements MouseListener, ActionListener{
	
	private static final long serialVersionUID = 1L;
	private JButton shapeFC = new JButton("Filled Circle");
	private JButton shapeC = new JButton("Circle");
	private JButton shapeFR = new JButton("Filled Square");
	private JButton shapeR = new JButton("Square");
	private JButton shapeFP = new JButton("Filled Triangle");
	private JButton shapeP = new JButton("Triangle");
	private JButton draw = new JButton("Draw");


	
	public WestJPanel(){
		setBackground(Color.black);
		setLayout(new GridLayout(10,8));

		
		add(shapeFC);
		add(shapeC);
		add(shapeFR);
		add(shapeR);
		add(shapeFP);
		add(shapeP);
		add(draw);
		

        

		
		shapeFC.addActionListener(this);
		shapeC.addActionListener(this);
		shapeFR.addActionListener(this);
		shapeR.addActionListener(this);
		shapeFP.addActionListener(this);
		shapeP.addActionListener(this);
		draw.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) { 
		Object source = e.getSource();
		if(source == shapeFC){
			Drawing.shapeType = "filledCircle";
		}
		if(source == shapeC){
			Drawing.shapeType = "circle";

		}
		if(source == shapeFR){
			Drawing.shapeType = "filledRec";
		}
		if(source == shapeR){
			Drawing.shapeType = "rec";
		}
		if(source == shapeFP){
			Drawing.shapeType = "filledPoly";
		}
		if(source == shapeP){
			Drawing.shapeType = "poly";
		}
		if(source == draw){
			Drawing.shapeType = "draw";
		}
		
		/*
		if(source == inSize){
			ShowMyGUI.cp.shapeType = "inSize";
		}
		if(source == deSize){
			ShowMyGUI.cp.shapeType = "deSize";
		}
		*/
	       
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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

