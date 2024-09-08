public class recursiaOnQueue 
{
	//פונקציה רקורסיבית המקבלת תור והופכת את סדר איבריו
	public static <T> void reverseQueue(Queue<T> q)
	{
		if(q.isEmpty())
			return;
		T val=q.dequeue();
		reverseQueue(q);
		q.enqueue(val);
	}
	
	//פונקציה רקורסיבית המקבלת תור וערך ומחזירה האם הערך נמצא בתור
	public static <T> boolean recIsExists(Queue<T> q, T val)
	{
		if(q.head()==null)
			return false;
		
		boolean ans=q.head().equals(val);
		q.enqueue(q.dequeue());
		return recIsExists(q,val) || ans ;  
		//אומנם היה יעיל יותר לעצור ברגע שנמצא הערך אותו אנו מחפשים,
		//אך היות והחלטנו לצאת מהרקורסיה רק אחרי השלמת גלגול כל אברי התור,
		//עלינו להמשיך ולבצע זימון רקורסיבי בכל מקרה
	}
	
	//פונקציית מעטפת המקבלת תור וערך ומחזירה האם הערך מופיע בתור
	public static <T> boolean isExists(Queue<T> q, T val)
	{
		q.enqueue(null);
		boolean result=recIsExists(q, val);
		q.dequeue();
		return result;
	}
	
	
	public static void main(String[] args) 
	{
		Queue<Integer> q1=program1.buildRandomQueue(10, 1, 5);
		
		program1.printQueue(q1);
		reverseQueue(q1);
		program1.printQueue(q1);
		
		System.out.println(isExists(q1, 1));
		program1.printQueue(q1);
		System.out.println(isExists(q1, 7));
		program1.printQueue(q1);
	}
}
