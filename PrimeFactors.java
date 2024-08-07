import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i,j,DivisorCount=0;
        if(n%2==0)
        System.out.print("2"+" ");
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                DivisorCount=0;
                for(j=2;j<=i;j++)
                {
                    if(i%j==0)
                    {
                        DivisorCount++;
                    }
                    if(DivisorCount==0)
                {
                    System.out.print(i+" ");
                }
                } 
            }
        }
    }
}