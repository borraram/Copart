import java.util.*;

public class SoftwareLicenceCode {

			public static void main(String[] args)  {
			 Scanner s = new Scanner(System.in);
			 System.out.println("Enter the key ");
			 String text = s.nextLine();
			 if(text.length()==0)
				 System.out.println("**Invalid Input**");
			 else
			 try{	 
			 System.out.println("enter the no of periods");
			 int period = s.nextInt();
			 text = text.replace("-", "");
			 String insert = "-";
			 text.toLowerCase();
// Trying to avoid special charcters 			 
//			 for(int i=0;i<text.length();i++)
//				 if((!(text.charAt(i)>'a'&&text.charAt(i)<'z')))
//				 	 {
//					 if(text.charAt(i)>'0'&& text.charAt(i)<'9');
//					 else
//					 throw new InputMismatchException();
//				 	 }
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


