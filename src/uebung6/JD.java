package uebung6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class JD {

	public JD() {
	}

	public static void main(String args[]) {

		JD jd = new JD();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");

		try {
			System.out.print("Gib ein Datum für die Umwandlung ein: (dd/mm/yyyy ): ");
			String dateString = reader.readLine();
			// Parse the date
			Date date = df.parse(dateString);

			// Substrings: Day, Month, Year

			String dsub = dateString.substring(0, 2);
			// System.out.println(dsub);
			String msub = dateString.substring(3, 5);
			// System.out.println(msub);
			String ysub = dateString.substring(6, 10);
			// System.out.println(ysub);

			// Parsing to INT
			int dint = Integer.parseInt(dsub);
			System.out.println(dint);

			int mint = Integer.parseInt(msub);
			System.out.println(mint);

			int yint = Integer.parseInt(ysub);
			System.out.println(yint);

			System.out.println("Originaldatum: " + dateString);
			// System.out.println("Nach dem Parsen: " + date.toString());

			System.out.println(jd.dateToJulian(yint, mint, dint));
		} catch (Exception e) {

		}

	}

	public static double dateToJulian(int yint, int mint, int dint) {
		int year = yint;
		int month = mint;
		int day = dint;

		double extra = (100.0 * year) + month - 190002.5;
		double result = (367.0 * year) - (Math.floor(7.0 * (year + Math.floor((month + 9.0) / 12.0)) / 4.0))
				+ Math.floor((275.0 * month) / 9.0) + day + 1721013.5 - ((0.5 * extra) / Math.abs(extra)) + 0.5;
		return result;
		

	}

}