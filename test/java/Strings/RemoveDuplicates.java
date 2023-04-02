package Strings;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates
{
    public static void main(String[] args) {

        String txt = "PayPal India";

        String text = txt.toLowerCase();


        char[] charArray = text.toCharArray();

        Set<Character> charSet = new TreeSet<Character>();

        Set<Character> dupSet = new TreeSet<Character>();

        for (int i = 0; i < charArray.length; i++)

        {

            boolean dup = charSet.add(charArray[i]);
            if (!dup)
            {
                dupSet.add(charArray[i]);
            }

            if (dupSet.contains(charArray[i])==charSet.contains(charArray[i]))
            {
                charSet.remove(charArray[i]);
            }

        }


        Iterator<Character> value = charSet.iterator();
        for (int i = 0; i < charSet.size(); i++)
        {
            System.out.print(value.next());
        }



    }

}
