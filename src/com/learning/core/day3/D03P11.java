package com.learning.core.day3;
import java.util.*; 
public class D03P11
{
static boolean check(String pattern, String word)
{

	if (pattern.length() != word.length())
	return false;

	int[] ch = new int[128];
	int Len = word.length();

	for(int i = 0; i < Len; i++)
	{
	if (ch[(int)pattern.charAt(i)] == 0)
	{
		ch[(int)pattern.charAt(i)] = word.charAt(i);
	}
	else if (ch[(int)pattern.charAt(i)] != word.charAt(i))
	{
		return false;
	}
	}
	return true;
}


static void findMatchedWords(HashSet<String> dict, String pattern)
{
	int Len = pattern.length();
	String result = " ";
	for(String word : dict)
	{
	if (check(pattern, word))
	{
		result = word + " " + result;
	}
	}
	System.out.print(result);
}

public static void main(String[] args) {
	HashSet<String> dict = new HashSet<String>();
	String a,b,c,d,pattern;
	Scanner sc=new Scanner(System.in);
	a=sc.next();
	b=sc.next();
	c=sc.next();
	d=sc.next();
	pattern=sc.next();
	dict.add(a);
	dict.add(b);
	dict.add(c);
	dict.add(d);
	findMatchedWords(dict, pattern);
}
}