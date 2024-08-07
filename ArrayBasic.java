import java.util.*;
public class ArrayBasic {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int[] array = new int[5];

        for(int i=0 ; i<5 ;i++)
        {
            array[i] = s.nextInt();
        }
        
        for(int i=0 ; i<5 ;i++)
        {
            System.out.print(array[i] + " ");
        }

    }
    
}
