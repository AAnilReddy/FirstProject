package anagrams;

import java.util.Scanner;

public class PyramidDemo {
	PyramidDemo(String str)
	{
		
	}
	public static void main(String[] args) {
		/*for(int i=5;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
		String rev="";
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
	String org=	sc.nextLine();
//char[] ch=	org.toCharArray();
for(int i=org.length()-1;i>=0;i--)
{
	rev=rev+org.charAt(i);
}
if(org.equals(rev))
{
	System.out.println("palindrome");
}
else
{
	System.out.println("not a palindrome");
	
	
	
}
		
	String s="hello";
	s=s.concat("world");
	
	System.out.println(s);
		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb);*/
		
		
		
		PyramidDemo d=new PyramidDemo("hello");
		PyramidDemo d1=new PyramidDemo("hello");
		
		System.out.println(d.equals(d1));
		String s="reddy";
		String s1="reddy";
		System.out.println(s.equals(s1));
		String s2=new String("abc");
		String s3=new String("abc");
		System.out.println(s2.equals(s3));
		
			System.out.println(s2==s3);
		
		
		StringBuffer sb=new StringBuffer("anil");
		StringBuffer sb1=new StringBuffer("anil");
		System.out.println(sb.equals(sb1));
	}

}
