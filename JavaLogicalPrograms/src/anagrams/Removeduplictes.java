package anagrams;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Removeduplictes {
	public static void main(String[] args) {
		String str="sandeep";
		Set<Character> set=new HashSet<>();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			Character ch=	str.charAt(i);
		if(!set.contains(ch))
		{
			set.add(ch);
			sb.append(ch);
		}
		}
		System.out.println(sb);
		
	Pattern p=	Pattern.compile("a");
	Matcher m=	p.matcher("anilreddyanilaaaaanil");
int 	count =0;
	while(m.find())
	{
		System.out.println(m.start()+"######"+m.end());
		count++;
		
	}
	System.out.println(count);
		
		
		
		
		String s="reamesh";
	StringBuilder sf=new StringBuilder();
	sf.append("abc");
	sf.append(s);
		System.out.println(sf);
		int s2=s.indexOf('m');
System.out.println(s2);		
		
		
		
	}

}
