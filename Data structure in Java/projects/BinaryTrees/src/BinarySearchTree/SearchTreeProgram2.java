package BinarySearchTree;

import BinaryTree.*;

public class SearchTreeProgram2 
{
	//פונקציה המקבלת עץ חיפוש וערך להסרה ומסירה אותו מהעץ, אין התייחסות לפגיעה בשורש העץ
	public static void removeVal(BinNode<Integer> t, int val)
	{
		//אילו לכל צומת היתה הפניה לאב, ניתן היה לעשות שימוש בפונקציית החיפוש...
		
		BinNode<Integer> prev=t, v;
		
		while(t!=null && t.getVal()!=val)
		{
			prev=t;
			
			if(val<t.getVal())
				t=t.getLeft();
			else
				t=t.getRight();
		}
		
		if(t==null) //הערך לא הופיע בעץ
			return;
		
		v=t;   //יהי V הצומת שיש להסיר...
		
		//באיזה מקרה מדובר? אב לשני בנים / לבן יחיד / עלה
		if(BinaryTree.program2.isFull(t))  //אב לשני בנים
		{
			prev=v;
			v=v.getRight();
			while(v.getLeft()!=null)  //כל עוד יש בן שמאלי נתקדם לעלה או לאב לבן יחיד
			{
				prev=v;
				v=v.getLeft();
			}
			t.setVal(v.getVal());
		}
			
		//V כעת הצומת שיש להסיר הינה או עלה או אב לבן יחיד
		t=v.getLeft();
		if(v.getRight()!=null)
			t=v.getRight();
		
		//מי אני עבור אבא שלי? בן ימני או שמאלי?
		if(prev.getLeft()==v)
			prev.setLeft(t);
		else
			prev.setRight(t);
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		
		
		
		

	}

}
