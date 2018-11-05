package Project1;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitModuleTest {

	String code = "0000";
	String title = "Name";
	int semOneCredits = 1;
	int semTwoCredits = 2;
	int semThreeCredits = 3;
	int level = 7;
	Module module = new Module(code, title, semOneCredits, semTwoCredits, semThreeCredits, level);
	
	@Test
	public void testGetCode() {
		assertEquals(module.getCode(), code);
	}

	@Test
	public void testGetTitle() {
		assertEquals(module.getTitle(), title);
	}

	@Test
	public void testGetSemesterOneCredits() {
		assertEquals(module.getSemesterOneCredits(), semOneCredits);
	}

	@Test
	public void testGetSemesterTwoCredits() {
		assertEquals(module.getSemesterTwoCredits(), semTwoCredits);
	}

	@Test
	public void testGetSemesterThreeCredits() {
		assertEquals(module.getSemesterThreeCredits(), semThreeCredits);
	}

	@Test
	public void testGetTotalCredits() {
		assertEquals(module.getTotalCredits(), (semOneCredits + semTwoCredits + semThreeCredits));
	}

	@Test
	public void testGetLevel() {
		assertEquals(module.getLevel(), level);
	}

}
