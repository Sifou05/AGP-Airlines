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
	}
}
