

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RentalTest {

	Movie movie;
	int days = 5;
	Rental rental;
	
	@Before
	public void setUp(){
		movie = new Movie("test",0);
		rental = new Rental(movie, days);
	}
	
	@Test
	public void testGetDaysRented() {
		assertEquals(days, rental.getDaysRented());
	}

	@Test
	public void testGetMovie() {
		assertEquals(movie, rental.getMovie());
	}

}
