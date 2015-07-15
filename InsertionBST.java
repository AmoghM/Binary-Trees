
public class InsertionBST 
{
		void insertion(BinarySearchTree root, int data)
		{
			t=new node();
			t.info=data;
			if(root==null)
			{	root=t;
			    root.left=null;
			    root.right=null;
			}
			else
			{
				if(data< root.left)
					insertion(BinarySearchTree root.left,data);
				if(data< root.right)
					insertion(BinarySearchTree root.right,data);
			}
				
		}
}

