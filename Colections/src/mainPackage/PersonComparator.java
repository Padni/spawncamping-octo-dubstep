package mainPackage;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person arg0, Person arg1) {

		if (PersonStringsLenght(arg0, arg1) > 0) {
			return 1;
		} else if (PersonStringsLenght(arg0, arg1) < 0) {
			return -1;
		} else {
			return PersonStringCompare(arg0, arg1);
		}

	}

	private int PersonStringsLenght(Person arg0, Person arg1) {
		int tempArg0 = arg0.getName().length() + arg0.getSurname().length();
		int tempArg1 = arg1.getName().length() + arg0.getSurname().length();

		return tempArg0 - tempArg1;
	}

	private int PersonStringCompare(Person arg0, Person arg1) {
		if (arg0.getSurname().compareTo(arg1.getSurname()) > 0) {
			return 1;
		} else if (arg0.getSurname().compareTo(arg1.getSurname()) < 0) {
			return -1;
		} else {
			if (arg0.getName().compareTo(arg1.getName()) > 0) {
				return 1;
			} else if (arg0.getName().compareTo(arg1.getName()) < 0) {
				return -1;
			} else {
				return 0;
			}

		}
	}

}
