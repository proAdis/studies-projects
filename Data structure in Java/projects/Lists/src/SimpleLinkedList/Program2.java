package SimpleLinkedList;

import java.util.Scanner;


public class Program2 
{
	static Scanner in=new Scanner(System.in);
	
	//פונקציה לבניית רשימה של מספרים שלמים עבור ערכי קלט
	public static Node<Integer> buildIntegerList1()
	{
		Node<Integer> head=null, ptr, temp;
		System.out.println("Enter numbers, to finish press a negtive number:");
		
		int val=in.nextInt();
		
		if(val>-1)
		{
			ptr=head=new Node<Integer>(val);
			val=in.nextInt();
			
			while(val>-1)
			{
				//temp=new Node<Integer>(val);
				//ptr.setNext(temp);
				
				ptr.setNext(new Node<Integer>(val));
				ptr=ptr.getNext(); // <==> ptr=temp;
				val=in.nextInt();
			}
		}
		return head;
	}
	
	//פונקציה לבניית רשימה של מספרים שלמים עבור ערכי קלט
	public static Node<Integer> buildIntegerList2()
	{
		Node<Integer> head=null, ptr=null, temp;
		System.out.println("Enter numbers, to finish press a negtive number:");
		
		int val=in.nextInt();
		
		while(val>-1)
		{
			temp=new Node<Integer>(val);
			
			if(head==null)
				head=ptr=temp;
			else
			{
				ptr.setNext(temp);
				ptr=temp;  //ptr=ptr.getNext();
			}
			val=in.nextInt();
		}
		
		return head;
	}
	
	//פונקציה לבניית רשימה הפוכה לסדר הקליטה
	public static Node<Integer> buildReverseList()
	{
		Node<Integer> head=null;
		
		System.out.println("Enter numbers, to finish press a negtive number:");
		int val=in.nextInt();
		
		while(val>-1)
		{
			head=new Node<Integer>(val,head);
			val=in.nextInt();
		}
		return head;
	}
	
	
	//פונקציה המחזירה האם סכום אברי הרשימה הזוגיים מתחלק בשלמות במספר האיברים
	public static boolean fun(Node<Integer> head)
	{
		int sum=0, counter=0;
		
		while(head!=null)
		{
			if(head.getValue()%2==0)
				sum+=head.getValue();
			counter++;
			
			head=head.getNext();
		}
		
		return sum%counter==0;
	}
	
	public static void main(String[] args) 
	{
		/*
		Node<Integer> head=buildIntegerList2();
		
		Program1.printList(head);
		System.out.println(fun(head));
		*/
		Node<Integer> headR=buildReverseList();
		Program1.printList(headR);
	}
}
