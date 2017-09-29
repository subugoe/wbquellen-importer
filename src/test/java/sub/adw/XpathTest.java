package sub.adw;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class XpathTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		Xpath xpath = new Xpath(xml());
		assertEquals("testTitle", xpath.getString("//title"));
	}

	private String xml() {
		return "<mods><title>testTitle</title></mods>";
	}
}
