package Miscellaneous;
import java.util.Scanner;

public class Camelcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        String s = in.next();
        int n=0;
        if(s!= null)
            n=1;
        for(int i=0;i<s.length();i++)
        {
        	char a = s.charAt(i);
            if(Character.isUpperCase(a))
                n++;
        }
        System.out.println(n);
	}

}
