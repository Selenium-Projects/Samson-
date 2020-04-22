package Javastring;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Stringbuilderstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] name = {"Samson"," Edward", "Samson"," Edward"};
	    Set<String> myset  = new HashSet<String>();
	    Collections.addAll(myset,name);

	       System.out.println(myset);

	}

}
