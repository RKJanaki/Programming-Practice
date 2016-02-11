//  Write an Immutable class.

package com.immutableClass;

public final class StudentDetails {
	
	private final String name;
    private final String city;

    public StudentDetails(String name,String city){
   	 this.name = name;
   	 this.city = city;
    }
	 public String getName()
	 {
		 return name;
	 }
	 public String getCity()
	 {
		 return city;
	 }
	 
	

}
