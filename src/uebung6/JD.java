package uebung6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JD {

	public JD() {
	}

	public static void main(String args[])  {

		JD jd = new JD();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");

		try {
			System.out.print("Gib ein Datum für die Umwandlung ein: (dd/mm/yyyy ): ");
			String dateString = reader.readLine();
			// Parse the date
			Date date = df.parse(dateString);
			
			String[] subArray = jd.toSubstring(dateString);
			// Parsing to INT
			int[] dateInts = jd.parseToInt(subArray);
			
			
			System.out.println("Dein Datum: " + dateString);
			
			System.out.println("Umwandlung: " + jd.dateToJulian(dateInts));
		
		} catch (Exception e) {

		}

	}

	public double dateToJulian(int[] dateInts) {
		
		int day = dateInts[0];
		int month = dateInts[1];
		int year = dateInts[2];
		
		double extra = (100.0 * year) + month - 190002.5;
		double result = (367.0 * year) - (Math.floor(7.0 * (year + Math.floor((month + 9.0) / 12.0)) / 4.0))
				+ Math.floor((275.0 * month) / 9.0) + day + 1721013.5 - ((0.5 * extra) / Math.abs(extra)) + 0.5;
		return result;
		
	}
	
	public String[] toSubstring(String dateString) {
		
		String[] subArray = new String[3];
		
		// Substrings: Day, Month, Year
		subArray[0] = dateString.substring(0, 2);

		subArray[1] = dateString.substring(3, 5);
					
		subArray[2] = dateString.substring(6, 10);
		
		//return array of substrings
		return subArray;
					
	}
	
	public int[] parseToInt(String[] subArray) {
		
		int[] dateInts = new int[3];
		
		dateInts[0] = Integer.parseInt(subArray[0]);
		
		dateInts[1] = Integer.parseInt(subArray[1]);
		
		dateInts[2] = Integer.parseInt(subArray[2]);
		
		return dateInts;
		
	}

}