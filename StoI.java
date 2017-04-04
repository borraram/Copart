import java.util.*;

public class StoI {

	public static void main(String[] args) {
		int dec = 0, i, j, len;
		Scanner s = new Scanner(System.in);
		String str =  s.nextLine();
		len = str.length();
		if(len==0)
			System.out.println("** Error: Invalid input **");
		else
		try{
		for(i=0; i<len; i++){
			if(str.charAt(i)>'0'&& str.charAt(i)<'9')
			dec = dec * 10 + ( str.charAt(i) - '0' );
			else
			throw new InputMismatchException();
		  }
		System.out.println(dec);
		}
		catch(InputMismatchException ex)
        {
          System.out.println("** Error: Invalid input **");
         }
	}

}
