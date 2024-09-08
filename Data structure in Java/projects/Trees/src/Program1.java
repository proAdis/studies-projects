
public class Program1 
{
	//פונקציה רקורסיבית המקבלת עץ בינארי ומדפיסה אותו בקריאה תחילית
	public static <T> void printPreOrder(BinNode<T> t)
	{
		if(t==null)  //עץ ריק
			return;
		
		System.out.print(t.getVal()+"  ");
		
		printPreOrder(t.getLeft());
		printPreOrder(t.getRight());
	}
	
	//פונקציה רקורסיבית המקבלת עץ בינארי ומדפיסה אותו בקריאה סופית
	public static <T> void printPostOrder(BinNode<T> t)
	{
		if(t==null)  //עץ ריק
			return;
		
		printPostOrder(t.getLeft());
		printPostOrder(t.getRight());
		System.out.print(t.getVal()+"  ");
	}
	
	//פונקציה רקורסיבית המקבלת עץ בינארי ומדפיסה אותו בקריאה תוכית
	public static <T> void printInOrder(BinNode<T> t)
	{
		if(t==null)  //עץ ריק
			return;
		
		printInOrder(t.getLeft());
		System.out.print(t.getVal()+"  ");
		printInOrder(t.getRight());
	}
	
	//פונקציה המקבלת עץ בינארי ומחזירה את מספר הצמתים בעץ
	public static <T> int countNodes(BinNode<T> t)
	{
		if(t==null)
			return 0;
		
		return countNodes(t.getLeft())+countNodes(t.getRight())+1;	
	}
	
	//פונקציה המקבלת עץ בינארי ומחזירה את סכום ערכי הצמתים בעץ
	public static int sumNodes(BinNode<Integer> t)
	{
		if(t==null)
			return 0;
		
		return sumNodes(t.getLeft())+sumNodes(t.getRight())+t.getVal();	
	}
	
	
	
	
	
	//פונקציה המקבלת עץ בינארי ומחזירה את סכום ערכי הצמתים האי זוגיים בעץ
	public static int sumOddNodes(BinNode<Integer> t)
	{
		if(t==null)
			return 0;
		
		int s = sumOddNodes(t.getLeft()) + sumOddNodes(t.getRight());
		
		return s+(t.getVal()%2==1?t.getVal():0);
		
//		if(t.getVal()%2==1)
//		s+=t.getVal();
//			return s;
		
//		if(t.getVal()%2==1)
//			return sumOddNodes(t.getLeft())+sumOddNodes(t.getRight())+t.getVal();
//		
//		return sumOddNodes(t.getLeft())+sumOddNodes(t.getRight());
	}
	
	//פונקציה המקבלת עץ בינארי וערך לחיפוש ומחזירה האם הערך מופיע בעץ או לא
	public static <T> boolean isExists(BinNode<T> t, T val)
	{
		if(t==null)
			return false;
		
		if(t.getVal().equals(val))
			return true;
		
		return isExists(t.getLeft(),val) || isExists(t.getRight(),val);
		
		//return t.getVal().equals(val) || isExists(t.getLeft(),val) || isExists(t.getRight(),val);
	}
	
	//פונקציה המקבלת מספר ומחזירה את מספר ספרותיו
	public static int countDigit(int number)
	{
		int counter=0;
		while(number!=0)
		{
			counter++;
			number/=10;
		}
		return counter;
	}
	
	//ספרות digit פונקציה המקבלת עץ בינארי ומספר ספרות ומחזירה האם כל הצמתים בעץ הם בעלי 
	public static boolean isAllNodes(BinNode<Integer> t, int digit)
	{
		if(t==null)
			return true;
		
		//אם הצומת הנוכחית לא עומדת בתנאי
		if(countDigit(t.getVal())!=digit)
			return false;
		
		return isAllNodes(t.getLeft(), digit) && isAllNodes(t.getRight(), digit);
	}
	
	//צמתים בעלי ערך זוגי X פונקציה המקבלת עץ בינארי וערך, ומחזירה האם קיימים בעץ לפחות 
	public static int isAtLeastXRec(BinNode<Integer> t, int x)
	{
		if(t==null)
			return 0;
		
		int count=0;
		
		//האם הצומת הנוכחית עומדת בתנאי
		if(t.getVal()%2==0)
			count++;
		
		if(count==x)
			return 1;
		
		count+=isAtLeastXRec(t.getLeft(), x-count);
		
		if(count==x)
			return count;
		
		return count+isAtLeastXRec(t.getRight(), x-count);		
	}
	
	public static boolean isAtLeastX(BinNode<Integer> t, int x)
	{
		return x==isAtLeastXRec(t, x);
	}
	
	public static void main(String[] args) 
	{
		BinNode<Integer> t1=new BinNode<Integer>(3);
		BinNode<Integer> t2=new BinNode<Integer>(8);
				
		BinNode<Integer> root=new BinNode<Integer>(t1, 1, t2);	
				
		t2.setLeft(new BinNode<Integer>(5));
				
		printPreOrder(root);
		System.out.println();
		
		printPostOrder(root);
		System.out.println();
		
		printInOrder(root);
		System.out.println();
		
		System.out.println(countNodes(root));
		System.out.println(sumNodes(root));
		System.out.println(sumOddNodes(root));
		
		System.out.println(isExists(root, 8));
		System.out.println(isExists(root, 40));
		
		System.out.println(isAtLeastX(root, 2));
	}
}
