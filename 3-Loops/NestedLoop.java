
public class NestedLoop {
	
	public static void main(String[] args) {
		
		int count1, count2; 
		
		count1 = 1; 
		while(count1 <= 3)
		{
			count2 = 1; 
			while(count2 <= 4)
			{
				System.out.println("Count2:" + count2 + "- Count1:" + count1);
				count2++; 
			}
		  count1++; 	
		}
	}

}
