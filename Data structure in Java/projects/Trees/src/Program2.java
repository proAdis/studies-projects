import java.util.Scanner;

public class Program2 
{
	static Scanner in=new Scanner(System.in);
	
	//פונקציה רקורסיבית הבונה עץ בינארי
	public static BinNode<Integer> buildBinaryTreeRec()
	{
		int val=in.nextInt();
		
		if(val==-1)
			return null;
		
		System.out.print("Enter value for the left sub of "+val+": ");
		BinNode<Integer> left=buildBinaryTreeRec();
		
		System.out.print("Enter value for the right sub of "+val+": ");
		BinNode<Integer> right=buildBinaryTreeRec();
		
		return new BinNode<Integer>( left, val, right);
	}
	
	//פונקציה הבונה עץ בינארי עבור ערכי קלט
	public static BinNode<Integer> buildBinaryTree()
	{
		System.out.print("Enter value for the root (to finish press -1): ");
		return buildBinaryTreeRec();
	}
	
	
	public static void main(String[] args) 
	{
		BinNode<Integer> root=buildBinaryTree();
		
		Program1.printPreOrder(root);
		System.out.println();
		Program1.printPostOrder(root);
		System.out.println();
		Program1.printInOrder(root);
		System.out.println();
	}

}
