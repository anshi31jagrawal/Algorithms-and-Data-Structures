package Miscellaneous;

import java.util.*;
import java.util.Map.Entry;

public class Trie_NoPrefixSet {
	public static TrieNode_NoPrefixSet root;
	
	public Trie_NoPrefixSet()
	{
		this.root = new TrieNode_NoPrefixSet('0');
	}
	
	public void addWord(String word){
		if(word != null || !word.isEmpty())
		{
	        TrieNode_NoPrefixSet node = this.root;
	        for (char ch : word.toLowerCase().toCharArray()) {
	            node = node.getOrCreateChild(ch);
	        }
	        if (!node.isWord) { // fix - only add new words....
	            node.isWord=true;
	            
	        }
		}
    }
	
	public static ArrayList<String> getPrefixWords(TrieNode_NoPrefixSet root, String prefix)
	{
		
		  TrieNode_NoPrefixSet current = root;
	      char[] words = new char[21];
	      ArrayList<String> wordList = new ArrayList<>();
	      wordList=addFoundPrefixWords(current, words,0, wordList, prefix);
	      return wordList;

	}
	
	public static ArrayList<String> addFoundPrefixWords(TrieNode_NoPrefixSet root, char[] words, int len, ArrayList<String> wordList, String prefix)
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
				Entry<Character, TrieNode_NoPrefixSet> pair = (Entry<Character, TrieNode_NoPrefixSet>)iter.next();
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
		Trie_NoPrefixSet t = new Trie_NoPrefixSet();
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		ArrayList<String> strings = new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			String s = in.next();
			strings.add(s);
			t.addWord(s);
			String ans = isBad(strings);
			if(!ans.equals("good"))
			{
				System.out.println("BAD SET");
				System.out.println(ans);
				return;
			}
        }
		System.out.println("GOOD SET");
		
    }
	
	public static String isBad(ArrayList<String> strings)
	{
		
		for(String s : strings)
		{
			ArrayList<String> otherStrings = new ArrayList<>();
			otherStrings.addAll(strings);
			otherStrings.remove(s);
			ArrayList<String> suffixStrings = getPrefixWords(root, s);
			suffixStrings.retainAll(otherStrings);
			if(suffixStrings.size()>0)
				return s;
		}
		return "good";
	}
}

class TrieNode_NoPrefixSet{
	char data;
	boolean isWord;
	LinkedHashMap<Character, TrieNode_NoPrefixSet> children = new LinkedHashMap<Character, TrieNode_NoPrefixSet>();
	public TrieNode_NoPrefixSet(char ch)
	{
		this.data = ch;
	}
	public TrieNode_NoPrefixSet getOrCreateChild(char ch)
	{
		if(this.children == null)
			this.children = new LinkedHashMap<Character, TrieNode_NoPrefixSet>();
		TrieNode_NoPrefixSet child = this.children.get(ch);
		if(child != null)
				return child;
			else
			{
				child= new TrieNode_NoPrefixSet(ch);
				this.children.put(ch, child);
			}
		
		return child;
	}	
	
	public TrieNode_NoPrefixSet getChild(char ch)
	{
		return this.children.get(ch)!= null?this.children.get(ch):null;
	}
}
