import java.util.Date;

public class DateExample {
		   public static void main(String args[]) {
		       // Instantiate a Date object
		       Date date = new Date();
		       // display time and date using toString()
		       
		       try { 
		           System.out.println(date.toString() + "\n"); 
		           Thread.sleep(10*60*10); 
		           System.out.println(new Date( ) + "\n"); 
		        } catch (Exception e) { 
		            System.out.println("Got an exception!");
		        }
		   }
}

