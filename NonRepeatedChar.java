import java.util.Scanner;

public class NonRepeatedChar {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int i,j,c=0;
        char[] strArray = str.toCharArray();
        
        for(i = 0 ; i<str.length()-1;i++)
        {
            c=0;
            for(j=i+1;j<str.length();j++)
            {
                if(strArray[i]=='@')
                {
                    break;
                }
                else if(strArray[i]==strArray[j])
                {
                    strArray[j]='@';
                    c = 1;
                }
            }
            if(c==1)
            strArray[i]='@';
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

