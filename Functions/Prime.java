package Functions; 
import java.util.*;
public class Prime {
    public int PrimeOrNot(int a)
    {
        int i;
        for(i=2;i<a;i++)
        {
            if(a%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        int n;
        System.out.print("Enter the Number Greater than 1 : ");
        while(true)
        {
            n = s.nextInt();
            if(n<=1)
            System.out.println("Invalid Number please Enter Number Greater than one : ");
            else
            break;
        }
        s.close();
        Prime ob = new Prime();
        if(ob.PrimeOrNot(n)==0)
        System.out.print("A given number is not a prime");
        else
        System.out.print("A given number is a prime");
    }
    
}
