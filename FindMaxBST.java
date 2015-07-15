/*
 * This program finds Maximum of a Binary Search Tree
 * by recursion and iteration both in java	
 */

/*root is a node type class having fields:
 * 1) info: To store the value of the node,
 * 2) left: To store the address of the left child,
 * 3) right: To store the address of the right child.
 */
public class FindMaxBST 
{
	   public int maxRecursion(BinarySearchTree root) // Recursive Solution
	   {
		   if(root==null)
			   return -1;
		   if(root.right==null)
			   return root;
		   else
			   return maxRecursion(root.right);
		   
	   }
	   public void maxIteration(BinarySearchTree root) // Iterative Solution
	   {
		   if(root==null)
			   System.out.println("Empty Tree");
		   else
		   {
			   while(root.right!=null)
			   {
				   root=root.right;
			   }
			   System.out.println("Maximum value is "+ root.info);
		   }
		     
	   }
}
