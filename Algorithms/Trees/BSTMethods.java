package Trees;
public class BSTMethods {

	public static void main(String[] args) {
		 //               1
		 //              / \
		 //             2   3
		 //            / \
		 //           4   5
		 //                \
		 //                 6
		 //                  \
		 //                   7
		 TreeNode root = new TreeNode(5);
	     root.left = new TreeNode(2);
	     root.right = new TreeNode(8);
	     root.left.left = new TreeNode(1);
	     root.left.right = new TreeNode(4);
	     root.left.right.left = new TreeNode(3);
	     root.right.left = new TreeNode(6);
	     root.right.left.right = new TreeNode(7);
	     Tree t = new Tree(root);
	     //System.out.println("Following are nodes in top view of Binary Tree");
	     //t.printTopView();
	     
	     int heightOfTree= t.height(t.root);// Height of root = 0
	     System.out.println("Height Of Tree:"+heightOfTree); 
	     TreeNode newRoot = t.BSTInsert(t.root,10);
	     System.out.println("New Tree Generated");
	     
	     
	}

}




