package Miscellaneous;

public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr ={1,2,3,5,6,7,3,4,7,3,2,6,4,7,8,3,2,5,7,4,2,1,6,9,0,3,4,2,6,5};
		System.out.println("Old length:"+arr.length);
		int j=arr.length-1;
		int val = 3;
		for(int i=0;i<arr.length && i<j;i++)
		{
			if(arr[i]==val)
			{
				while(arr[j]==val)
				{
					j--;
				}
				arr[i]=arr[j];
				j--;
			}
		}
		for(int i=0;i<j;i++)
			System.out.print(arr[i]+",");
		System.out.println("\nNew length:"+j);
		
	}

}
