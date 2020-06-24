package strings_stringbuffer;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(str.charAt(0)=='x' && str.charAt(str.length()-1)=='x')
			System.out.println(str.substring(1,str.length()-1));
		else
			System.out.println(str);
	}

}
