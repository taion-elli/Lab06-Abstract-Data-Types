import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JDTest {
	
	JD jd = new JD();

	@Test
	void testDateToJulian() {
		int[] dateInts = {26, 5, 2021};
		int[] dateInts2 = {10, 10, 2005};
		int[] dateInts3 = {6, 10, 1996};
		int[] dateInts4 = {3, 10, 2001};
		int[] dateInts5 = {1, 9, 1967};
		int[] dateInts6 = {2, 9, 1970};
		int[] dateInts7 = {13, 3, 2015};
		int[] dateInts8 = {7, 1, 1940};
		int[] dateInts9 = {31, 10, 2019};
		int[] dateInts0 = {20, 4, 2006};
		
		assertEquals(jd.dateToJulian(dateInts), 2459361,5);
		assertEquals(jd.dateToJulian(dateInts2), 2453654,5);
		assertEquals(jd.dateToJulian(dateInts3), 2450363,5);
		assertEquals(jd.dateToJulian(dateInts4), 2452186,5);
		assertEquals(jd.dateToJulian(dateInts5), 2439735,5);
		assertEquals(jd.dateToJulian(dateInts6), 2440832,5);
		assertEquals(jd.dateToJulian(dateInts7), 2457095,5);
		assertEquals(jd.dateToJulian(dateInts8), 2429636,5);
		assertEquals(jd.dateToJulian(dateInts9), 2458788,5);
		assertEquals(jd.dateToJulian(dateInts0), 2453846,5);
		
	}	

}
