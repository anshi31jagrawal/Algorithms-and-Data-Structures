package Trees;
import java.util.*;
import java.util.Map.Entry;

//Class for a tree node
class TreeNode {
	// Members
	int data;
	TreeNode left, right;
	TreeNode sibling;

	// Constructor
	public TreeNode(int data) {
		this.data = data;
		left = right = null;
		this.sibling = null;
	}
}

class topViewItem {
	int hd;
	TreeNode node;

	topViewItem(TreeNode node, int hd) {
		this.node = node;
		this.hd = hd;
	}
}

public class TreeMethods {
	public static void main(String[] args) {
		Tree tree = createTree();
		Tree tree1 = createTree1();
		Tree BST = createBST();

		// Tree-Top-View
		// System.out.println("Following are nodes in top view of Binary Tree");
		// tree.printTopView(tree.root);
		
		// Vertical Sum
		// System.out.println("Vertical Sum:");
		// tree.verticalSum(tree.root);

		// Inorder Traversal
		// System.out.println("\nInorder:");
		// tree.inOrder(tree.root);
		// tree.inOrderIter(tree.root);

		// PreOrder Traversal
		// System.out.println("\nPreorder:");
		// tree.preOrder(tree.root);
		// tree.preOrderIter(tree.root);
		
		// PostOrder Traversal
		// System.out.println("\nPostorder:");
		// tree.postOrder(tree.root);
		// tree.postOrderIter(tree.root);
		
		// Print Height of Tree
		// int heightOfTree= tree.height(tree.root);// Height of root = 0
		// System.out.println("Height Of Tree:"+heightOfTree);

		// Print minimum Height of Tree
		// int minHeightOfTree= tree.minHeight(tree.root);// Height of root = 0
		// System.out.println("min Height Of Tree:"+minHeightOfTree);

		// Prints the sum of nodes
		// int sum = tree.sumElements(tree.root);
		// System.out.println("Sum of nodes: "+sum);
		
		// Prints the sum of nodes w/o recursion
		// int sum = tree.sumElementsQueue(tree.root);
		// System.out.println("Sum of nodes: "+sum);
		
		// Print min element in the tree
		// int min = tree.min(tree.root, Integer.MAX_VALUE);
		// System.out.println(min);

		// Print max element in the tree
		// int max = BST.max(BST.root, 0);
		// System.out.println(max);

		// Check if a binary tree is as BST
		// boolean isBST = BST.isBSTUtil(BST.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		// System.out.println(isBST);

		// isBST = tree.isBSTUtil(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		// System.out.println(isBST);

		// TODO:FIND PREDECESSOR
		// int predec = BST.findPredecessor(BST.root, 4);
		// System.out.println(predec);
		// int[] PredSucc = BST.findPredecessorBST(BST.root,new TreeNode(-1), new TreeNode(-1), 4);
		// System.out.println(PredSucc[0]+","+PredSucc[1]);
		
		// TODO:FIND SUCCESSOR
		// int succ = BST.findSuccessor(BST.root, 4);
		// System.out.println(succ);

		// Level Order Traversal is basically BFS
		// tree.LevelOrderTraversal();
		// tree.LevelOrderTraversalWithQueue(tree.root);

		// Reverse Level Order Traversal is basically BFS
		// tree.reverseLevelOrderTraversalWithStackQueue(tree.root);

		// BST Insertion
		// TreeNode newRoot = BST.BSTInsert(BST.root,9);
		// System.out.println("New Tree Generated");

		// Find Ancestor
		// int ancestor = tree.findAncestor(tree.root, 4,7).data;
		// System.out.println(ancestor);

		// Print all Ancestors
		// tree.printAllAncestors(tree.root, 7);
		
		// Find element in BST
		// boolean found = BST.findElementBST(BST.root, 11);
		// System.out.println(found);
		// found = BST.search(BST.root, 11);
		// System.out.println(found);

		// Size of binary tree
		// int size = tree.size(tree.root);
		// System.out.println("\nSize of tree:"+size);

		// Returns deepest node of a binary tree
		// int deepestNode = tree.deepestNode(tree.root);
		// System.out.println("Deepest node: "+deepestNode);

		// TODO: //Delete node in a binary tree
		// tree.deleteNodeInBinaryTree(tree.root,3);

		// Delete node in a binary search tree
		// BST.deleteNodeInBinarySearchTree(BST.root,5);
		// System.out.println("New Tree");
		 
		// Returns the number of leaves in a binary tree
		// int leaves = tree.noOfLeaves(tree.root);
		// System.out.println("No. of leaves: "+leaves);

		// Returns the number of full nodes in a binary tree
		// int fullNodes = tree.noOfFullNodes(tree.root);
		// System.out.println("No. of full Nodes: "+fullNodes);

		// Returns the number of half nodes in a binary tree
		// int halfNodes = tree.noOfHalfNodes(tree.root);
		// System.out.println("No. of half Nodes: "+halfNodes);

		// Returns true if the two binary trees are structurally similar
		// boolean identicalStructure = tree.areStructurallySimilar(tree.root,
		// tree1.root);
		// System.out.println("Are trees structurally
		// similar?"+identicalStructure);

		// Returns true if the two binary trees are identical
		// boolean identical = tree.areIdentical(tree.root, tree1.root);
		// System.out.println("Are trees identical?"+identical);

		// Returns true is tree2 is a substructure of tree1
		// boolean isSubstructure = tree.isSubStructure(tree.root, tree1.root);
		// System.out.println(isSubstructure);

		// Returns the diameter of the tree
		// int diameter = tree.diameter(tree.root);
		// System.out.println("Diameter of tree:"+diameter);

		// Understand the logic ; Returns the width of the tree using 2 methods
		// int width = tree.width(tree.root);
		// System.out.println("Width of tree:"+width);

		// Understand the logic ; Returns the width of the tree using Queue
		// String widthQueue = tree.widthUsingQueue(tree.root);
		// System.out.println("Width of tree:"+widthQueue);

		// Understand the logic ; Returns the max width sum of the tree
		// String widthSum = tree.widthSum(tree.root);
		// System.out.println("Max Width Sum of tree:"+widthSum);

		// Prints all root to leaf paths
		// System.out.println("All root to leaf paths:");
		// tree.printRootLeafPaths(tree.root);
		 
		// Checks if any path with reqSum exists on root to leaf paths using printing method
		// tree.checkSumRootLeafPaths(tree.root, 14);
		
		// Method 2: Recursion by traversing n removing whatever found from reqSum
		// boolean found = tree.checkSumOnPaths(tree.root, 5);
		// System.out.println("Is Sum found on path?"+found);
		
		// Tree Mirror
		// TreeNode mirroredTree = tree.mirror(tree.root);

		// Check if mirrors ; same as identical function with recursions swapped
		// boolean mirrors = tree.areMirrors(tree.root,tree1.root);
		// System.out.println("Are Mirrors? "+mirrors);
		
		// Make Binary Tree from  Inorder and preorder
		// int[] inorder = {4,2,5,1,6,3};
		// int[] preorder = {1,2,4,5,3,6};
		// TreeNode t = tree.makeTree(inorder, preorder);
		// System.out.print("Tree created!");
		
		// Create all BSTs
		// ArrayList<TreeNode> arr= tree.constructAllTrees(1,3);
		
		// Find next sibling 
		// tree.nextSibling(tree.root);
		
		// Creates a deep Copy of a Binary Tree
		// Tree newTree = new Tree(tree.deepCopy(tree.root));
		// System.out.println(tree.areIdentical(tree.root, newTree.root));
		
		
		// TODO: Return in,pre,postOrder traversal strings

		// TODO: isSubStructure_O_n using
		
		System.out.println("");

	}

