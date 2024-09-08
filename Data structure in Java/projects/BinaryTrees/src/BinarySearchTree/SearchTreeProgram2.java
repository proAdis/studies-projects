package BinarySearchTree;

import BinaryTree.*;

public class SearchTreeProgram2 
{
	//������� ������ �� ����� ���� ����� ������ ���� ����, ��� �������� ������ ����� ���
	public static void removeVal(BinNode<Integer> t, int val)
	{
		//���� ��� ���� ���� ����� ���, ���� ��� ����� ����� ��������� ������...
		
		BinNode<Integer> prev=t, v;
		
		while(t!=null && t.getVal()!=val)
		{
			prev=t;
			
			if(val<t.getVal())
				t=t.getLeft();
			else
				t=t.getRight();
		}
		
		if(t==null) //���� �� ����� ���
			return;
		
		v=t;   //��� V ����� ��� �����...
		
		//����� ���� �����? �� ���� ���� / ��� ���� / ���
		if(BinaryTree.program2.isFull(t))  //�� ���� ����
		{
			prev=v;
			v=v.getRight();
			while(v.getLeft()!=null)  //�� ��� �� �� ����� ����� ���� �� ��� ��� ����
			{
				prev=v;
				v=v.getLeft();
			}
			t.setVal(v.getVal());
		}
			
		//V ��� ����� ��� ����� ���� �� ��� �� �� ��� ����
		t=v.getLeft();
		if(v.getRight()!=null)
			t=v.getRight();
		
		//�� ��� ���� ��� ���? �� ���� �� �����?
		if(prev.getLeft()==v)
			prev.setLeft(t);
		else
			prev.setRight(t);
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		
		
		
		

	}

}
