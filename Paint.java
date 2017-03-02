package myGUIpanel;

import javax.swing.JFrame;

public class Paint {
	
	public static void main(String[] args){
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run(){
				Frame frame = new Frame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setTitle("My GUI Drawer");
				frame.setSize(1000, 800);
				frame.setLocationRelativeTo(null);
				frame.setResizable(false);
				frame.setVisible(true);
			}
		});
	}

}
