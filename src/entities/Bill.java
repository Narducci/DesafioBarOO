package entities;

public class Bill {

	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double feeding() {
		double beerPrice = 5.0;
		double softDrinkPrice = 3.0;
		double barbecuePrice = 7.0;
		return (beerPrice * beer) + (barbecuePrice * barbecue) + (softDrinkPrice * softDrink);
	}
	
	public double ticket() {
		if (gender == 'M') {
			return 10.0;
		}
		else {
			return 8.0;			
		}
	}

	public double cover() {
		double coverPrice = 4.0;
		if (feeding() > 30.0) {
			coverPrice = 0;			
		}
		return coverPrice;
	}
	
	public double total() {
		return feeding() + ticket() + cover();
	}
}
