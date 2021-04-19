import javax.swing.JOptionPane;

public class Sum_Cont {
	public static void main(String[] args) {
		int choice;
		String strNum, strNotification = "Sum of ";
		double num, sum=0;
		
		do {
			strNum = JOptionPane.showInputDialog(null, "Please enter a real number: ", "Input real number",
	                JOptionPane.INFORMATION_MESSAGE);
			num = Double.parseDouble(strNum);
			
			sum += num;
			
			choice = JOptionPane.showConfirmDialog(null,
					"Do you want to continue entering ?","Error",
					JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
			
			strNotification += strNum + ", ";
			
		} while (choice == JOptionPane.YES_OPTION);
		
		strNotification += " is " + sum;
		
		JOptionPane.showMessageDialog(null, strNotification, "Sum of real numbers", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}	
}