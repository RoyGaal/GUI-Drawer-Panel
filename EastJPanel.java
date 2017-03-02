package myGUIpanel;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

public class EastJPanel extends JPanel implements MouseListener, ActionListener{
	
	private static final long serialVersionUID = 1L;
	private JButton EastJP = new JButton("Change color");
	
	public EastJPanel(){
		setBackground(Color.gray);
		setLayout(new GridLayout(4,1));
		
		add(EastJP);
		
		
		EastJP.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) { 
		
	       Drawing.color = JColorChooser.showDialog(this,"Select a color:", Color.BLACK);  
	       DrawAndType.color = Drawing.color; 
	       
	}
	
	public void init(){
		addMouseListener(this);
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
