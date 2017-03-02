package myGUIpanel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class CenterJPanel extends JPanel implements ActionListener{
	
	private static final long serialVersionUID = 1L;

	private JButton clear = new JButton("Clear");
	
	//Color color;
	
	public static Drawing draw;
	
	public CenterJPanel(){
		setBackground(Color.white);
		JLabel myJL = new JLabel("");
		
		add(clear);
		add(myJL);
		
		draw = new Drawing();
		add(draw);
		
		clear.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == clear){
			setBackground(Color.white);
		}
		
	}

}
