package Data_Type;

import java.util.Scanner;

public class Find_Greatest_of_2_Integer
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the First Integer: ");
        int num1 = sc.nextInt();
        System.out.print("Please Enter the First Integer: ");
        int num2 = sc.nextInt();

        if(num1>num2)
        {
            System.out.println("Given Integer "+num1+" is a Greater than "+num2+".");
        }
        else if (num1<num2)
        {
            System.out.println("Given Integer "+num2+" is a Greater than "+num1+".");
        }
        else
        {
            System.out.println("Given Integers "+num1+" & "+num2+" are equal numbers.");
        }
    }
}