	public static Tree createBST() {
		//          5
		//         / \
		//        3   8
		//       / \   \
		//      2   4   10
		//     /
		//    1
		//
		//
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(4);
		root.left.left.left = new TreeNode(1);
		// root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(10);
		Tree t = new Tree(root);
		return t;
	}

	public static Tree createTree() {
		//                     1
		//                   /   \
		//                  2     3
		//                 / \   / \
		//                4   5 9   8
		//                     \
		//                      6
		//                       \
		//                        7
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.left.right.right = new TreeNode(6);
		root.left.right.right.right = new TreeNode(7);
		root.right.left = new TreeNode(9);
		root.right.right = new TreeNode(8);
		// root.left.left.left = new TreeNode(10);
		// root.left.left.left.left = new TreeNode(12);
		// root.left.left.left.left.right = new TreeNode(14);
		// root.right.right.right = new TreeNode(15);
		// root.right.right.right.right = new TreeNode(16);
		// root.right.right.right.right.left = new TreeNode(17);
		Tree t = new Tree(root);
		return t;
	}

	public static Tree createTree1() {
		//                1
		//              /   \
		//             3     2
		//            / \   / \
		//           8   9 5   4
		//                / 
		//               6
		//              / 
		//             7
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(3);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(8);
		root.left.right = new TreeNode(9);
		root.right.right = new TreeNode(4);
		//root.left.right.right.right = new TreeNode(7);
		root.right.left = new TreeNode(5);
		root.right.left.left = new TreeNode(6);
		root.right.left.left.left = new TreeNode(7);
		// root.left.left.left.left = new TreeNode(12);
		// root.left.left.left.left.right = new TreeNode(14);
		// root.right.right.right = new TreeNode(15);
		// root.right.right.right.right = new TreeNode(16);
		// root.right.right.right.right.left = new TreeNode(17);
		Tree t = new Tree(root);
		return t;
	}

}

