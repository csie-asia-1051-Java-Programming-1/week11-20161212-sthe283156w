package hw;
import java.util.*;
/*
 * Date: 2016/12/12
 * Author: 105021***  ???
 */
public class hw01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String n = scn.nextLine();
		int p=scn.nextInt();
			char[]s=n.toCharArray();
		for(int i=0;i<s.length;i++)
		{char a=s[i]; int b=a ;
			System.out.print((char)(b+p));
		
		
		}
	}
}
