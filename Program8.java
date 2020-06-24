package strings_stringbuffer;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		while(str.contains("*")){
			int index=str.indexOf("*");
			String s=str.substring(index-1,index+2);
			str=str.replace(s,"");
		}
		System.out.println(str);
	}

}
