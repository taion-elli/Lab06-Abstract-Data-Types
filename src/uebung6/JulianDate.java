package uebung6;

// import
import java.time.LocalDateTime;
import java.time.LocalDate;

public class JulianDate {

// class variables
	public static final LocalDate START_DATE = LocalDate.of(-4712, 1, 1);

// fields 
	private int julianDate;
	private LocalDateTime gregorianDate;

// constructors
	public JulianDate() {
		this(LocalDate.now());
	}
	

	public JulianDate(int year, int month, int date) {
		this(year, month, date);
	}

	/*
	 * public JulianDate (int year, int month, int date, int hrs) { this(year,
	 * month, date, hrs, 0, 0); }
	 * 
	 * public JulianDate (int year, int month, int date, int hrs, int min) { }
	 * 
	 * public JulianDate (int year, int month, int date, int hrs, int min, int sec)
	 * { }
	 */

	public JulianDate(LocalDateTime now) {
		// TODO Auto-generated constructor stub
	}

//methods

	public double daysBetween(LocalDateTime otherDate) {
		return 0d;
	}

	/*
	 * public double daysBetween(double otherDate) { return 0d; }
	 */

// getters & setters



	public LocalDate getGregorianDate() {
		LocalDate gd = LocalDate.now();
		return gd;
	}

	public int getYear() {
		LocalDate gd = LocalDate.now();
		int year  = gd.getYear();
		return year;
	}

	public int getMonth() {
		LocalDate gd = LocalDate.now();
		int month  = gd.getMonthValue();
		return month;
	}
	
	public int getDay() {
		LocalDate gd = LocalDate.now();
		int day  = gd.getDayOfMonth();
		return day;
	}
	
	public double getJulianDate() {
		
		 double extra = (100.0 * year) + month - 190002.5;
			    return (367.0 * year) -
			      (Math.floor(7.0 * (year + Math.floor((month + 9.0) / 12.0)) / 4.0)) + 
			      Math.floor((275.0 * month) / 9.0) +  
			      day + ((hour + ((minute + (second / 60.0)) / 60.0)) / 24.0) +
			      1721013.5 - ((0.5 * extra) / Math.abs(extra)) + 0.5;
			
			
			
			return julianDate;
		}

	/*public int getAge() {
		return birthday.LocalDateTime.now();
	}*/

}
