package strings_stringbuffer;
import java.util.*;
public class Program10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s[]=str.split(",");
		int n=Integer.parseInt(s[1]);
		for(int i=0;i<n;i++)
			System.out.print(s[0].substring(s[0].length()-n, s[0].length()));
	}

}
