package SimpleLinkedList;



public class RemoveFromList 
{
	//פונקציה המקבלת רשימה וערך להסרה ומסירה את המופע הראשון של הערך מהרשימה
	public static <T> Node<T> removeFirst(Node<T> head, T val)
	{
		if(head==null)
			return null;
		if(head.getValue().equals(val)) //אם המופע הראשון נמצא בראש נחזיר את החוליה השניה ונסיים
			return head.getNext();
		
		//חיפוש המופע הראשון בהמשך הרשימה
		Node<T> ptr=head;
		
		//התקדמות על פני כל הרשימה
		while(ptr.getNext()!=null)
		{
			if(ptr.getNext().getValue().equals(val)) //במידה ונתקלנו בערך נסיר ונסיים
			{
				ptr.setNext(ptr.getNext().getNext());
				return head;
			}
			ptr=ptr.getNext(); //במידה ולא- נתקדם לחוליה הבאה
		}
		
		/*
		//כל עוד לא הגעתי לסוף הרשימה וגם לא מצאתי את הערך שחיפשתי
		while(ptr.getNext()!=null && !ptr.getNext().getValue().equals(val))
			ptr=ptr.getNext();
		
		//חובה לברר מאיזו סיבה יצאתי מהלולאה
		if(ptr.getNext()!=null)//אכן קיים מופע של הערך ויש להסירו
		{
			ptr.setNext(ptr.getNext().getNext());
		}
		*/
			
		return head;
	}
	
	//פונקציה המקבלת רשימה וערך להסרה ומסירה את כל המופעים של הערך מהרשימה
	public static <T> Node<T> removeAll(Node<T> head, T val)
	{
		if(head==null)
			return null;
		
		//תחילה נטפל בהסרת המופעים מהמשך הרשימה, לבסוף נטפל בראש
		Node<T> ptr=head;
		while(ptr.getNext()!=null)
		{
			if(ptr.getNext().getValue().equals(val)) //מצאתי מופע של הערך בחוליה הבאה
				ptr.setNext(ptr.getNext().getNext());
			else
				ptr=ptr.getNext(); //הקידום יתבצע אך ורק כאשר לא הוסרה חוליה כיוון ש
			//!!!עצם ההסרה זהו הקידום!!!
		}
		
		//נבדוק את ראש הרשימה ונטפל בהסרה אם נדרש
		if(head.getValue().equals(val))
			head=head.getNext();  //return head.getNext();
		
		return head;
	}
	
	//פונקציה המקבלת רשימה וערך להסרה ומסירה את כל המופעים של הערך מהרשימה
	public static <T> Node<T> removeAll2(Node<T> head, T val)
	{
		//נקדם את הראש כל עוד נתקלים במופעים של הערך להסרה
		while(head!=null && head.getValue().equals(val))
			head=head.getNext();
		
		if(head==null)
			return null;
		
		//תחילה נטפל בהסרת המופעים מהמשך הרשימה, לבסוף נטפל בראש
		Node<T> ptr=head;
		while(ptr.getNext()!=null)
		{
			if(ptr.getNext().getValue().equals(val)) //מצאתי מופע של הערך בחוליה הבאה
				ptr.setNext(ptr.getNext().getNext());
			else
				ptr=ptr.getNext(); //הקידום יתבצע אך ורק כאשר לא הוסרה חוליה כיוון ש
			//!!!עצם ההסרה זהו הקידום!!!
		}
		
		return head;
	}
	
	public static void main(String[] args) 
	{
		Node<Integer> head=Program2.buildIntegerList1();
		Program1.printList(head);
		
		head=removeFirst(head, 2);
		Program1.printList(head);
		head=removeAll(head, 4);
		Program1.printList(head);
		head=removeAll2(head, 1);
		Program1.printList(head);
		
		
	}

}
