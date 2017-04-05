import java.util.*;

public class SoftwareLicenceCode {

			public static void main(String[] args)  {
			 Scanner s = new Scanner(System.in);
			 System.out.println("Enter the key ");
			 String text = s.nextLine();
//			 String text = "2-4$0r7-4k";
			 if(text.length()==0)
				 System.out.println("**Invalid Input**");
			 else
			 try{	 
			 System.out.println("enter the no of periods");
			 int period = s.nextInt();
//			 int period = 4;
			 text = text.replace("-", "");
			 String insert = "-";
// Trying to avoid special charcters 			 
				 if(!(text.matches("^[a-zA-Z0-9_]*$")))
				 	throw new InputMismatchException();
		    StringBuilder builder = new StringBuilder();

		       int index = 0;
		       String prefix = "";
		       while (index < text.length()-1)
		       {
		           // Don't put the insert in the very first iteration.
		           // This is easier than appending it *after* each substring
		           builder.append(prefix);
		           prefix = insert;
		           builder.append(text.substring(index, Math.min(index + period, text.length())));
		           index += period;
		       }
		      System.out.println(builder.toString().toUpperCase());
		}
			 catch(InputMismatchException ex)
			 {
				 System.out.println("**Invalid Input**");
			 }
	 }
	}


