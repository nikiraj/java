package nn;
import java.util.*;
public class jumpingnum {
	public static void main(String args[]){
int n,f=0;
Scanner in=new Scanner(System.in);
n=in.nextInt();
int m;
String s=String.valueOf(n);
char[] ch=s.toCharArray();
for(int i=0;i<ch.length-1;i++)
{
	m=(int)ch[i+1]-(int)ch[i];
	System.out.println(m);
	if(m!=1 && m!=-1)
	{
		f=1;
	}
}
if(f==0)
{
	System.out.print("jumping number");
}
else{
	System.out.print("not a jumping number");
}
System.out.print(f);
}
	
}
