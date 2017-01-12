package Miscellaneous;
import java.util.*;
import java.util.Map.Entry;

public class Trie {
	public static TrieNode root;
	private int size =0;
	private int depth = 0;
	
	public Trie()
	{
		this.root = new TrieNode('0');
	}
	
	public void addWord(String word){
        TrieNode node = this.root;
        int wdepth = 0;
        for (char ch : word.toLowerCase().toCharArray()) {
            node = node.getOrCreateChild(ch);
            wdepth++;
        }
        if (!node.isWord) { // fix - only add new words....
            node.setWord();
            size++;
            if (wdepth > depth) {
                depth = wdepth;
            }
        }
    }
	
	public boolean containsWord(String s)
	{
		TrieNode current = this.root;
		if(s==null || s.isEmpty())
			return true;
		char[] s_chars = s.toLowerCase().toCharArray();
		for(char c:s_chars)
		{
			current = current.getChild(c);
			if(current == null)
				break;
			
		}
		return current!=null && current.isWord;
	}
	
	public ArrayList<String> getWords(TrieNode root)
	{
		  TrieNode current = root;
	      char[] words = new char[20];
	      ArrayList<String> wordList = new ArrayList<>();
	      wordList=addFoundWords(current, words,0, wordList);
	      return wordList;

	}
	
	public ArrayList<String> addFoundWords(TrieNode root, char[] words, int len, ArrayList<String> wordList)
	{
		if(root == null)
			return new ArrayList<String>();
		words[len] = root.data;
		len++;
		if(root.isWord)
			Print(words, len, wordList);
		
		Iterator iter = root.children.entrySet().iterator();
		while(iter.hasNext())
		{
			Entry<Character, TrieNode> pair = (Entry<Character, TrieNode>)iter.next();
			addFoundWords(pair.getValue(), words, len, wordList);
		}	
		return wordList;
		
	}
	
	public static ArrayList<String> getPrefixWords(TrieNode root, String prefix)
	{
		  TrieNode current = root;
	      char[] words = new char[20];
	      ArrayList<String> wordList = new ArrayList<>();
	      wordList=addFoundPrefixWords(current, words,0, wordList, prefix);
	      return wordList;

	}
	
	public static ArrayList<String> addFoundPrefixWords(TrieNode root, char[] words, int len, ArrayList<String> wordList, String prefix)
	{
		if(root == null)
			return new ArrayList<String>();
		words[len] = root.data;
		len++;
		//char[] prefixWord = new char[len];
		//System.arraycopy(words, 1, prefixWord, 0, len-1); 
		String prefixWord="";
		for(int i=1;i<len;i++)
			prefixWord+=words[i]+"";
		if(prefixWord.contains(prefix))
			{
			if(root.isWord)
				
			Print(words, len, wordList);
			}
		
			Iterator iter = root.children.entrySet().iterator();
			while(iter.hasNext())
			{
				Entry<Character, TrieNode> pair = (Entry<Character, TrieNode>)iter.next();
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
		Trie t = new Trie();
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		for(int i=0;i<=n;i++)
		{
			String cmd = in.nextLine();
			String[] cmdParts = cmd.split(" ");
			if(cmdParts[0] != null && cmdParts[0].equals("add"))
				t.addWord(cmdParts[1]);
			else
				if(cmdParts[0] != null && cmdParts[0].equals("find"))
				{
					ArrayList<String> suffix =getPrefixWords(t.root, cmdParts[1]);
			        System.out.println(suffix.size());
			        //for(String word : suffix)
			        //	System.out.println(word);
				}
					
		}
       /* t.addWord("h");
        t.addWord("ha");
        t.addWord("hhha");
        t.addWord("samsung");
        t.addWord("sampson");
        t.addWord("Double Vision");

        ArrayList<String> myWords= t.getWords(t.root);
        for(String word : myWords)
        	System.out.println(word);
        System.out.println(t.containsWord("samsun"));
        ArrayList<String> suffix =getPrefixWords(t.root, "sam");
        System.out.println(suffix.size());
        for(String word : suffix)
        	System.out.println(word);*/
        

	}

}

class TrieNode{
	char data;
	boolean isWord;
	LinkedHashMap<Character, TrieNode> children = new LinkedHashMap<Character, TrieNode>();
	public TrieNode(char ch)
	{
		this.data = ch;
	}
	public TrieNode getOrCreateChild(char ch)
	{
		if(this.children == null)
			this.children = new LinkedHashMap<Character, TrieNode>();
		TrieNode child = this.children.get(ch);
		if(child != null)
				return child;
			else
			{
				child= new TrieNode(ch);
				this.children.put(ch, child);
			}
		
		return child;
	}	
	
	public TrieNode getChild(char ch)
	{
		return this.children.get(ch)!= null?this.children.get(ch):null;
	}
	public void setWord()
	{
		this.isWord = true;
	}
	public char getChar()
	{
		return this.data;
	}
	public ArrayList<TrieNode> getChildren()
	{
		ArrayList<TrieNode> childrenList = new ArrayList<>();
		
		if(this.children == null)
			childrenList.add(new TrieNode('0'));
		else
			childrenList.addAll(this.children.values());
	
		return childrenList;
			
	}
	public int compareTo(TrieNode o)
	{
		return (int)this.data-o.data;
	}
}
