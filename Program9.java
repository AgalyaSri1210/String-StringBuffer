package strings_stringbuffer;
import java.util.*;
public class Program9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s[]=str.split(",");
		if(s[0].length()==s[1].length()){
			for(int i=0;i<s[0].length();i++){
				System.out.print(s[0].charAt(i)+""+s[1].charAt(i));
			}
		}
		else if(s[0].length()<s[1].length()){
			for(int i=0;i<s[0].length();i++){
				System.out.print(s[0].charAt(i)+""+s[1].charAt(i));
			}
			System.out.print(s[1].substring(s[0].length(),s[1].length() ));
		}else{
			for(int i=0;i<s[1].length();i++){
				System.out.print(s[0].charAt(i)+""+s[1].charAt(i));
			}
			System.out.print(s[0].substring(s[1].length(),s[0].length() ));
		}
	}

}
