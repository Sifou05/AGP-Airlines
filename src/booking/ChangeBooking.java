package booking;

import javax.swing.*;

public class ChangeBooking extends JDialog 
{
	public ChangeBooking(JFrame mainWindow)
	{
		// modal window, we cannot go in a other window if we don't close this window
		super(mainWindow,"Change Booking",true); 
		this.setSize(1920, 1080);
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE); // release resources from window when we try to close this window
	
		JMenuBar menuBar = new JMenuBar(); // menu bar
		
		// fields of menu bar
		JMenu item1 = new JMenu("Return");
		JMenu item2 = new JMenu("One Way");
		JMenu item3 = new JMenu("Multicity");
		
		menuBar.add(item1);
		menuBar.add(item2);
		menuBar.add(item3);
		
		this.setJMenuBar(menuBar);
	}
	
}
