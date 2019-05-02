package lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {
	public static void main(String[] args) {
		// line...line
		List<Integer> salaries = new ArrayList<>();
		salaries.add(5000);
		salaries.add(6000);

		salaries.add(0, 3500);
		System.out.println(salaries);

		System.out.println(salaries.get(2));

		salaries.remove(new Integer(3500));
		System.out.println(salaries);

		Iterator<Integer> it = salaries.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		salaries.add(7600);
		salaries.add(7600);

		System.out.println(salaries);

		int pos = salaries.lastIndexOf(7600);
		System.out.println(pos);

		System.out.println(salaries.get(3));

	}

}
