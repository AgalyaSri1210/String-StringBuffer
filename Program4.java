package strings_stringbuffer;
import java.util.*;
public class Program4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(str.length()%2 !=0)
				System.out.println("null");
		else
				System.out.println(str.substring(0,str.length()/2));
	}

}
