package anagrams;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		String rev="";
		System.out.println("enter a value");
		Scanner sc=new Scanner(System.in);
		//String org="momd";
	String org=	sc.nextLine();
	for(int i=0;i<org.length();i++)
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
	
	
	/*for(int i=5;i>0;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	String s="anil";
	 s=s+'b';
		System.out.println(s);
		
		System.out.println("enter a string:");
		@SuppressWarnings("resource")
		Scanner sc1=new Scanner(System.in);
	String val=	sc1.nextLine();
	int count=0;
char[] ch=	val.toCharArray();
for (char c : ch) {
	switch (c) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
		count++;
		
		break;

	
	}
	
}
		
System.out.println("no of vowels is:"+count);*/	
	}

}
