package com.github.codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class Meeting {
	
	public static String meeting(String s) {
		
	    @SuppressWarnings({ "unchecked", "rawtypes" })
		TreeMap<String, List> people = new TreeMap();
        String[] persons = s.split(";");
        for(String person : persons){
           String[]  fullNames = person.split(":");
           String firstName = fullNames[1].toUpperCase();
           String secondName =  fullNames[0].toUpperCase();

           if(  !people.keySet().contains( firstName )){
               List<String> names = new ArrayList<>();
               names.add(secondName);
               people.put(firstName, names);
           }else if (  people.keySet().contains( firstName) ){
                @SuppressWarnings("unchecked")
				List<String> names = people.get(firstName );
                names.add(secondName);
                Collections.sort(names);
                people.put(firstName, names);
            }

        }

        System.out.println(people);

        StringBuilder result = new StringBuilder();
        Set<String> secondNames = people.keySet();

        for(String secondName : secondNames ){
            @SuppressWarnings("unchecked")
			List<String> names = people.get(secondName);
            for( String name  : names ){
                result.append("(").append(secondName.toUpperCase()).append(", ").append(name.toUpperCase()).append(")");
            }
        }
        return result.toString();
    }
    

	public static void main(String[] args) {
		
		 String input = "Alexis:Wahl;John:Bell;Victoria:Schwarz;Jhon:Dorny;Tom:Dorny;Abba:Dorny;";
		 System.out.println(meeting(input));
		
		

	}

}
