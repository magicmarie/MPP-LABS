package prob4;

public class Driver {
	public static void main(String[] args) {

		Object[] objects = { new House(9000), new Condo(2), new Trailer() };
		double totalRent = Admin.computeTotalRent(objects);
		System.out.println("Not refactored: " + totalRent); // 2200

		// Refactor using polymorphism
		Property house = new House(9000);
		Property condo = new Condo(2);
		Property trailer = new Trailer();

		Property[] objects2 = { house, condo, trailer };
		double totalRent2 = Admin.computeTotalRentWithInheritance(objects2);
		System.out.println();
		System.out.println("Refactored: " + totalRent2); // 2200
	}
}
