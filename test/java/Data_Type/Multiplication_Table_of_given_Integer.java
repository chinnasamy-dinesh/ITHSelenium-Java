package Data_Type;

import java.util.Scanner;

public class Multiplication_Table_of_given_Integer
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the Integer for Multiplication Table: ");
        int num = sc.nextInt();
        for (int i = 1; i <=10 ; i++)
        {
            System.out.println(num+" x "+i+" = "+(num*i));
        }
    }
}
