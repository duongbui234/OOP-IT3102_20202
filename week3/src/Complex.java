import java.util.*;

public class Complex {
    private double real;
    private double imaginary;

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public Complex() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static void inputComplex(Complex cmp){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real part: ");
        cmp.setReal(sc.nextDouble());

        System.out.print("Enter imaginary: ");
        cmp.setImaginary(sc.nextDouble());
    }

    public static Complex SumOfTwoComplex(Complex cmp1, Complex cmp2){
        Complex sum = new Complex();

        sum.setReal(cmp1.getReal() + cmp2.getReal());
        sum.setImaginary(cmp1.getImaginary() + cmp2.getImaginary());

        return sum ;
    }

    public static Complex SubOfTwoComplex(Complex cmp1, Complex cmp2){
        Complex sub = new Complex();

        sub.setReal(cmp1.getReal() - cmp2.getReal());
        sub.setImaginary(cmp1.getImaginary() - cmp2.getImaginary());

        return sub ;
    }

    public static Complex MulOfTwoComplex(Complex cmp1, Complex cmp2){
        Complex mul = new Complex();

        double real = cmp1.getReal()*cmp2.getReal() - cmp1.getImaginary()*cmp2.getImaginary();
        double imaginary = cmp1.getReal()*cmp2.getImaginary() + cmp1.getImaginary()*cmp2.getReal();

        mul.setReal(real);
        mul.setImaginary(imaginary);

        return mul ;
    }

    public static Complex DivOfTwoComplex(Complex cmp1, Complex cmp2){
        Complex div = new Complex();

        double r1 = cmp1.getReal();
        double r2 = cmp2.getReal();
        double i1 = cmp1.getImaginary();
        double i2 = cmp2.getImaginary();

        double real = (r1*r2 + i1*i2)/(r2*r2+ i2*i2);
        double imaginary = (i1*r2 - r1*i2)/(r2*r2+ i2*i2);

        div.setReal(real);
        div.setImaginary(imaginary);

        return div ;
    }

    public static void printComplex(Complex cmp){
        System.out.print("--> Complex is: ");
        System.out.println(cmp.getReal() + " + " + cmp.getImaginary() + "i");
    }

    public static void main(String[] args){

        Complex cmp1 = new Complex();
        printComplex(cmp1);

        Complex cmp2 = new Complex(4,5);
        printComplex(cmp2);

        Complex cmp_1 = new Complex();
        Complex cmp_2 = new Complex();

        inputComplex(cmp_1);
        printComplex(cmp_1);
        inputComplex(cmp_2);
        printComplex(cmp_2);

        Complex result = new Complex();

        result = SumOfTwoComplex(cmp_1, cmp_2);
        System.out.print("Sum of two complex is: "); printComplex(result);

        result = SubOfTwoComplex(cmp_1, cmp_2);
        System.out.print("Substract of two complex is: "); printComplex(result);

        result = MulOfTwoComplex(cmp_1, cmp_2);
        System.out.print("Multiply of two complex is: "); printComplex(result);

        result = DivOfTwoComplex(cmp_1, cmp_2);
        System.out.print("Div of two complex is: "); printComplex(result);
    }
}
