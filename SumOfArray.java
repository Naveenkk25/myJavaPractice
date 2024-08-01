import java.util.*;

public class SumOfArray {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int i,rem,sum = 0;
        s.close();
        for(i=0;i<n;i++){
        arr[i] = s.nextInt();
        }
        
        System.out.print("The Encoded Array is : ");
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        
        for(i=n-1 ; i>=1 ; i--)
        {
            rem = arr[i-1] - arr[i];
            arr[i-1]= rem;
        }

        System.out.print("\nThe Original Array is : ");
        for(i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        sum = sum + arr[i];
        }

        System.out.print("\nThe First element in Array : " + arr[0] + "\nSum of array :  "+sum);
    }
    
}
