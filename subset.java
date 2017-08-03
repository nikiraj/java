package nn;
import java.util.*;
public class subset {
public static void main(String args[])
{
	int n;
	String s="programming";
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	for(int i=0;i<s.length();i++)
	{
		System.out.println(s.substring(0,1)+s.substring(i+1,i+2));
	}
}
}
