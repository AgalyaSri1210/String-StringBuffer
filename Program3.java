package strings_stringbuffer;
import java.util.*;
import java.util.regex.Pattern;
public class Program3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++)
			System.out.print(Pattern.compile(str.substring(0,2)));
	}

}
