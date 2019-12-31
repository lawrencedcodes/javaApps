import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {
	
	//properties
	Map<String,Book> bookCollection = new HashMap<String, Book>();
	public Map<String, Book> getBookCollection() {
		return bookCollection;
	}

	public void setBookCollection(Map<String, Book> bookCollection) {
		this.bookCollection = bookCollection;
	}

	public int getCurrentDay() {
		return currentDay;
	}

	public void setCurrentDay(int currentDay) {
		this.currentDay = currentDay;
	}

	public int getLengthOfCheckedOutPeriod() {
		return lengthOfCheckedOutPeriod;
	}

	public void setLengthOfCheckedOutPeriod(int lengthOfCheckedOutPeriod) {
		this.lengthOfCheckedOutPeriod = lengthOfCheckedOutPeriod;
	}

	public double getInitialLateFee() {
		return initialLateFee;
	}

	public void setInitialLateFee(double initialLateFee) {
		this.initialLateFee = initialLateFee;
	}

	public double getFeePerLateDay() {
		return feePerLateDay;
	}

	public void setFeePerLateDay(double feePerLateDay) {
		this.feePerLateDay = feePerLateDay;
	}

	public LibraryCatalogue(Map<String, Book> bookCollection, int currentDay, int lengthOfCheckedOutPeriod,
			double initialLateFee, double feePerLateDay) {
		super();
		this.bookCollection = bookCollection;
		this.currentDay = currentDay;
		this.lengthOfCheckedOutPeriod = lengthOfCheckedOutPeriod;
		this.initialLateFee = initialLateFee;
		this.feePerLateDay = feePerLateDay;
	}

	int currentDay = 0;
	int lengthOfCheckedOutPeriod = 7;
	double initialLateFee = .50;
	double feePerLateDay = 1.00;
	
	public void checkOut(String title) {
		book = getBook
	}
	public void checkIn(String title) {
		
	}
	public void bookAlreadyCheckedOut(Book book) {
		
	}
	public static void main(String[] args) {
		
		

	}

}
