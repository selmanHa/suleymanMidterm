package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<String> qu= new LinkedList<String>();

		//add
		qu.add("First Name: ");
		qu.add("Last Name: ");
		qu.add("ID: ");
		qu.add("Email: ");
		qu.add("Address: ");

		Iterator<String> it = qu.iterator();

		while (it.hasNext()){
			System.out.println(it.next()+"_______________");
		}

		System.out.println("\nThe head of the Queue is: "+qu.peek());
		System.out.println("                       ================");

		//remove data
		qu.remove("Last Name: ");

		//printing data after data removal
		Iterator itr = qu.iterator();
		System.out.println("\nLists after data removal: ");
		while (itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
