package BinaryTree;

public class ScanByLeveles 
{
	//פונקציה רקורסיבית המקבלת את מספר הרמה אותה יש להדפיס
	public static <T> void printLevel(BinNode<T> t, int level)
	{
		if(t==null)
			return;
		
		if(level==0)
			System.out.print(t.getVal()+" ");
		else
		{
			printLevel(t.getLeft(), level-1);
			printLevel(t.getRight(), level-1);
		}
	}
	
	//פונקציית מעטפת המטפלת בהדפסץ עץ בסריקה רוחבית
	public static <T> void printByLevel(BinNode<T> t)
	{
		int height=program2.height(t);
		
		for(int i=0; i<height; i++)
		{
			printLevel(t, i);
			System.out.println();
		}
	}
	
	
	//פונקציה איטרטיבית המדפיסה את העץ לפי רמות
	//מתבצעת הכנסה גם של נאל
	public static <T> void printByLevel1(BinNode<T> t)
	{
		Queue<BinNode<T>> q=new Queue<BinNode<T>>();
		
		q.enqueue(t);
		
		while(!q.isEmpty())
		{
			BinNode<T> head=q.dequeue();
			
			if(head==null)
				continue;
			System.out.print(head.getVal()+"  ");
			q.enqueue(head.getLeft());
			q.enqueue(head.getRight());
		}
		System.out.println();
	}
	
	
	
	
	//פונקציה איטרטיבית המדפיסה את העץ לפי רמות
	//הפעם מבררים לפני ההכנסה ולא דוחפים נאל
	public static <T> void printByLevel2(BinNode<T> t)
	{
		if(t==null)
			return;
		
		Queue<BinNode<T>> q=new Queue<BinNode<T>>();
		
		q.enqueue(t);
		
		while(!q.isEmpty())
		{
			BinNode<T> head=q.dequeue();
			
			System.out.print(head.getVal()+"  ");
			if(head.getLeft()!=null)
				q.enqueue(head.getLeft());
			if(head.getRight()!=null)
				q.enqueue(head.getRight());
		}
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		BinNode<Integer> t=program2.buildBinaryTree();
		
		printByLevel(t);
		printByLevel1(t);
		printByLevel2(t);

	}
}
