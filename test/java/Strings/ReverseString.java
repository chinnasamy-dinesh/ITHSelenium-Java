package Strings;

public class ReverseString
{
    public static void main(String[] args)
    {

        String word = "I am dinesh";
        char[] ch = word.toCharArray();
        for (int i = ch.length-1; i >= 0; i--)
        {
            System.out.print(ch[i]);
        }

    }
}
