package Strings;

public class RunLengthEncode {
	public static void main(String args[])
    {
        String s="wwwwaaadexxxxxx";
        runLengthEncode(s);
    }
    
    public static String runLengthEncode(String s)
    {
    	int i,j;
    	StringBuilder ans=new StringBuilder();
    	for(i=0;i<s.length();)
    	{
    		j=i;
    		char a=s.charAt(i);
    		while(j<s.length() && s.charAt(j)==a)
    			j++;
    		
    		ans.append(a);
    		ans.append(j-i+"");
    		i=j;
    	}
    	System.out.println(ans);
    	return ans.toString();
    }
}
