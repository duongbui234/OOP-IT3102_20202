import javax.swing.JOptionPane;

public class FirstDegreeEquation {
    public static void main(String[] args) {
        String stra, strb;
        String strNotification;
        Double a, b, x;

        stra = JOptionPane.showInputDialog(null, "Enter parameters for first-degree equation ax+b=0\nPlease enter a = ",
                "Input the parameter a", JOptionPane.INFORMATION_MESSAGE);
        a = Double.parseDouble(stra);


        strb = JOptionPane.showInputDialog(null, "Enter parameters for first-degree equation ax+b=0\nPlease enter b = ",
                "Input the parameter b", JOptionPane.INFORMATION_MESSAGE);
        b = Double.parseDouble(strb);

        x = -b / a;

        strNotification = "Solution of " + stra + "x + " + strb + " = 0 is: " + x;

        JOptionPane.showMessageDialog(null, strNotification, "Solution", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
