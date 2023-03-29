package Data_Type;

import java.util.Scanner;

public class Find_Positive_Negative
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter an Integer: ");
        int num = sc.nextInt();

        if(num>0)
        {
            System.out.println("Given Integer "+num+" is a Positive Number.");
        }
        else if (num<0)
        {
            System.out.println("Given Integer "+num+" is a Negative Number.");
        }
        else
        {
            System.out.println("Given Integer "+num+" is a neither Positive nor Negative Number.");
        }
    }
}
