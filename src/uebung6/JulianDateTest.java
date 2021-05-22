package uebung6;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JulianDateTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testDaysBetweenLocalDateTime() {
		JulianDate j = new JulianDate();
		assertEquals(1, j.daysBetween(LocalDateTime.now()));
	}


	@Test
	void testGetJulianDate() {
		JulianDate j = new JulianDate();
		assertEquals(1, j.daysBetween(LocalDateTime.now()));
	}

	@Test
	void testGetGregorianDate() {
		fail("Not yet implemented");
	}

	@Test
	void testGetYear() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMonth() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAge() {
		fail("Not yet implemented");
	}

}
