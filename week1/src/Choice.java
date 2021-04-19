import javax.swing.JOptionPane;

public class Choice{
	public static void main(String[] args) {
		int ichoice;
		String strchoice;
		
//		ichoice = JOptionPane.showConfirmDialog(null, "Do you want to move on first ?");
		ichoice = JOptionPane.showConfirmDialog(null,
				"Error. Do you want to continue ?", "Error",
				JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
		
		if (ichoice == JOptionPane.YES_OPTION) 
			strchoice = "Yes";
		else
			strchoice = "No";			
		
		JOptionPane.showMessageDialog(null, "Your choice is "+strchoice);
		
		System.exit(0);		
	}
}
