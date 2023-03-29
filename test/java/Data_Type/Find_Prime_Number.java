package Data_Type;

public class Find_Prime_Number
{
    public static void main(String[] args)
    {
        int input = 7;

        int count = 0;
        //start the division from 1 and stop at 7
        for (int i = 1; i <= input; i++)
        {
            if(input % i == 0)
            {
                count++;
            }
        }

        if(count == 2)
        {
            System.out.println("Given number is prime");
        }
        else
        {
            System.out.println("Given number is  not prime");
        }

    }

}
