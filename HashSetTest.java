package com.gem;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s = new HashSet<String>();
			s.add("SDf");	
			s.add("SDf");	
			s.add("om");	
			s.add("sdf");	
			s.add("OM");	
			s.remove("SDF");
		
		
		System.out.println(s);
		for(Object ss: s) {
			System.out.println(ss);
		}

	}

}
