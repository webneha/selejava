package com.gem;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Smap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   HashMap<String, String> s=new HashMap<>();
 Object t=  s.put("neha", null);
 s.put("star", null);
  Object p= s.put(null, "phadi");
  s.put(null, "ss");
  HashMap<String, String> p1=new HashMap<>();
 p1.put("gdhiii", "ASD");
  p1.put("djdjjdj", "SADasdSAD");
   p1.put(null, "askdmksam");
   s.put(null, "ss");
  //System.out.println(s);
  
 Set<String> pp= s.keySet();
// System.out.println(pp);
 Object oss=s.values();
 //System.out.println(oss);
 s.putAll(p1);
 Set<Entry<String, String>> ent= s.entrySet();
 System.out.println(ent);
	}
	

}
