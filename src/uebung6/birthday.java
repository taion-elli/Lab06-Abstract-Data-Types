
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Birthday {

	public static void main(String args[]) {

		Birthday BD = new Birthday();
		JD jd = new JD();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");

		try {
			System.out.print("Gib deinen Geburtstag ein: (dd/mm/yyyy ): ");
			String birthdayString = reader.readLine();
			// Parse the date
			Date birthdate = df.parse(birthdayString);

			// Substrings: Day, Month, Year
			String[] subArray = jd.toSubstring(birthdayString);
			int[] dateInts = jd.parseToInt(subArray);
			
			/*Zwischenspeicherung: Geburtstag (Julian)
						// ist in JD.dateToJulian();*/
			
			double bd = jd.dateToJulian(dateInts);

			

			// heutiges Julian Date

			LocalDateTime today = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			
			String dateString = today.format(formatter);

			String[] t_subArray = jd.toSubstring(dateString);
			int[] t_dateInts = jd.parseToInt(t_subArray);
			

			double td = jd.dateToJulian(t_dateInts);

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
				System.out.println("Glückwunsch, Sonntagskind!");
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
			
			BD.isBirthday(dateInts, t_dateInts);
				
			
			 
			// If you have lived a number of days that is divisible by 100, print a special
			// message!
			
	        
			if (diff%100==0) {System.out.println("Congrats, you're special.");}

		} catch (Exception e) {

		}
	}
	
	public boolean isBirthday(int[] dateInts, int[] t_dateInts) {
		
		if(dateInts[0] == t_dateInts[0] && dateInts[1] == t_dateInts[1]) {
			
			System.out.println("Happy birthday, dear User!!!");
			return true;
		}
		
		else return false;
		}
}
