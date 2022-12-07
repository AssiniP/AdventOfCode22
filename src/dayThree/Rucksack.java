package dayThree;

import java.util.ArrayList;
import java.util.HashSet;

public class Rucksack {
	private String itemsItContains;

	public Rucksack(String string) {
		// TODO Auto-generated constructor stub
		this.itemsItContains = string;
	}

	public Character getRepeatedItem() {
		// TODO Auto-generated method stub
		Integer lenght = itemsItContains.length();
		lenght /= 2;
		ArrayList<Character> first = new ArrayList<Character>();
		ArrayList<Character> second = new ArrayList<Character>();
		
		for(int i = 0; i < lenght; i++) {
			first.add(this.itemsItContains.charAt(i));
		}
		
		for(int i = 0; i < lenght; i++) {
			second.add(this.itemsItContains.charAt(i + lenght));
		}
		
		HashSet<Character> itemsInFirstCompartment = new HashSet<Character>(first);
		HashSet<Character> itemsInSecondCompartment = new HashSet<Character>(second);
		
		HashSet<Character> itemsInCommon = new HashSet<Character>(itemsInFirstCompartment);
		itemsInCommon.retainAll(itemsInSecondCompartment);
		
		return itemsInCommon.iterator().next();
	}

	public Integer getValueOfRepeatedItem() {
		// TODO Auto-generated method stub
		Character repeatedItem = getRepeatedItem();
		Integer itemValue = 0;
		if(Character.isUpperCase(repeatedItem)) {
			itemValue = (int)repeatedItem - 38;
		}else {
			itemValue = (int)repeatedItem - 96;
			}
		return itemValue;
	}

}
