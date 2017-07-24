package nn;

import java.util.*;
public class royraj {
	public static void main(String[] args){
		String a="Meena";
		String b="Rai";
		int n=6;
		String str="";
		String pin="636003";
		int l=a.length();
		int l1=b.length();
		String c=a.substring(0,1);
		String d=b.substring(0,1);
		String e=pin.substring(0,1);
		String f=pin.substring(pin.length()-1);
		char[] ch=a.toCharArray();
		char[] ch1=a.toCharArray();
		int x=Integer.parseInt(e);
		int y=Integer.parseInt(f);
		if(l==l1){
			if(x>y){
				str=str+a;
			}
			else{
				str=str+b;
			}
		}
		else{
			if(l>l1){
				str=str+b;
			}
			else{
				str=str+a;
		}
		}
		System.out.println(c+str+y+x);	
		}
	}
		
		

