import javax.swing.JOptionPane;

public class SumTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification;

        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);

        double result = num1 + num2;

        strNotification = "Sum of " + strNum1 + " and " + strNum2 + " is: " + result;

        JOptionPane.showMessageDialog(null, strNotification, "Sum of two numbers", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
