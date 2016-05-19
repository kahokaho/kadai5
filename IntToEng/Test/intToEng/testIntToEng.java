package intToEng;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;


public class testIntToEng {

	@Test
	public void testやくせるかな() {
		IntToEng ite = new IntToEng();
		String expected = "eleven";
		String actual = ite.translateEng(11);
		assertThat(actual, is(expected));
		
		String expected2 = "twentyfour";
		String actual2 = ite.translateEng(24);
		assertThat(actual2, is(expected2));
		
		String expected3 = "hundred";
		String actual3 = ite.translateEng(100);
		assertThat(actual3, is(expected3));
		
		String expected4 = "ninetynine";
		String actual4 = ite.translateEng(99);
		assertThat(actual4, is(expected4));

		String expected5 = "eightyfive";
		String actual5 = ite.translateEng(85);
		assertThat(actual5, is(expected5));
		
		String expected6 = "fourtysix";
		String actual6 = ite.translateEng(46);
		assertThat(actual6, is(expected6));
		
		String expected7 = "thirtyseven";
		String actual7 = ite.translateEng(37);
		assertThat(actual7, is(expected7));
		
		String expected8 = "seventeen";
		String actual8 = ite.translateEng(17);
		assertThat(actual8, is(expected8));
	}

}
