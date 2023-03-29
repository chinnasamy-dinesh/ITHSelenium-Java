package Basic;

public class MultiplicationTable
{
        public static void main(String[] args) {

            int num = 15;
            for(int i = 1; i <= 10; ++i)
            {
                System.out.printf("%d * %d = %d \n", num, i, num * i);
            }
        }
}
