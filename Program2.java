package strings_stringbuffer;
import java.util.*;
public class Program2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine().toLowerCase();
		String s[]=str.split(",");
		if(s[0].charAt(s[0].length()-1)==s[1].charAt(0)){
			s[0]=s[0].substring(0,s[0].length()-1);
			System.out.println(s[0]+s[1]);
		}else
			System.out.println(s[0]+" "+s[1]);
		
	}

}
