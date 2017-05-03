
import org.junit.Test;
import static org.junit.Assert.*;


public class MovieTest {


	@Test
	public void testTitel() {
		String titel = "MovieTitle";
		Movie m = new Movie(titel,0);
		assertEquals(titel, m.getTitle());
	}
	
	@Test
	public void testPriceCode() {
		int pt = 1;
		Movie m = new Movie("a",pt);
		assertEquals(pt, m.getPriceCode());
		pt = 0;
		m.setPriceCode(pt);
		assertEquals(pt, m.getPriceCode());
	}

}
