package strings_stringbuffer;
import java.util.*;
public class Program1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		if(sb.toString().equalsIgnoreCase(str))
			System.out.println("Palindrome");
		else
				System.out.println("Not a Palindrome");
	}

}
