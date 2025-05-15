package com.pack;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModify {

	public static void main(String[] args) {
		ConcurrentHashMap<String, String>cmap=new ConcurrentHashMap<String, String>();
		
		cmap.put("fname", "rajendra");
		cmap.put("mname", "paras");
		cmap.put("lname", "kumar");
		
		Iterator<Entry<String,String>>itr=cmap.entrySet().iterator();
		
		int c=1;
		while(itr.hasNext()) {
			cmap.put("address"+(c),"22111"+c);
			c++;
			Entry<String,String>itrm=itr.next();
			System.out.println(itrm.getKey()+" "+itrm.getValue());
			
		}
	}

}
