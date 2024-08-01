//Palindorme number
import java.util.*;

public class Palindrome {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        long  n = s.nextLong();

        long rem,sum = 0, og = n, m = n, count = 1;
        s.close();

        while(m>0)   // 123
        {
            count = count * 10;
            m/=10;
        }

        
        count /= 10;
        while(n>0)
        {
            rem = n%10;
            sum = sum + (rem * count);   
            n/=10;
            count/=10;
        }
        System.out.print(og + " "+ sum + "\n");

        if(og==sum)
        System.out.print("Given numbers is Palindrome");
        else
        System.out.print("Given number is not palindrome");
    }
}
