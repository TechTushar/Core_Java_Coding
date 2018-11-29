package com.initailConcepts;

public class BarkingDog {

	public static void main(String[] args) {
		//we have dod that likes to bark and need to wake up if dog is barking at night
		boolean isBark = bark(true,6);
		System.out.println("the dog is barking   :" + isBark);
	}
	public static boolean bark(boolean barking,int hourOfDay){
		if((!(barking == true)) && (hourOfDay >22 )&& (hourOfDay <= 8)) {
			return true;
		}
		else {
			return false;
		}
		//return -1;
	}

}
