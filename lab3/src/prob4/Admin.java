package prob4;

public class Admin {
	public static double computeTotalRent(Object[] properties) {
		double totalRent = 0;
		for (Object o : properties) {
			if (o instanceof House) {
				House house = (House) o;
				totalRent += house.computeRent();
			}
			else if (o instanceof Condo) {
				Condo condo = (Condo) o;
				totalRent += condo.computeRent();
			}
			else if (o instanceof Trailer) {
				Trailer trailer = (Trailer) o;
				totalRent += trailer.computeRent();
			}
		}
		return totalRent;
	}

	public static double computeTotalRentWithInheritance(Property[] properties) {
		double totalRent = 0;

		for (Property p : properties) {
			totalRent += p.computeRent();
		}

		return totalRent;
	}
}
