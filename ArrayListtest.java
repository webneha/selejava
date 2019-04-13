package com.gem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List list = new ArrayList();
      System.out.println(list);
      System.out.println(list.size());
      list.add("aa");
      list.add(10);
      list.add("om");
      list.add(null);
      list.add(27.5);
    //  list.remove("om");
      System.out.println(list);
      Collections.sort(list);
     /* for(int i=0; i<list.size(); i++)
      {
    	  System.out.println(list.get(i));
      }*/
    	  for(Object ob : list) {
    		  System.out.println(ob);
    	  }
    /* Iterator<Object> itr = list.iterator();
     while(itr.hasNext()) {
     System.out.println(itr.next());
	  }*/
	
	/*	String[] s=new String[]{"om","pandey","chor","hai"};
		List<String> list= new ArrayList<>();
		for(String ss:s) {
			list.add(ss);
		}
		System.out.println(list);*/
	/*List<String> list= Arrays.asList(new String[]{"om","pandey","chor","hai"});
	  Iterator<String> itr = list.iterator();
	  while(itr.hasNext()) {
		  System.out.println(itr.next());
	  }*/
		
	}	
	}


