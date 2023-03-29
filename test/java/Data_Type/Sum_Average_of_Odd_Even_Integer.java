package Data_Type;

import java.util.Scanner;

public class Sum_Average_of_Odd_Even_Integer
{
    public static void main(String[] args)
    {
        int num, sumEven = 0, sumOdd = 0, avgEven = 0 , avgOdd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array:");
        num = sc.nextInt();
        int[] a = new int[num];
        System.out.print("Enter the elements of the array:");
        for(int i = 0; i < num; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.print("\nEven numbers in the give array of elements:");
        for(int i = 0; i < num; i++)
        {
            if (a[i] % 2 == 0)
            {
                System.out.print(a[i]+" ");
                sumEven = sumEven + a[i];
                avgEven++;
            }
        }
        System.out.println("\nSum of Even Numbers:"+sumEven);
        System.out.println("Average of Even Numbers:"+(sumEven/avgEven)+"\n");

        System.out.print("Odd numbers in the given array of elements:");
        for(int i = 0; i < num; i++)
            {
                if (a[i] % 2 != 0)
                {
                    System.out.print(a[i]+" ");
                    sumOdd = sumOdd + a[i];
                    avgOdd++;
                }
            }
        System.out.println("\nSum of Odd Numbers:"+sumOdd);
        System.out.println("Average of Odd Numbers:"+(sumOdd/avgOdd));
    }

}
