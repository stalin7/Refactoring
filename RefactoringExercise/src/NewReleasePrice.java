
public class NewReleasePrice extends Price {

	@Override
	int getPriceCode() {
		// TODO Auto-generated method stub
		return Movie.NEW_RELEASE;
	}

	double getCharge(int daysRented){
		return daysRented * 3;
		}
	
	@Override
	public 	int getFrequentRenterPoints(int daysRented) {
		return (daysRented > 1) ? 2: 1;
		}

}
