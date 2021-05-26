package uebung6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MetricDate extends JD {
	/*
	 * Überlegung für Umrechnung: Annahme: JulianDate Anfang = metrischer Anfang =>
	 * Juliandate (Anzahl der Tage) = MetricDays (denn dass ein Tag gleich lang ist,
	 * bleibt unverändert)
	 *
	 * Gegeben: 10 Tage -> 1 Woche, 10 Wochen -> 1 Monat, 10 Monate -> 1 Jahr =>
	 * Anzahl der Tage / 10^3 = metrische Jahresanzahl => Anzahl der Tage / 10^2 =
	 * metrische Monatsanzahl => Anzahl der Tage / 10^1 = metrische Wochenanzahl
	 * 
	 * 
	 * Ein Monat hat 100 Tage.
	 * Datumsformat: ddd/mm/yyyy
	 * 
	 */
 
	// JULIAN ZU METRISCH
	public void convertJuliantoMetric() {
		//public static void main(String args[]) {
			JD jd = new JD();
			System.out.println("Bitte gib das Julian Date ein, dass du umrechnen möchtest:");
			
		try {
			BufferedReader input = new BufferedReader ( new InputStreamReader ( System.in ) );
		    String inputString = input.readLine();
			double jdi = Double.parseDouble ( inputString );
			
			LocalDateTime today = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");		
			String dateString = today.format(formatter);
			String[] t_subArray = jd.toSubstring(dateString);
			int[] t_dateInts = jd.parseToInt(t_subArray);
			double td = jd.dateToJulian(t_dateInts);
			
			// die Differenz vom jetzigen Datum - dem eingegebenen
			// Einzelentsprechung
			
			double diff = td - jdi;
			double myear = diff/1000;
			double mmonth = diff/100;
			double mweek = diff/10;
			
			// Datum
			double my = jdi%1000;
			double mm = my/100;
			double mw = mm/10;
			double md = mw*10;
			
			int imy = (int)my;
			int imm = (int)mm;
            int imd = (int)md;
			
			
			//System.out.println(my);
			//System.out.println(mm);
			//System.out.println(mw);
			
			
			System.out.println(jdi + " würde im metrischen Kalender " + imd + "/" + imm + "/" + imy + " entsprechen.");
			System.out.println("Du bist also (Stand: jetzt) genau " + myear + " metrische Jahre alt.");
			System.out.println("Beziehungsweise " + mmonth + " Monate.");
			System.out.println("Oder auch insgesamt" + mweek + " Wochen.");

		
		} catch (Exception e) {

		}
	}

		// METRISCH ZU JULIAN

		public void convertMetrictoJulian() {
	//public static void main(String args[]) {

		MetricDate metricdate = new MetricDate();
		JD jd = new JD();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		SimpleDateFormat df = new SimpleDateFormat("ddd/mm/yyyy");
			
		try {
			System.out.println("Bitte gib das metrische Datum ein (Format: ddd/MM/yyyy), dass du umrechnen möchtest.");
			System.out.println("Beachte, dass nur der Wert für Tage 100 und der Wert für Monat 10 nicht überschreiten darf!");
			String mdateString = reader.readLine();
			
			
			// substrings
			String mdsub = mdateString.substring(0,3);
            String mmsub = mdateString.substring(4,6);
            String mysub = mdateString.substring(7);
            
            // Parsing 
            int mdint = Integer.parseInt(mdsub);    
            int mmint = Integer.parseInt(mmsub);
            int myint = Integer.parseInt(mysub);
            
            
            /* ddd/mm/yyyy
             * ddd (bleibt), da JD Gesamttagesanzahl ist
             * wochen fallen in ddd mit rein
             * 1*mm = 10*w = 100*ddd
             * 1yyyy = 10*m = 100*w = 1000*ddd
             * ges: dddd + mm + yyyy
            */
            
        double jdresult = mdint + mmint*100 + myint*1000;
			

		System.out.println(mdateString + " würde im JD-Kalender " + jdresult + " entsprechen.");

		
		} catch (Exception e) {}
		
	}
		
}


