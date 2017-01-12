package Miscellaneous;
import java.util.*;
import java.util.Map.Entry;

public class TrieContacts {
	public static myTrieNode root;
	
	public TrieContacts()
	{
		this.root = new myTrieNode('0');
	}
	
	public void addWord(String word){
		if(word != null || !word.isEmpty())
		{
	        myTrieNode node = this.root;
	        for (char ch : word.toLowerCase().toCharArray()) {
	            node = node.getOrCreateChild(ch);
	        }
	        if (!node.isWord) { // fix - only add new words....
	            node.isWord=true;
	            
	        }
		}
    }
	
	public static ArrayList<String> getPrefixWords(myTrieNode root, String prefix)
	{
		
		  myTrieNode current = root;
	      char[] words = new char[21];
	      ArrayList<String> wordList = new ArrayList<>();
	      wordList=addFoundPrefixWords(current, words,0, wordList, prefix);
	      return wordList;

	}
	
	public static ArrayList<String> addFoundPrefixWords(myTrieNode root, char[] words, int len, ArrayList<String> wordList, String prefix)
	{
		if(root == null)
			return new ArrayList<String>();
		words[len] = root.data;
		len++;
		String prefixWord="";
		for(int i=1;i<len;i++)
			prefixWord+=words[i]+"";
		if(prefixWord.contains(prefix) || prefix.isEmpty())
			{
			if(root.isWord)
				
			Print(words, len, wordList);
			}
		
			Iterator iter = root.children.entrySet().iterator();
			while(iter.hasNext())
			{
				Entry<Character, myTrieNode> pair = (Entry<Character, myTrieNode>)iter.next();
				addFoundPrefixWords(pair.getValue(), words, len, wordList, prefix);
			}
		
		return wordList;
		
	}
	public static void Print(char[] words, int len, ArrayList<String> wordList)
	{
		String word = new String();
		for(int i=1;i<len;i++)
		{
			word+=words[i]+"";
		}
		wordList.add(word);
	}
	
	public static void main(String[] args) {
		TrieContacts t = new TrieContacts();
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		for(int i=0;i<=n;i++)
		{
			String cmd = in.nextLine();
			String[] cmdParts = cmd.split(" ");
			if(cmdParts.length == 2 && cmdParts[0]!= null && cmdParts[1]!=null)
			if(cmdParts[0].equals("add") )
				t.addWord(cmdParts[1]);
			else
				if(cmdParts[0].equals("find"))
				{
					ArrayList<String> suffix =getPrefixWords(t.root, cmdParts[1]);
			        System.out.println(suffix.size());
				}
					
        }
    }
}

class myTrieNode{
	char data;
	boolean isWord;
	LinkedHashMap<Character, myTrieNode> children = new LinkedHashMap<Character, myTrieNode>();
	public myTrieNode(char ch)
	{
		this.data = ch;
	}
	public myTrieNode getOrCreateChild(char ch)
	{
		if(this.children == null)
			this.children = new LinkedHashMap<Character, myTrieNode>();
		myTrieNode child = this.children.get(ch);
		if(child != null)
				return child;
			else
			{
				child= new myTrieNode(ch);
				this.children.put(ch, child);
			}
		
		return child;
	}	
	
	public myTrieNode getChild(char ch)
	{
		return this.children.get(ch)!= null?this.children.get(ch):null;
	}
}
