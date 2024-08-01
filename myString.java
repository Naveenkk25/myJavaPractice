import java.util.*;

public class myString {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        String myName = s.nextLine();
        int myAge = s.nextInt();
        s.close();
        System.out.print(myName + "\n" + myAge);

    }
    
}
