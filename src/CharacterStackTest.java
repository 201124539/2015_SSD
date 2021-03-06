import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import defect.CharacterStack;


public class CharacterStackTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		// Empty
	}

	@Test
	public void testDefaultConstructor() {
		CharacterStack cs = new CharacterStack();
		assertEquals(0, cs.getSize());
	}
	
	@Test
	public void testCharConstructor() {
		CharacterStack cs = new CharacterStack('\uFFFF');
		assertEquals(1, cs.getSize());
	}
	
	@Test(expected = EmptyStackException.class)
	public void testPop() {
		CharacterStack cs = new CharacterStack();
		cs.pop();
	}
	
	@Test
	public void testStringConstructor() {
		CharacterStack cs = new CharacterStack("Test");
		assertEquals(4, cs.getSize());
	}
}
