package mainPackage;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonComparator compar = new PersonComparator();

		List<Person> staff = new LinkedList<Person>();

		staff.add(new Person("q", "q", 12));
		staff.add(new Person("qwerty", "qwerty", 21));
		staff.add(new Person("qwertyu", "qwertyu", 21));
		staff.add(new Person("abcdefg", "qwertyu", 15));
		System.out.println(staff);
		Collections.sort(staff, compar);
		System.out.println(staff);

	}

}
