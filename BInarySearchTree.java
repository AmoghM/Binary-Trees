/*
 * Creating Binary Search Tree
 * and its traversal in Preorder, Inorder, Postorder
 */
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class BinarySearchTree 
{
		public static node root;
		public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BinarySearchTree()
		{
			root=null;
		}
		
		public static void create()throws Exception
		{   
			int choice=0;
			node p,q,t;
			t=new node();
			System.out.println("enter the value of the root node");
			t.info=Integer.parseInt(br.readLine());
			t.left=null;
			t.right=null;
			root=t;
			
			System.out.println("Enter the values of all nodes e.g 1 2 3");
			
			StringTokenizer st=new StringTokenizer(br.readLine());	
			while(st.hasMoreElements())
			{
			   t=new node();
			   t.info=Integer.parseInt(st.nextToken());
			   q=null;
			   p=root;
				while(p!=null)
				{
				     q=p;
				     if(t.info<p.info)
				    	p=p.left;
				     else
				    	 p=p.right;
				}
				if(t.info<q.info)
					q.left=t;
				else
					q.right=t;
		    }
		}
		public static void main(String args[])throws Exception
		{
			create();
			
			switch(1)
			{
			case 1: System.out.println("Preorder travesal");
			       preorder(root);
			case 2: System.out.println("Inorder travesal");
			        inorder(root);
			case 3: System.out.println("Postorder travesal");
				    postorder(root);
			case 4: System.out.println("Levelorder traversal");
			        levelorder(root);
			}
		}	
			
		static void preorder(node parent)
		{
			if(parent!=null)
			{
				System.out.println(parent.info);
			
			 preorder(parent.left);
			 preorder(parent.right);
		}
		}
			static void inorder(node parent)
			{
				if(parent!=null)
				{
					
				
				 inorder(parent.left);
				 System.out.println(parent.info);
				 inorder(parent.right);
			}}
				static void postorder(node parent)
			    {
				if(parent!=null)
				{   
					System.out.println(parent.info);
				
				 postorder(parent.left);
				 postorder(parent.right);
			    }	}
				
				static void levelorder(node parent)
				{
					Queue<node> q=new LinkedList<node>();
					q.add(parent);
					while(!q.isEmpty())
					{
						node temp=q.remove();
						if(temp.left!=null)
							q.add(temp.left);
						if(temp.right!=null)
							q.add(temp.right);
						System.out.println(temp.info);
					}
				}
	}
