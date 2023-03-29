package Data_Type;

import java.util.Scanner;

public class Factorial_of_Integer
{
    public static void main(String[] args)
    {
        int num, fact = 1, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the Integer to Find the Factorial: ");
        num = sc.nextInt();
            for (i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of " + num + " is: " + fact);
    }
}
