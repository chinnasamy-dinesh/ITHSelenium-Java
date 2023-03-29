package Strings;

public class RemoveCharactersInString
{
    public static void main(String[] args)
    {
        String str = "I am learning test automation";
        char[] removeChar = str.toCharArray();
        for (int i = 0; i < removeChar.length; i++)
        {
            System.out.println(removeChar[i]);
            if(removeChar[i]=='a')
            {
                str.replace("a","");
            }
        }
        System.out.println(str);
    }
}
