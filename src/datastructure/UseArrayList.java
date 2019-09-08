package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		ArrayList<String> list = new ArrayList<String>();
		LinkedList list1 = new LinkedList();
		Stack<String> list2 = new Stack<>();

		//adding data
		list.add("Java");
		list.add("SQL");
		list.add("JavaScript");
		list.add("Python");
		list.add("C++");
		list.add("HTML5");

		//retrieving data
		System.out.println("----My favorite languages----");
		for (String str:list) {
			System.out.println(str);

		}

		//removing data
		list.remove("C++");
		list.remove("Python");

		System.out.println("\n----I have learned about these languages so far----");
		for (String str:list) {
			System.out.println(str);

		}

		//peek method using linked list
		list1.add("Java");
		list1.add("SQL");
		list1.add("JavaScript");
		list1.add("Python");
		list1.add("C++");
		list1.add("HTML5");

		System.out.println("\nThe language at the top using linked list now is: "+list1.peek());


		//peek method using Stack
		list2.push("Java");
		list2.push("SQL");
		list2.push("JavaScript");
		list2.push("Python");
		list2.push("C++");
		list2.push("HTML5");

		System.out.println("\nThe language at the top using Stack now is: "+list2.peek());

	}

}
