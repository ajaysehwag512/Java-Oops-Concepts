public class ArrayOperations {
	public static void main(String[] args){
		double myList[] = {1.9,25.0,0.4,3.5,15.4};
		
		//Printing all array elements
		for(int i=0; i<myList.length; i++)
		{
			System.out.println(myList[i]+" ");
		}
		
		//Summing all the elements
		double total = 0.0;
		for(int i=0; i<myList.length; i++)
		{
			 total = total + myList[i];
		}
		System.out.println("Sum of the list elements : "+total);
		
		//Find Max Element
		double max = myList[0];
	      for (int i = 1; i < myList.length; i++) {
	         if (myList[i] > max) max = myList[i];
	      }
	      System.out.println("Max is " + max);
	}
}
