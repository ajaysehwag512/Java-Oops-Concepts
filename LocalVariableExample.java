
public class LocalVariableExample {
		public void pupAge(){
	      int age=0;//Local Variable declared inside method
	      age = age + 7;
	      System.out.println("Puppy age is : " + age);
	   }
		
	public static void main(String[] args){
	LocalVariableExample lv = new LocalVariableExample();
	lv.pupAge(); //calling method name using object referecne
}
}
