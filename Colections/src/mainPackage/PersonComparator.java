package mainPackage;

import java.util.Comparator;

/*
 * Porównuje dwa obiekty klasy osoba najpierw wed³ug dlugosci sumy imienia i nazwska 
 * a je¿eli sa takie same to nazwsiko i imie w kolejnoœci leksykograficznej 
 * @author Dariusz Brzostek
 * @version 0.0.3
 */


public class PersonComparator implements Comparator<Person> {

	@Override
	/*
	 * (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(Person firstPerson, Person seconPerson) {
		if (personStringLenghtDiferent(firstPerson, seconPerson) == 0) {
			return personStringCompare(firstPerson, seconPerson);
		} else {
			return personStringLenghtDiferent(firstPerson, seconPerson);
		}

	}

	/*
	 * Porównuje sumy d³ugoœci imion nazwisk dwóch osób i zwraca ich ró¿nice
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
	 * Porównuje najpierw nazwiska osób leksykograficznie
	 * jezeli sa rózne zwaraca 1,-1 w zate¿nosci które jest piewsze w kolejnoœci
	 * jezeli sa takie same portównuje imiona i zrwraca wartoœc analogicznie do porównywania nazwisk
	 * @param firstPerson Pierwsza osoba 
	 * @param secondPerson druga osoba 
	 * @see Person
	 * @return zwraca -1,0,1 wg. meteody compareTo klasy String
	 */
	
	private int personStringCompare(Person firstPerson, Person secondPerson) {
		if (firstPerson.getSurname().compareTo(secondPerson.getSurname()) == 0) { //Porównanie nazwisk
			return firstPerson.getName().compareTo(secondPerson.getName());
		} else
			return firstPerson.getSurname().compareTo(secondPerson.getSurname());  //porównanie imion 
	}

}
