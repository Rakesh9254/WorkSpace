package Collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {
	/*
	Lists

	Ordered: Lists store items in the order they are added.
	
	Duplicates allowed: Lists can contain duplicate items.
	
	Indexed: Lists can be accessed by index, meaning you can directly access an item by its position in the list.
	
	*/

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("Rakesh");
		aList.add("Roshan");
		aList.add("Yadav");
		aList.add("mausam");
		
		//all element print in array form
		
		System.out.println(aList);
		
		// iteralot
		
		Iterator itr = aList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		Vector<String> aList2 = new Stack<String>();
		aList2.add("Roshan");
		System.out.println(aList2);
		
		
		List sc = new ArrayList();
		sc.add("Rakesh");
		sc.add(12);
		sc.add('R');
		System.out.println(sc);

	}

}
