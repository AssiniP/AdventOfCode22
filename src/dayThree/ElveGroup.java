package dayThree;

import java.util.ArrayList;
import java.util.HashSet;

public class ElveGroup {
	public ArrayList<Rucksack> sacksInGroup;

	public ElveGroup() {
		super();
		this.sacksInGroup = new ArrayList<Rucksack>();
	}

	public void addRucksack(Rucksack sack) {
		// TODO Auto-generated method stub
		this.sacksInGroup.add(sack);
	}

	public Character getBadge() {
		// TODO Auto-generated method stub
		Rucksack one = this.sacksInGroup.get(0);
		Rucksack two = this.sacksInGroup.get(1);
		Rucksack three = this.sacksInGroup.get(2);
		
		HashSet<Character> first = getSetOfItemsInSack(one);
		HashSet<Character> second = getSetOfItemsInSack(two);
		HashSet<Character> third = getSetOfItemsInSack(three);
		
		HashSet<Character> badge = new HashSet<Character>(first);
		badge.retainAll(second);
		badge.retainAll(third);
		return badge.iterator().next();
	}

	private HashSet<Character> getSetOfItemsInSack(Rucksack sack) {
		// TODO Auto-generated method stub
		HashSet<Character> set = new HashSet<Character>();
		for(int i = 0; i < sack.getItemsItContains().length(); i++) {
			set.add(sack.getItemsItContains().charAt(i));
		}
		return set;
	}

	public Integer getValueOfBadge() {
		// TODO Auto-generated method stub
		Character badge = getBadge();
		Integer badgeValue = 0;
		if(Character.isUpperCase(badge)) {
			badgeValue = (int)badge - 38;
		}else {
			badgeValue = (int)badge - 96;
			}
		return badgeValue;
	}

}
