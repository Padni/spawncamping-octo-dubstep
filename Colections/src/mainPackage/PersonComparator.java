package mainPackage;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person firstPerson, Person seconPerson) {
		if (personStringLenghtDiferent(firstPerson, seconPerson) == 0) {
			return personStringCompare(firstPerson, seconPerson);
		} else {
			return personStringLenghtDiferent(firstPerson, seconPerson);
		}

	}

	/*
	 * Metoda porównuje sumy d³ugoœci imion nazwisk dwóch osób i zwraca ich ró¿nice
	 * @param firstPerson Pierwsza osoba odjemna
	 * @param secondPerson druga osoba odjemik
	 * @return zwaraca róznice sumy d³ugoœci imion i nazwisk 
	 * @see Person
	 */
	private int personStringLenghtDiferent(Person firstPerson, Person secondPerson) {
		int tempArg0 = firstPerson.getName().length() + firstPerson.getSurname().length();
		int tempArg1 = secondPerson.getName().length() + firstPerson.getSurname().length();

		return tempArg0 - tempArg1;
	}

	/*
	 * Metoda porównuje najpierw nazwiska osób leksykograficznie
	 * jezeli sa rózne zwaraca 1,-1 w zate¿nosci które jest piewsze w kolejnoœci
	 * jezeli sa takie same portównuje imiona i zrwraca wartoœc analogicznie do porównywania nazwisk
	 */
	
	private int personStringCompare(Person firstPerson, Person secondPerson) {
		if (firstPerson.getSurname().compareTo(secondPerson.getSurname()) == 0) { //Porównanie nazwisk
			return firstPerson.getName().compareTo(secondPerson.getName());
		} else
			return firstPerson.getSurname().compareTo(secondPerson.getSurname());  //porównanie imion 
	}

}
