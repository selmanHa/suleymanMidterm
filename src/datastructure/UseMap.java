package datastructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		HashMap<String, Integer> keyValue= new HashMap<String, Integer>();

		//add data
		keyValue.put("Dallas", 1);
		keyValue.put("Huston", 1);
		keyValue.put("Minnesota", 11);

		Iterator it = keyValue.entrySet().iterator();

		System.out.println("I lived in: ");
		System.out.println("===========");
		while (it.hasNext()){
			Map.Entry setMap = (Map.Entry)it.next();
			System.out.println(setMap.getKey()+" : "+setMap.getValue()+" years");
		}

	}

}
