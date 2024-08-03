import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int i,j;
        char[] strArray = str.toCharArray();
        
        for(i = 0 ; i<str.length()-1;i++)
        {
            for(j=i+1;j<str.length();j++)
            {
                if(strArray[i]=='@')
                {
                    break;
                }
                else if(strArray[i]==strArray[j])
                {
                    strArray[j]='@';
                }
            }
        }

        for(i=0;i<str.length();i++)
        {
            if(strArray[i]!='@')
            {
                System.out.print(strArray[i]);
            }
        }

        s.close();

    }
    
}
