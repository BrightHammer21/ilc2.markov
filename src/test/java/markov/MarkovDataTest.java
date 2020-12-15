package markov;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MarkovDataTest {

	@Test
	public void test_Read() {
		MarkovData data = new MarkovData();

		String t = "coucou ça va ?";
		data.read(t);

		String expected = "coucou ça va ?";
		String actual = data.getKeyWord(0)+" "+data.getKeyWord(1)+" "+data.getKeyWord(2)+" "+data.getKeyWord(3);

		assertEquals(expected,actual);
	}

	@Test
	public void test_RenforceWord_True() {

		String t = "coucou ça va";
		MarkovData data = new MarkovData();

		data.learnWord("coucou",t);

		boolean result = data.renforceWord("coucou", t);
		assertTrue(result);

	}

}
