package Data_Type;

public class First_10_Natural_Numbers
{
    public static void main(String[] args)
    {
        System.out.print("First 10 Natural Numbers: ");
        for (int i = 1; i <= 10; i++)
        {
            if (i <= 9)
            {
                System.out.print(i + ",");
            }
            if (i == 10)
            {
                System.out.println(i);
            }
        }
    }
}
