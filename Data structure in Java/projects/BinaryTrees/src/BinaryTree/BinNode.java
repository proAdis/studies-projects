package BinaryTree;

public class BinNode <T>
{
	private T val;
	private BinNode<T> left;
	private BinNode<T> right;
	
	//בנאי המקבל את ערך החוליה בלבד
	public BinNode(T val) 
	{
		this.val=val;
		this.left=this.right=null;
	}
	
	//בנאי המקבל ערכים עבור 3 התכונות
	public BinNode(BinNode<T> left, T val, BinNode<T> right) 
	{
		this.val=val;
		this.left=left;
		this.right=right;
	}

	public T getVal() {
		return val;
	}

	public void setVal(T val) {
		this.val = val;
	}

	public BinNode<T> getLeft() {
		return left;
	}

	public void setLeft(BinNode<T> left) {
		this.left = left;
	}

	public BinNode<T> getRight() {
		return right;
	}

	public void setRight(BinNode<T> right) {
		this.right = right;
	}
	
}
