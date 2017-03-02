package myGUIpanel;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ShowMyGUI extends JFrame{
	
	private static final long serialVersionUID = 1L;
	public static DrawAndType cp;
	
	public ShowMyGUI(){
		JPanel mainContent = new JPanel();
		mainContent.setLayout(new BorderLayout());
		
		NorthJPanel np = new NorthJPanel();
		SouthJPanel sp = new SouthJPanel();
		EastJPanel ep = new EastJPanel();
		WestJPanel wp = new WestJPanel();
		//CenterJPanel cp = new CenterJPanel();
		//Drawing cp = new Drawing();
		cp = new DrawAndType();
		//here we will add those 5 separate JPanel instances to the 5 different regions
		mainContent.add(BorderLayout.NORTH, np);
		mainContent.add(BorderLayout.SOUTH, sp);
		mainContent.add(BorderLayout.EAST, ep);
		mainContent.add(BorderLayout.WEST, wp);
		mainContent.add(BorderLayout.CENTER, cp);
		
		add(mainContent);//add the main JPanel to the JFrame
		setSize(1000,1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	
	}

	//here we can use a main method... and create an instance of our JFrame on a separate thread...
	public static void main(String[] args){
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				ShowMyGUI myGUI = new ShowMyGUI();
			}
		});
	}
}
