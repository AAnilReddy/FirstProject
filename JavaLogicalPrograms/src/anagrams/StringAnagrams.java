package anagrams;

import java.util.Arrays;

public class StringAnagrams { 
	public static boolean stringCheck(String str1,String str2)
	{
		if (str1.length()!=str2.length())
		{				
			System.out.println("not a anagram");

			return false;
			
				
			}
		
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
	//int index=	str2.indexOf(ch2);
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("anagram");
		}
		else {
			System.out.println("not a anagram");
			
		}
		return true;
	}
	public static void main(String[] args) {
		stringCheck("anil", "ailn");
		
	}

}
