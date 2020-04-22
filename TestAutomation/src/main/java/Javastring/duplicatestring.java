package Javastring;

public class duplicatestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="samson Edward samson Edward";
		int cnt=0;
		char[] inp = str.toCharArray();
		System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (inp[i] == inp[j]) {
		     System.out.println(inp[j]);
		     cnt++;
		     break;

	   }
}}
}}