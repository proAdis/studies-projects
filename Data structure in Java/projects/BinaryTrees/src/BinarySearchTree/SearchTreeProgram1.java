package BinarySearchTree;
import java.util.Scanner;

import BinaryTree.*;

public class SearchTreeProgram1 
{
	static Scanner in=new Scanner(System.in);
	
	//פונקציה רקורסיבית המקבלת עץ חיפוש וערך ולחיפוש, הפונקציה תחזיר האם הערך מופיע בעץ
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
	
	//פונקציה אטרטיבית המקבלת עץ חיפוש וערך ולחיפוש, הפונקציה תחזיר האם הערך מופיע בעץ
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
	
	
	//null פונקציה המקבלת עץ חיפוש וערך ולחיפוש, הפונקציה תחזיר הצבעה לצומת אם מופיע בעץ, אחרת תחזיר
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
	
	//פונקציה המקבלת את שורשו של עץ חיפוש וערך להוספה ומוסיפה את הערך לעץ
	public static void addToSearchTree(BinNode<Integer> t, int val)
	{
		BinNode<Integer> temp=new BinNode<Integer>(val);
		while(true)
		{
			if(val<t.getVal()) //יש לבצע הוספה בתת עץ שמאל
			{
				if(t.getLeft()==null)
				{
					t.setLeft(temp);
					return;
				}
				t=t.getLeft();
			}	
			else  //יש לבצע הוספה בתת עץ ימין
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
	
	//פונקציה הבונה עץ חיפוש בינארי
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
