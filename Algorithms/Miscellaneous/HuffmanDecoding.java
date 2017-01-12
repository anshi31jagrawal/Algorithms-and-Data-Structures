package Miscellaneous;
class HuffmanNode
{
	public  int frequency; // the frequency of this tree
    public  char data;
    public  HuffmanNode left, right;
    
    HuffmanNode(char data, int freq)
    {
 	   this.data = data;
 	   this.frequency = freq;
    }

   	public String decode(String input)
   	{
   		HuffmanNode current = this;
   		String code =new String();
   		int i=0;
   		while(i<=input.length())
   			{
   			if(current.data == '\0')
   			{
   				if(input.charAt(i)=='0')
	   			{
	   				current = current.left;
	   				i++;
	   			}
	   			else if(input.charAt(i)=='1')
	   			{
	   				current = current.right;
	   				i++;
	   			}
   			}
   			else 
   				{
   				code+=current.data;
   				current=this;
   				if(i==input.length())
   	   				break;
   				}
   			}
   		return code;
   	}
}
public class HuffmanDecoding {

	public static void main(String[] args) {
		HuffmanNode htree= createHuffmanTree();
		String input= "1001011";
		String code = htree.decode(input);
		System.out.println(code);
	}

	/**
	 * This method crreates a sample Huffman tree.
	 */
	public static HuffmanNode createHuffmanTree() {
		// TODO Auto-generated method stub
		//                        {ϕ,5}
	    //                     0 /     \ 1
	    //                    {ϕ,2}   {A,3}
	    //                   0/   \1
	    //                 {B,1}  {C,1}  

	    //                    S="1001011"
		HuffmanNode root = new HuffmanNode('\0',5);
		root.left = new HuffmanNode('\0',2);
		root.right = new HuffmanNode('A',3);
		root.left.left = new HuffmanNode('B',1);
		root.left.right = new HuffmanNode('C',1);
		return root;
	}
}
