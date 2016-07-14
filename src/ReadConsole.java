import java.io.*;
//Sample Code for taking input from user through console
public class ReadConsole {
	public static void main(String[] args)throws IOException
	{
		InputStreamReader cin = null;
		try
		{
			cin = new InputStreamReader(System.in);
			System.out.println("Enter Characters, q to exit");
			char c;
			do 
			{
				c = (char) cin.read();
				System.out.print(c);
			}while(c != 'q');
			
		}
		finally
		{
			if(cin != null)
			{
				cin.close();
			}
		}
	}
}