// Get a input from user 3 * 3 matrix and reverse middle row only

import java.util.*;

public class Matrix {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in); //Declare Scanner class
        System.out.print("Enter the Size of Row and Column : ");
        int n = s.nextInt(); // Get a row and column size from user
        int h = s.nextInt();
        //get a array values from user

        int[][] arr = new int[n][h];

        int i,j,m;

        System.out.print("Enter the array elements : ");

        for(i=0;i<n;i++)
            for(j=0;j<h;j++)
                arr[i][j] = s.nextInt();

        for(i=0;i<n;i++){
            for(j=0;j<h;j++){
                if(i%2!=0)
                {
                    m = (j == 0) ? 2 : (j == 2) ? 0 : 1;
                    System.out.print(arr[i][m]+" ");
                }
                else{
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.print("\n");
        } 
    }
    
}