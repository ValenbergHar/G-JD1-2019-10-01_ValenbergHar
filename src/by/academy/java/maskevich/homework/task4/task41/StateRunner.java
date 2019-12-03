package by.academy.java.maskevich.homework.task4.task41;

public class StateRunner {
	public static void main(String[] args) {
		City city1 = new City("Miensk", true, true);
		City city2 = new City("Hrodna", false, true);
		City city3 = new City("Homel", false, true);
		City city4 = new City("Lida", false, false);
		City city5 = new City("Dziatlava", false, false);

		District district1 = new District();
		District district2 = new District();
		District district3 = new District();
		District district4 = new District();
		District district5 = new District();
		
		district1.getCities().add(city1);
		district2.getCities().add(city2);
		district3.getCities().add(city3);
		district4.getCities().add(city4);
		district5.getCities().add(city5);
		
		Region region1 = new Region();
		//region1.
		
		
		
		

	}
}