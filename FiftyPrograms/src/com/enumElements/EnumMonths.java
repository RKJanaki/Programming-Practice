// Write a program that defines an enum having months of the year and then prints the value of all the enum elements.


package com.enumElements;


	 enum Months {
		JANUARY,
		FEBRUARY,
		MARCH,
		APRIL,
		MAY,
		JUNE,
		JULY,
		AUGUST,
		SEPTEMBER,
		OCTOBER,
		NOVEMBER,
		DECEMBER
		}
	
	 class EnumMonths {
		public static void main(String[] args) {
			//Months mon;
			for(Months mon:Months.values()){
				System.out.println(mon);
			}
		}
}
