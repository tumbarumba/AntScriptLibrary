package example;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DeepThoughtTest {
	
	private DeepThought deepThought;
	
	@Before
	public void setUp() {
		deepThought = new DeepThought();
	}

	@Test
	public void testResult() {
		assertEquals(42, deepThought.getResult());
	}

}
