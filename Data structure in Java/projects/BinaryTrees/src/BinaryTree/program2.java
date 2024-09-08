package BinaryTree;
import java.util.Scanner;

public class program2 
{
	static Scanner in=new Scanner(System.in);
	
	//������� ��������� ����� �� ������
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
	
	//������� ����� �� ������ ���� ���� ���
	public static BinNode<Integer> buildBinaryTree()
	{
		System.out.print("Enter value for the root (to finish press -1): ");
		return buildBinaryTreeRec();
	}
		
	//������� ������ ���� �� ���� ������� ��� ���
	public static <T> boolean isLeaf(BinNode<T> t)
	{
		return t.getLeft()==null && t.getRight()==null;
	}
	
	
	//������� ������ ���� �� ���� ������� ��� �� ���� ����
	public static <T> boolean isFull(BinNode<T> t)
	{
		return t.getLeft()!=null && t.getRight()!=null;
	}
	
	
	
	
	//������� ������ �� ������ ������� �� ���� �������� ���
	public static int maxValue1(BinNode<Integer> t)
	{
		if(t==null)
			return Integer.MIN_VALUE;
		
		return Math.max(Math.max(maxValue1(t.getLeft()), 
				                      maxValue1(t.getRight())),t.getVal());
	}
	
	
	
	
	//������� ������ �� ������ �� ��� ������� �� ���� ������� ���
	public static int maxValue2(BinNode<Integer> t)
	{
		if(isLeaf(t))
			return t.getVal();
		
		int max=t.getVal();
		
		if(t.getLeft()!=null)
			max=Math.max(max,maxValue2(t.getLeft()));
		
		if(t.getRight()!=null)
			max=Math.max(max,maxValue2(t.getRight()));
		
		return max;
	}
	
	
	//������� ������ �� ������� �� �����
	public static <T> int height(BinNode<T> t)
	{
		if(t==null)
			return 0;
		return 1 + Math.max(height(t.getLeft()),height(t.getRight()));
	}
	

	public static void main(String[] args) 
	{
		BinNode<Integer> root=buildBinaryTree();
		program1.printPreOrder(root);
		System.out.println();
		program1.printPostOrder(root);
		System.out.println();
		program1.printInOrder(root);
		System.out.println();
		
		System.out.println(maxValue1(root));
		System.out.println(maxValue2(root));

		System.out.println(height(root));
	}

}
