package BinarySearchTree;
import java.util.Scanner;

import BinaryTree.*;

public class SearchTreeProgram1 
{
	static Scanner in=new Scanner(System.in);
	
	//������� ��������� ������ �� ����� ���� �������, �������� ����� ��� ���� ����� ���
	public static boolean isExistsRec(BinNode<Integer> t, int val)
	{
		if(t==null)
			return false;
		if(t.getVal()==val)
			return true;
		
		if(val<t.getVal())
			return isExistsRec(t.getLeft(), val);
		return isExistsRec(t.getRight(), val);
	}
	
	//������� �������� ������ �� ����� ���� �������, �������� ����� ��� ���� ����� ���
	public static boolean isExists(BinNode<Integer> t, int val)
	{
		while(t!=null)
		{
			if(t.getVal()==val)
				return true;
		
			if(val<t.getVal())
				t=t.getLeft();
			else
				t=t.getRight();
		}
		
		return false;
	}
	
	
	//null ������� ������ �� ����� ���� �������, �������� ����� ����� ����� �� ����� ���, ���� �����
	public static BinNode<Integer> search(BinNode<Integer> t, int val)
	{
		while(t!=null)
		{
			if(t.getVal()==val)
				return t;
		
			if(val<t.getVal())
				t=t.getLeft();
			else
				t=t.getRight();
		}
		
		return null;
	}
	
	//������� ������ �� ����� �� �� ����� ���� ������ ������� �� ���� ���
	public static void addToSearchTree(BinNode<Integer> t, int val)
	{
		BinNode<Integer> temp=new BinNode<Integer>(val);
		while(true)
		{
			if(val<t.getVal()) //�� ���� ����� ��� �� ����
			{
				if(t.getLeft()==null)
				{
					t.setLeft(temp);
					return;
				}
				t=t.getLeft();
			}	
			else  //�� ���� ����� ��� �� ����
			{
				if(t.getRight()==null)
				{
					t.setRight(temp);
					return;
				}
				t=t.getRight();
			}	
		}
	}
	
	//������� ����� �� ����� ������
	public static BinNode<Integer> buildSearchTree()
	{
		System.out.println("Enter values, to finish press 0:");
		int val=in.nextInt();
		if(val==0)
			return null;
		
		BinNode<Integer> root=new BinNode<Integer>(val);
		
		val=in.nextInt();
		while(val!=0)
		{
			addToSearchTree(root, val);
			val=in.nextInt();
		}
		return root;
	}
	
	
	
	public static void main(String[] args) 
	{
		BinNode<Integer> t=buildSearchTree();
		
		program1.printInOrder(t);
		System.out.println();
		System.out.println(isExists(t, in.nextInt()));
		System.out.println(isExists(t, in.nextInt()));
		System.out.println();
		ScanByLeveles.printByLevel(t);
	}

}
