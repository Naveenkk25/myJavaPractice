import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        String str_1 = s.next();
        String str_2 = s.next();
        s.close();
    
        char[] charArray1 = str_1.toCharArray();
        Arrays.sort(charArray1);
        char[] charArray2 = str_2.toCharArray();
        Arrays.sort(charArray2);

        if(Arrays.equals(charArray1, charArray2))
            System.out.print("Both the strings are Anagram");
        else
            System.out.print("Both strings are not anagram");
    }
}
