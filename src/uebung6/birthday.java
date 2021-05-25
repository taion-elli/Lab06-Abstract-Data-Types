package uebung6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class birthday {

	public static void main(String args[]) {

		birthday BD = new birthday();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");

		try {
			System.out.print("Gib deinen Geburtstag ein: (dd/mm/yyyy ): ");
			String birthdayString = reader.readLine();
			// Parse the date
			Date birthdate = df.parse(birthdayString);

			// Substrings: Day, Month, Year

			String dsub = birthdayString.substring(0, 2);
			// System.out.println(dsub);
			String msub = birthdayString.substring(3, 5);
			// System.out.println(msub);
			String ysub = birthdayString.substring(6, 10);
			// System.out.println(ysub);

			// Parsing to INT
			int dint = Integer.parseInt(dsub);
			// System.out.println(dint);

			int mint = Integer.parseInt(msub);
			// System.out.println(mint);

			int yint = Integer.parseInt(ysub);
			// System.out.println(yint);

			double bd = JD.dateToJulian(yint, mint, dint);

			// Zwischenspeicherung: Geburtstag (Julian)
			// ist in JD.dateToJulian();

			// heutiges Julian Date

			System.out.print("Gib das heutige Datum ein: (dd/mm/yyyy ): ");
			String dateString = reader.readLine();
			// Parse the date
			Date date = df.parse(dateString);

			// Substrings: Day, Month, Year

			String t_dsub = dateString.substring(0, 2);
			String t_msub = dateString.substring(3, 5);
			String t_ysub = dateString.substring(6, 10);

			// Parsing to INT
			int t_dint = Integer.parseInt(t_dsub);
			// System.out.println(t_dint);

			int t_mint = Integer.parseInt(t_msub);
			// System.out.println(t_mint);

			int t_yint = Integer.parseInt(t_ysub);
			// System.out.println(t_yint);

			double td = JD.dateToJulian(t_yint, t_mint, t_dint);

			// heutiges Julian Date - Geburtstag = Alter in Tagen

			double diff = td - bd;

			System.out.println("Du bist " + diff + " Tage alt.");

			// weekday they were born on + sunday's child
			// Jahr in y (letzten zwei zahlen) und c(ersten zwei zahlen) zerlegen
			// System.out.println(dayOfWeek);

			Calendar c = Calendar.getInstance();
			c.setTime(birthdate);
			int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

			if (dayOfWeek == 1) {
				System.out.println("Du bist an einem Sonntag geboren.");
				System.out.println("Glückwunsch, Sonntskind!");
			}
			if (dayOfWeek == 2) {
				System.out.println("Du bist an einem Montag geboren.");
			}
			if (dayOfWeek == 3) {
				System.out.println("Du bist an einem Dienstag geboren.");
			}
			if (dayOfWeek == 4) {
				System.out.println("Du bist an einem Mittwoch geboren.");
			}
			if (dayOfWeek == 5) {
				System.out.println("Du bist an einem Donnerstag geboren.");
			}
			if (dayOfWeek == 6) {
				System.out.println("Du bist an einem Freitag geboren.");
			}
			if (dayOfWeek == 7) {
				System.out.println("Du bist an einem Samstag geboren.");
			} 
  

			// is today their birthday? write out a special message.
			
			if (dint == t_dint && mint == t_mint) {
				System.out.println("Happy Birthday, du Bitch/Huso!");
			}
			 
			// If you have lived a number of days that is divisible by 100, print a special
			// message!
			
	        double diff2 = 21100;
			if (diff2%100==0) {System.out.println("Congrats, you're special.");}

		} catch (Exception e) {

		}
	}
}
