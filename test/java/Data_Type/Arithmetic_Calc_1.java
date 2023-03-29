package Data_Type;

import java.util.Scanner;

public class Arithmetic_Calc_1
{
    Scanner sc = new Scanner(System.in);
    int a, b, c;
    public static void main(String[] args)
    {

        Arithmetic_Calc_1 calc = new Arithmetic_Calc_1();
        System.out.println("Addition of three Integers");
        calc.Addition();
        System.out.println("\nSubtraction of two Floats");
        calc.Subtraction();
        System.out.println("\nMultiplication of two Double");
        Multiply(123.45,43.12);

    }

    public void Addition()
    {
        System.out.print("Enter the First Int to Add: ");
        a = sc.nextInt();
        System.out.print("Enter the Second Int to Add: ");
        b = sc.nextInt();
        System.out.print("Enter the Third Int to Add: ");
        c = sc.nextInt();
        System.out.println("Sum of Three Int: "+(a+b+c));
    }

    public void Subtraction()
    {
        float a, b;
        System.out.print("Enter the First Float to Sub: ");
        a = sc.nextFloat();
        System.out.print("Enter the Second Float to Sub: ");
        b = sc.nextFloat();
        System.out.println("Subtraction of 2 Float numbers: "+(a-b));
    }

    public static void Multiply(double a, double b)
    {
        System.out.println("Multiply of 2 Double numbers: "+(a*b));
    }


}
