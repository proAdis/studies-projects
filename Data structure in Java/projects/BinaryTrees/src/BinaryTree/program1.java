package BinaryTree;

public class program1 
{
	//פונקציה רקוריסיבית המקבלת עץ בינארי ומדפיסה את אבריו בסדר תחילי
	public static <T> void printPreOrder(BinNode<T> t)
	{
		if(t==null)
			return;
		System.out.print(t.getVal()+"  ");
		printPreOrder(t.getLeft());
		printPreOrder(t.getRight());
	}
	
	//פונקציה רקוריסיבית המקבלת עץ בינארי ומדפיסה את אבריו בסדר סופי
	public static <T> void printPostOrder(BinNode<T> t)
	{
		if(t==null)
			return;
		
		printPostOrder(t.getLeft());
		printPostOrder(t.getRight());
		System.out.print(t.getVal()+"  ");
	}
	

	//פונקציה רקוריסיבית המקבלת עץ בינארי ומדפיסה את אבריו בסדר תוכי
	public static <T> void printInOrder(BinNode<T> t)
	{
		if(t==null)
			return;
		
		printInOrder(t.getLeft());
		System.out.print(t.getVal()+"  ");
		printInOrder(t.getRight());
	}
	
	public static void main(String[] args) 
	{
		BinNode<Integer> t1=new BinNode<Integer>(3);
		BinNode<Integer> t2=new BinNode<Integer>(5);
		BinNode<Integer> root=new BinNode<Integer>(t1,1,t2);
		
		t2.setLeft(new BinNode<Integer>(8));
		t2.getLeft().setRight(new BinNode<Integer>(7));
		
		printPreOrder(root);
		System.out.println();
		printPostOrder(root);
		System.out.println();
		printInOrder(root);

	}

}
