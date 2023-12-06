package Collectionframework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.random.RandomGenerator.ArbitrarilyJumpableGenerator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<String>();
		al.add("Rakesh");
		al.add("Roshan");

		Iterator<String> iterator = al.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
