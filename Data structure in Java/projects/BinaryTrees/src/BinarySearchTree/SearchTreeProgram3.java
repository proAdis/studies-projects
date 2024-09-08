package BinarySearchTree;
import BinaryTree.*;

public class SearchTreeProgram3 
{
	public static <T> Node<T> buildSortedList(BinNode<T> t)
	{
		return buildSortedList(t,null);
	}
	
	//פונקציה רקורסיבית המקבלת עץ חיפוש ומחזירה רשימה מקושרת ממויינת המהווה קריאה תוכית של העץ שהתקבל
	public static <T> Node<T> buildSortedList(BinNode<T> t, Node<T> head)
	{
		if(t==null)
			return head;
		
		head=buildSortedList(t.getRight(),head);
		head=new Node<T>(t.getVal(),head);
		
		return buildSortedList(t.getLeft(), head);
	}

	
	//הפונקציה מקבלת עץ בינארי ומחזירה האם העץ הוא עץ חיפוש או לא
	//אפשרות אחת היא להיעזר בפונקציה הבונה רשימה בסדר תוכי ולבדוק האם הרשימה ממויינת
	//אפשרות נוספת היא לבדוק האם ראש הרשימה המוחזר מימין גדול יותר מערך הצומת הנוכחית
	//אם כך אין בעצם צורך בבניית רשימה, ניתן לבצע תמיד לבצע השוואה מול ערך בודד
	public static boolean isSearchTree1(BinNode<Integer> t)
	{
		int[]arr= {Integer.MIN_VALUE};
		return isSearchTree1(t, arr);
	}
	
	public static boolean isSearchTree1(BinNode<Integer> t, int[]prev)
	{
		if(t==null)
			return true;
		
		boolean flag=isSearchTree1(t.getLeft(),prev);
		
		if(!flag || t.getVal()<prev[0])
			return false;
		
		prev[0]=t.getVal();
		return isSearchTree1(t.getRight(), prev);
	}
	

	
	//פוקנציה המקבלת עץ בינארי וטווח תקין עבור צומת בעץ
	public static boolean isSearchTree(BinNode<Integer> t)
	{
		return isSearchTree(t, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	public static boolean isSearchTree(BinNode<Integer> t, int low, int high)
	{
		if(t==null)
			return true;
		
		if(!inRange(t.getVal(),low,high))
			return false;
		
		return isSearchTree(t.getLeft(), low, t.getVal()) &&
			   isSearchTree(t.getRight(), t.getVal(), high);
	}
	
	private static boolean inRange(int val, int low, int high)
	{
		return val>=low && val<=high;
	}
	
	
	
	public static void main(String[] args) 
	{
		BinNode<Integer> root=BinaryTree.program2.buildBinaryTree();
		System.out.println(isSearchTree(root));
		System.out.println(isSearchTree1(root));
		
		root=SearchTreeProgram1.buildSearchTree();
		System.out.println(isSearchTree(root));
		System.out.println(isSearchTree1(root));
	}

}
