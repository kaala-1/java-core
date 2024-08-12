package besic;

import java.util.Random;

public class InbuildClasses1
{
public static void main(String args[])
{
//	System.out.println(Math.sqrt(900));
//	System.out.println(Math.cbrt(625));
//	System.out.println(Math.pow(9,4));
//	System.out.println(Math.ceil(90.878766));
//	System.out.println(Math.floor(89.6785));
//	System.out.println(Math.PI);
//	System.out.println(Math.E);
//	System.out.println(Math.abs(-90.361992));
//	System.out.println(Math.log10(10));
//	System.out.println(Math.log10(1));
//	System.out.println(Math.round(90.4567));
//	System.out.println(Math.round(90.553));
	
//	Random rd=new Random();
//	System.out.println(Math.abs(rd.nextInt()));
//	System.out.println(rd.nextInt(10));
//	System.out.println(rd.nextInt(5)+1);
	
//	System.out.println(Character.isAlphabetic('a'));
//	System.out.println(Character.isLetter('a'));
//	System.out.println(Character.isDigit('a'));
//	System.out.println(Character.isLetterOrDigit('a'));
//	System.out.println(Character.isLowerCase('A'));
//	System.out.println(Character.isUpperCase('p'));
//	
	
	String s="Ranchi city";
	String s1=new String("ranchi city");
	char name[]= {'r','a','m','g','a','r','h'};
	String s2=new String(name);
	System.out.println(s);
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s.length());
	System.out.println(s.equals(s1));
	System.out.println(s.equalsIgnoreCase(s2));
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println(s.concat(" jharkhand"));
	System.out.println(s.replace("city","town"));
	System.out.println(s.substring(5));
	System.out.println(s.substring(2,6));
	System.out.println(s1.replace(s1.substring(2,7),"xxxxxxxxxxx"));
	
}
}