// Class for a Binary Tree
class Tree {
	TreeNode root;

	// Constructors
	public Tree() {
		root = null;
	}
	public Tree(TreeNode n) {
		root = n;
	}
	public int height(TreeNode t) {
		
		TreeNode root = t;
		if (root == null)
			return 0;
		return (Math.max(height(root.left), height(root.right)) + 1);
	}
	public int minHeight(TreeNode t) {
		TreeNode root = t;
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;
		if(root.left == null)
			return minHeight(root.right)+1;
		if(root.right == null)
			return minHeight(root.left)+1;
		
		return (Math.min(minHeight(root.left), minHeight(root.right)) + 1);
	}
	public int size(TreeNode root) {
		int l_size = 0;
		int r_size = 0;
		if (root == null)
			return 0;
		else {
			l_size = size(root.left);
			r_size = size(root.right);
			return l_size + r_size + 1;
		}
	}
	public int sumElements(TreeNode root)
	{
		if(root == null)
			return 0;
		else
			return(sumElements(root.left)+sumElements(root.right)+root.data);
	}
	public int sumElementsQueue(TreeNode root)
	{
		if(root == null)
			return 0;
		Deque<TreeNode> q = new ArrayDeque<TreeNode>();
		int sum = 0;
		q.offer(root);
		while(!q.isEmpty())
		{
			TreeNode current = q.poll();
			sum+=current.data;
			if(current.left!=null)
				q.offer(current.left);
			if(current.right!=null)
				q.offer(current.right);
		}
		return sum;
	}
	public void inOrder(TreeNode root) {
		if (root == null)
			return;
		else {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}
	public void inOrderIter(TreeNode root)
	{
		if(root == null)
			return;
		Stack<TreeNode> s= new Stack<TreeNode>();
		TreeNode current = root;
		boolean done=false;
		System.out.println();
		while(!done)
		{
			if(current != null)
			{
				s.push(current);
				current = current.left;
			}
			else
			{
				if(s.isEmpty())
				{
					done =true;
				}
				else
				{
					current = s.pop();
					System.out.print(current.data+",");
					current=current.right;
				}
			}
			
		}
	}
	public void preOrder(TreeNode root) {
		if (root == null)
			return;
		else {
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	public void preOrderIter(TreeNode root)
	{
		System.out.println();
		Stack<TreeNode> s=new Stack<TreeNode>();
		TreeNode current = root;
		s.push(current);
		while(!s.isEmpty())
		{
			current=s.pop();
			System.out.print(current.data+",");
			if(current.right != null)
				s.push(current.right);
			if(current.left != null)
				s.push(current.left);
		}
	}
	public void postOrder(TreeNode root) {
		if (root == null)
			return;
		else {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}
	}
	public void postOrderIter(TreeNode root)
	{
		System.out.println();
		Stack<TreeNode> s1=new Stack<TreeNode>();
		Stack<TreeNode> s2=new Stack<TreeNode>();
		TreeNode current = root;
		s1.push(current);
		while(!s1.isEmpty())
		{
			current=s1.pop();
			s2.push(current);
			//System.out.print(current.data+",");
			if(current.left != null)
				s1.push(current.left);
			if(current.right != null)
				s1.push(current.right);
		}
		while(!s2.isEmpty())
		{
			System.out.print(s2.pop().data+",");
		}
	}
	public int min(TreeNode root, int min) {
		int l_min;
		int r_min;
		int thisMin;
		if (root == null)
			return Integer.MAX_VALUE;
		l_min = min(root.left, min);
		r_min = min(root.right, min);

		thisMin = (l_min <= r_min) ? l_min : r_min;
		thisMin = (root.data <= thisMin) ? root.data : thisMin;
		thisMin = (thisMin < min) ? thisMin : min;
		return thisMin;
	}
	public int max(TreeNode root, int max) {
		int l_max;
		int r_max;
		int thisMax;
		if (root == null)
			return -1;
		l_max = max(root.left, max);
		r_max = max(root.right, max);

		thisMax = (l_max >= r_max) ? l_max : r_max;
		thisMax = (root.data >= thisMax) ? root.data : thisMax;
		thisMax = (thisMax >= max) ? thisMax : max;
		return thisMax;
	}
	
	public boolean isBSTUtil(TreeNode root, int min, int max) { //O(n) keeping allowed range of min and max values for a node
		if (root == null)
			return true;
		if (root.data < min || root.data > max)
			return false;
		return isBSTUtil(root.left, min, root.data - 1) && isBSTUtil(root.right, root.data + 1, max);

	}	
	public int findPredecessor(TreeNode root, int key) {
		int pred = 0;
		if (root == null)
			return -1;
		else {
			if (root.data == key) {
				pred = max(root.left, 0);

			} else {
				if (key < root.data) {
					if (root.left == null)
						return -1;
					else {
						pred = findPredecessor(root.left, key);
					}
				} else {
					if (root.right == null)
						return -1;
					else {
						pred = findPredecessor(root.right, key);
					}
				}
			}
		}

		return pred;

	}
	public int[] findPredecessorBST(TreeNode root,TreeNode pred, TreeNode succ, int key)
	{
		if(root == null)
			return new int[]{-1,-1};
		if(root.data==key)
		{
			if(root.left != null)
			{
				TreeNode temp = root.left;
				while(temp.left!=null)
					temp=temp.left;
				pred=temp;
			}
			if(root.left != null)
			{
				TreeNode temp = root.right;
				while(temp.right!=null)
					temp=temp.right;
				succ=temp;
			}
		}
		if(root.data>key)
		{
			succ=root;
			findPredecessorBST(root.left, pred, succ, key);
		}
		else
		{
			pred = root;
			findPredecessorBST(root.right, pred, succ, key);
		}
		return new int[]{pred.data, succ.data};
	}
	public int findSuccessor(TreeNode root, int key) {
		int succ = 0;
		if (root == null)
			return -1;
		else {
			if (root.data == key) {
				succ = min(root.right, 1000);

			} else {
				if (key < root.data) {
					if (root.left == null)
						return -1;
					else {
						succ = findSuccessor(root.left, key);
					}
				} else {
					if (root.right == null)
						return -1;
					else {
						succ = findSuccessor(root.right, key);
					}
				}
			}
		}

		return succ;

	}
	public void printTopView(TreeNode root) {
		TreeNode current = root;
		Deque<topViewItem> q = new ArrayDeque<topViewItem>();
		topViewItem item = new topViewItem(current, 0);
		TreeMap<Integer, Integer> map = new TreeMap<>();
		q.offer(item);
		while (!q.isEmpty()) {
			topViewItem top = q.poll();
			int h = top.hd;
			TreeNode topnode = top.node;
			if (!map.containsKey(h)) {
				map.put(h, topnode.data);
				// System.out.print(topnode.data);
			}
			if (topnode.left != null)
				q.offer(new topViewItem(topnode.left, h - 1));
			if (topnode.right != null)
				q.offer(new topViewItem(topnode.right, h + 1));
		}
		ArrayList<Integer> v = new ArrayList<Integer>();
		Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Integer, Integer> pair = (Entry<Integer, Integer>) it.next();
			v.add(pair.getValue());
		}
		Collection<Integer> val = map.values();
		for (int i = 0; i < v.size(); i++)
			System.out.print(v.get(i) + " ");

	}
	public void verticalSum(TreeNode root) {
		TreeNode current = root;
		Deque<topViewItem> q = new ArrayDeque<topViewItem>();
		topViewItem item = new topViewItem(current, 0);
		TreeMap<Integer, Integer> map = new TreeMap<>();
		q.offer(item);
		while (!q.isEmpty()) {
			topViewItem top = q.poll();
			int h = top.hd;
			TreeNode topnode = top.node;
			if (!map.containsKey(h)) {
				map.put(h, topnode.data);
				// System.out.print(topnode.data);
			}
			else
			{
				map.put(h, map.get(h)+topnode.data);
			}
			if (topnode.left != null)
				q.offer(new topViewItem(topnode.left, h - 1));
			if (topnode.right != null)
				q.offer(new topViewItem(topnode.right, h + 1));
		}
		ArrayList<Integer> v = new ArrayList<Integer>();
		Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Integer, Integer> pair = (Entry<Integer, Integer>) it.next();
			v.add(pair.getValue());
		}
		Collection<Integer> val = map.values();
		for (int i = 0; i < v.size(); i++)
			System.out.print(v.get(i) + " ");

	}
	public void LevelOrderTraversal() {
		TreeNode root = this.root;
		// Queue<Integer> q = new LinkedList<Integer>();
		// q.offer(root.data);
		int height = this.height(root);
		for (int i = 0; i <= height; i++)
			printGivenLevel(root, i);
	}
	public void printGivenLevel(TreeNode root, int level) {
		if (root == null)
			return;
		else {
			if (level == 0)
				System.out.print(root.data + " ");
			else {
				printGivenLevel(root.left, level - 1);
				printGivenLevel(root.right, level - 1);
			}
		}
	}
	public void LevelOrderTraversalWithQueue(TreeNode root) {
		Deque<TreeNode> q = new ArrayDeque<TreeNode>();
		q.offer(root);
		
		while (!q.isEmpty()) {
			TreeNode currentnode = q.poll();
			System.out.print(currentnode.data+" ");
			if (currentnode.left != null)
				q.offer(currentnode.left);
			if (currentnode.right != null)
				q.offer(currentnode.right);
		}
		
	}
	public void reverseLevelOrderTraversalWithStackQueue(TreeNode root) {
		if (root == null)
			return;
		Stack<TreeNode> s = new Stack<TreeNode>();
		Deque<TreeNode> q = new ArrayDeque<TreeNode>();
		q.offer(root);

		while (!q.isEmpty()) {
			TreeNode currentnode = q.poll();
			if (currentnode.left != null)
				q.offer(currentnode.left);
			if (currentnode.right != null)
				q.offer(currentnode.right);
			s.push(currentnode);
		}
		while (!s.isEmpty()) {
			System.out.print(s.pop().data + " ");
		}
	}
	public TreeNode BSTInsert(TreeNode root, int newData) {
		TreeNode UpdatedRoot = new TreeNode(0);
		TreeNode newNode = new TreeNode(newData);
		if (root == null)
			root = newNode;
		else if (newData <= root.data)
			root.left = BSTInsert(root.left, newData);
		else
			root.right = BSTInsert(root.right, newData);
		UpdatedRoot = root;
		return UpdatedRoot;
	}
	public boolean findElementBST(TreeNode root, int key) {
		boolean lfound = false;
		boolean rfound = false;
		if (root == null)
			return false;
		else {
			if (root.data == key)
				return true;
			else {
				if (key < root.data) {
					if (root.left == null)
						return false;
					else {
						lfound = findElementBST(root.left, key);
					}
				} else {
					if (root.right == null)
						return false;
					else {
						rfound = findElementBST(root.right, key);
					}
				}
			}
		}

		return lfound || rfound;
	}
	public boolean search(TreeNode root, int key)
	{
		if(root ==null)
			return false;
		while(root!=null)
		{
			if(root.data==key)
				return true;
			if(root.data>key)
				root=root.left;
			else
				root=root.right;
		}
		return false;
	}
	public TreeNode deleteNodeInBinarySearchTree(TreeNode root, int key) {
		if (root == null)
			return root;
		if(key<root.data)
			root.left=deleteNodeInBinarySearchTree(root.left, key);
		else if(key>root.data)
			root.right=deleteNodeInBinarySearchTree(root.right, key);
		else
		{
			if(root.left==null)
				return root.right;
			else if(root.right== null)
				return root.left;
			root.data=min(root.right,1000);
			root.right = deleteNodeInBinarySearchTree(root.right, root.data);
		}
		return root;	
	}
	public int deepestNode(TreeNode root) {
		Deque<TreeNode> q = new ArrayDeque<TreeNode>();
		q.offer(root);
		TreeNode current = new TreeNode(0);
		while (!q.isEmpty()) {
			current = q.poll();
			if (current.left != null)
				q.offer(current.left);
			if (current.right != null)
				q.offer(current.right);

		}
		return current.data;
	}
	public TreeNode findAncestor(TreeNode root, int n1, int n2) {

		TreeNode current = root;
		TreeNode l_ancestor = new TreeNode(0);
		TreeNode r_ancestor = new TreeNode(0);
		if (current == null)
			return null;
		if (current.data == n1 || current.data == n2) {
			return current;
		} else {
			l_ancestor = findAncestor(current.left, n1, n2);
			r_ancestor = findAncestor(current.right, n1, n2);
			if (l_ancestor != null && r_ancestor != null)
				return current;
		}

		return (l_ancestor != null ? l_ancestor : r_ancestor);
	}
	public boolean printAllAncestors(TreeNode root, int value)
	{
		if(root == null)
			return false;
		if((root.left != null && root.left.data == value) || (root.right != null && root.right.data == value) || printAllAncestors(root.left, value) || printAllAncestors(root.right, value))
			{
				System.out.println(root.data+ " "); 
				return true;
			}
		return false;
	}
	public int noOfLeaves(TreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;
		int leaves = 0;
		Deque<TreeNode> q = new ArrayDeque<TreeNode>();
		q.offer(root);
		while (!q.isEmpty()) {
			TreeNode current = q.poll();
			if (current.left == null && current.right == null)
				leaves++;
			else {
				if (current.left != null)
					q.offer(current.left);
				if (current.right != null)
					q.offer(current.right);
			}
		}
		return leaves;
	}
	public int noOfFullNodes(TreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 0;
		int fullNodes = 0;
		Deque<TreeNode> q = new ArrayDeque<TreeNode>();
		q.offer(root);
		while (!q.isEmpty()) {
			TreeNode current = q.poll();
			if (current.left != null && current.right != null)
				fullNodes++;
			if (current.left != null)
				q.offer(current.left);
			if (current.right != null)
				q.offer(current.right);

		}
		return fullNodes;
	}
	public int noOfHalfNodes(TreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 0;
		int halfNodes = 0;
		Deque<TreeNode> q = new ArrayDeque<TreeNode>();
		q.offer(root);
		while (!q.isEmpty()) {
			TreeNode current = q.poll();
			if ((current.left != null && current.right == null) || (current.left == null && current.right != null))
				halfNodes++;
			if (current.left != null)
				q.offer(current.left);
			if (current.right != null)
				q.offer(current.right);

		}
		return halfNodes;
	}
	public boolean areStructurallySimilar(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null)
			return true;
		if (root1 == null || root2 == null)
			return false;
		return (areStructurallySimilar(root1.left, root2.left) && areStructurallySimilar(root1.right, root2.right));
	}
	public boolean areIdentical(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null)
			return true;
		if (root1 == null || root2 == null)
			return false;
		return (root1.data == root2.data && areIdentical(root1.left, root2.left)
				&& areIdentical(root1.right, root2.right));
	}
	public boolean isSubStructure(TreeNode Tree, TreeNode substructure) {
		if (Tree == null)
			return false;
		if (substructure == null)
			return true;
		if (this.areIdentical(Tree, substructure))
			return true;
		return (isSubStructure(Tree.left, substructure) || isSubStructure(Tree.right, substructure));
	}
	public int diameter(TreeNode root) {
		if (root == null)
			return 0;

		int l_diameter = diameter(root.left);
		int r_diameter = diameter(root.right);

		int l_height = this.height(root.left);
		int r_height = this.height(root.right);

		return (Math.max((l_height + r_height + 1), Math.max(l_diameter, r_diameter)));
	}
	public int width(TreeNode root) {
		int maxWidth = 0;
		if (root == null)
			return 0;
		int height = this.height(root);
		for (int i = 0; i <= height; i++) {
			int width = 0;
			width = getLevelWidth(root, i);
			maxWidth = Math.max(maxWidth, width);
		}
		return maxWidth;
	}
	public int getLevelWidth(TreeNode root, int level) {
		if (root == null)
			return 0;
		if (level == 0)
			return 1;
		else
			return (getLevelWidth(root.left, level - 1) + getLevelWidth(root.right, level - 1));
	}
	public String widthUsingQueue(TreeNode root) {
		int maxWidth = 0;
		int level = 0;
		if (root == null)
			return 0 + ":" + 0;
		Deque<TreeNode> q = new ArrayDeque<TreeNode>();
		TreeNode dummy = new TreeNode(-1);
		q.offer(root);
		q.offer(dummy);
		int currentWidth = 0;
		int i = 0;
		while (!q.isEmpty()) {
			TreeNode current = q.poll();
			if (current.data != -1) {
				if (current.left != null)
					q.offer(current.left);
				if (current.right != null)
					q.offer(current.right);
				currentWidth++;
			} else {
				if (currentWidth > maxWidth) {
					maxWidth = currentWidth;
					level = i;
					i++;

				}
				currentWidth = 0;
				if (!q.isEmpty())
					q.offer(dummy);
			}
		}
		return level + ":" + maxWidth;
	}
	public String widthSum(TreeNode root) {
		int maxWidthSum = 0;
		int level = 0;
		if (root == null)
			return 0 + ":" + 0;
		Deque<TreeNode> q = new ArrayDeque<TreeNode>();
		TreeNode dummy = new TreeNode(-1);
		q.offer(root);
		q.offer(dummy);
		int currentSum = 0;
		int maxSum = 0;
		int i = 0;
		while (!q.isEmpty()) {
			TreeNode current = q.poll();
			if (current.data != -1) {
				if (current.left != null)
					q.offer(current.left);
				if (current.right != null)
					q.offer(current.right);
				currentSum += current.data;
			} else {
				if (currentSum > maxSum) {
					maxSum = currentSum;
					level = i;
					i++;
				}
				currentSum = 0;
				if (!q.isEmpty())
					q.offer(dummy);
			}
		}
		return level + ":" + maxSum;
	}
	public void printRootLeafPaths(TreeNode root) {
		int path[] = new int[1000];
		addRootLeafPaths(root, path, 0);
	}
	public void addRootLeafPaths(TreeNode root, int path[], int pathLen) {
		if (root == null)
			return;
		path[pathLen] = root.data;
		pathLen++;
		if (root.left == null && root.right == null)//reached leaf node
			printPaths(path, pathLen);
		else {
			addRootLeafPaths(root.left, path, pathLen);
			addRootLeafPaths(root.right, path, pathLen);
		}
	}
	public void printPaths(int[] path, int length) {
		System.out.println();
		for (int i = 0; i < length; i++)
			System.out.print(path[i] + " ");
	}
	public void checkSumRootLeafPaths(TreeNode root, int sum) {
		int path[] = new int[1000];
		boolean found=checkSumOnPaths(root, path, 0, sum, false);
		if(found==false)
			System.out.println("-1");
	}
	public boolean checkSumOnPaths(TreeNode root, int path[], int pathLen,int reqSum, boolean found) {
		if (root == null)
			return false;
		path[pathLen] = root.data;
		pathLen++;
		int len = checkSum(path,pathLen, reqSum);
		if(len!= -1)
		{
			found=true;
			System.out.println("Sum Found on path:");
			printPaths(path,len);
			return true;
		}
		if (!(root.left == null && root.right == null))
		{
			found = checkSumOnPaths(root.left, path, pathLen, reqSum, found);
			found = found||checkSumOnPaths(root.right, path, pathLen, reqSum, found);
		}
		return found;

	}
	public int checkSum(int[] path, int length, int reqSum)
	{
		int sum = 0;
		for(int i=0;i<length;i++)
		{
			sum+=path[i];
			if(sum==reqSum)
				return length;
		}
		return -1;
	}
	public boolean checkSumOnPaths(TreeNode root, int reqSum)
	{
		if(root == null)
			return false;
		if(/*root.left == null && root.right == null &&*/ root.data == reqSum) //remove this condition if the sum has to be on some root to leaf path
			return true;
		else
			return checkSumOnPaths(root.left,reqSum-root.data)|| checkSumOnPaths(root.right, reqSum-root.data);
	}
	public TreeNode mirror(TreeNode root)
	{
		
		if(root == null)
			return root;
		TreeNode current = root;
		TreeNode l_mirror;
		TreeNode r_mirror;
		l_mirror = this.mirror(current.left);
		r_mirror = this.mirror(current.right);
			
			current.left = r_mirror;
			current.right = l_mirror;
			
		
		System.out.println();
		return root;
	}
	public boolean areMirrors(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null)
			return true;
		if (root1 == null || root2 == null)
			return false;
		return (root1.data == root2.data && areMirrors(root1.left, root2.right)
				&& areMirrors(root1.right, root2.left));
	}
	public TreeNode makeTree(int[] inorder, int[] preorder)
	{
		if(inorder.length == 0 || inorder.length != preorder.length)
			return null;
		return buildBT(preorder,0, preorder.length-1, inorder, 0,inorder.length-1);
	}
	public TreeNode buildBT(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd)
	{
		if(preStart>preEnd || inStart > inEnd)
			return null;
		int rootData= pre[preStart];
		TreeNode root=new TreeNode(rootData);
		if(inStart == inEnd)
			return root;
		
		int offset=inStart;
		for(;offset<inEnd;offset++)
		{
			if(in[offset]==rootData)
				break;
		}
		
		root.left = buildBT(pre,preStart+1,preStart+offset-inStart,in,inStart,offset-1);
		root.right = buildBT(pre,preStart+1+offset-inStart,preEnd,in,offset+1,inEnd);
		return root;
	}
	public ArrayList<TreeNode> constructAllTrees(int start, int end)
	{
		ArrayList<TreeNode> trees = new ArrayList<>();
		if(start>end)
		{
			trees.add(null);
			return trees;
		}
		
		for(int i=start;i<=end;i++)
		{
			for(TreeNode left : constructAllTrees(start, i-1))
				for(TreeNode right : constructAllTrees(i+1, end))
				{
					TreeNode newTree = new TreeNode(i);
					newTree.left = left;
					newTree.right = right;
					trees.add(newTree);
				}
		}
		return trees;
	}
	public void nextSibling(TreeNode root)
	{
		TreeNode current = root;
		if(current == null)
			return;
		Deque<TreeNode> q = new ArrayDeque<TreeNode>();
		q.offer(current);
		q.offer(new TreeNode(-1));
		while(!q.isEmpty())
		{
			current = q.poll();
			if(current.data != -1)
			{
				current.sibling = q.peek();
				System.out.println(current.data +"-->"+current.sibling.data );
				if(current.left != null)
					q.offer(current.left);
				if(current.right != null)
					q.offer(current.right);
			}
			else
			{
				if(!q.isEmpty())
					q.offer(new TreeNode(-1));
			}
		}
	}
	public TreeNode deepCopy(TreeNode t)
	{
		if (t == null) 
			return null;
		TreeNode copy = new TreeNode(t.data);
		copy.left = deepCopy(t.left);
		copy.right = deepCopy(t.right);
		return copy;
	}
	
}