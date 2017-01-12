package Miscellaneous;

public class NumberPalindrome {

	public static void main(String[] args) {
		int num=11;
		int numCopy=num;
		if(num<0)
		{
			System.out.println("False");
			return;
		}
		int revNum=0;
		int i=0;
		int digit=0;
		
		while(true)
		{
			digit=num%10;
			revNum=revNum*10+digit;
			num/=10;
			i++;
			if(num==0)
				break;
		}
		System.out.println(revNum);
		if(numCopy==revNum)
			System.out.println("True");
		else
			System.out.println("False");
		
	}

}
