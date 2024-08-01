import java.util.*;
public class StringSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        sc.close();
        int c=0,i,j,i_value,j_value,ans;
        String[] str = s.split(" ");
        while(c<=str.length)
        {
            String word = str[c];
            for(i=0,j=word.length();i<word.length()/2;i++,j--)
            {
                i_value = (int) word.charAt(i);
                j_value = (int) word.charAt(j);

                ans = i_value + j_value;
                System.out.print(ans);
            }
            c = str.length + 1;
        }
    }
}