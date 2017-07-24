package hunter;

import java.util.Scanner;

public class encoder {
public static void main(String[] args) {
	String s,sub="";
	int n;
	Scanner in=new Scanner(System.in);
	s=in.next();
	n=s.indexOf('x');
	System.out.println(n);
	char a=s.charAt(n-1);
	int p=Character.getNumericValue(a);
	System.out.println(a);
	for(char i=0;i<p;i++)
	{
		sub=sub+s.charAt(n+1);
	}
String str=s.substring(0,n-1)+sub+s.substring(n+2);
System.out.print(str);
}
}
