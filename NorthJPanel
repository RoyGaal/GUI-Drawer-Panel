package myGUIpanel;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class NorthJPanel extends JPanel implements MouseListener, ActionListener, ChangeListener{

	private static final long serialVersionUID = 1L;
	private JSlider slider = new JSlider(JSlider.HORIZONTAL, 1, 150, 40);
	
	public NorthJPanel(){
		setBackground(Color.blue);
		setLayout(new GridLayout(2,1));
		JLabel myJL = new JLabel("                                                  Change size");
		JLabel myJL2 = new JLabel(" |                    Type to write in the mouse location");
		
		slider.addChangeListener(this);
		
		add(myJL);
		add(myJL2);
		add(slider);

	}
	
	public void actionPerformed(ActionEvent e) { 
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

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		Drawing.size = slider.getValue();
	}

}
