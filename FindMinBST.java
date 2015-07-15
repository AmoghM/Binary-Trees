/*
 * This program finds the minimum value of a Binary Search Tree
 * in recursive and iterative way in java
 */

/*root is a node type class having fields:
 * 1) info: To store the value of the node,
 * 2) left: To store the address of the left child,
 * 3) right: To store the address of the right child.
 */

public class FindMinBST {
		
		public int minRecursion(BinarySearchTree root)//Recursive Solution
		{
				if(root==null)
					return -1;
				if(root.left==null)
					return root.info;
				else
					return minRecursion(root.left);
		}
		
		public void maxRecursion(BinarySearchTree root) // Iterative Solution
		{
			if(root==null)
			   System.out.println("No Tree");
			else
			{
				while(root.left!=null)
				{
					root=root.left;
				}
				System.out.println("Minimum Value is "+ root.left);
			}
		
}
}

