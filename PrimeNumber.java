import java.util.Scanner;

class Prime
{
void prime(int n)
{
    if(n==0 && n==1)
    System.out.println("number "+ n + " is Prime number");
    else
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                System.out.println("number "+ n + " is not Prime number");
                System.exit(0);
            }
        }
            System.out.println("number "+ n + " is Prime number");
    }
}
}

public class PrimeNumber {
    
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = sc.nextInt();
        Prime p = new Prime();
        sc.close();
        p.prime(number);
    }

}
