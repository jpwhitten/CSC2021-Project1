package Project1;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitStudentTest {

	String name = "name";
	String number = "1";
	Student student = new Student(name, number);
	
	Module module = new Module("code", "Name", 1, 2, 3, 7);
	Module module2 = new Module("code", "Name", 1, 2, 3, 7);
	Module module3 = new Module("code", "Name", 1, 2, 3, 7);
	Module module4 = new Module("code", "Name", 1, 2, 3, 7);
	Module module5 = new Module("code", "Name", 1, 2, 3, 7);
	Module module6 = new Module("code", "Name", 1, 2, 3, 7);
	Module module7 = new Module("code", "Name", 1, 2, 3, 7);
	Module module8 = new Module("code", "Name", 1, 2, 3, 7);
	Module module9 = new Module("code", "Name", 1, 2, 3, 7);
	Module module10 = new Module("code", "Name", 1, 2, 3, 7);
	Module module11 = new Module("code", "Name", 1, 2, 3, 7);
	Module UGModule = new Module("code", "Name", 1, 2, 3, 6);
	int mark = 10;
	int mark2 = 39;
	int mark3 = 40;
	int mark4 = 41;
	int mark5 = 49;
	int mark6 = 50;
	int mark7 = 51;
	int mark8 = 1000;
	
	@Test
	public void testAddModule() {
		student.addModule(UGModule);
		student.addModule(module);
		student.addModule(module2);
		student.addModule(module3);
		student.addModule(module4);
		student.addModule(module5);
		student.addModule(module6);
		student.addModule(module7);
		student.addModule(module8);
		student.addModule(module9);
		student.addModule(module10);
		student.addModule(module11);
		assertEquals(student.moduleRecords[0].getModule(), UGModule);
		assertEquals(student.moduleRecords[1].getModule(), module);
	}

	@Test
	public void testRemoveModule() {
		student.addModule(UGModule);
		student.addModule(module);
		student.addModule(module2);
		student.addModule(module3);
		student.addModule(module4);
		student.addModule(module5);
		student.addModule(module6);
		student.addModule(module7);
		student.addModule(module8);
		student.addModule(module9);
		student.addModule(module10);
		student.addModule(module11);
		student.removeModule(module);
		assertEquals(student.moduleRecords[1].getModule(), null);
	}
	@Test
	public void testCheckModuleSelection() {
		student.addModule(UGModule);
		student.addModule(module);
		student.addModule(module2);
		student.addModule(module3);
		student.addModule(module4);
		student.addModule(module5);
		student.addModule(module6);
		student.addModule(module7);
		student.addModule(module8);
		student.addModule(module9);
		student.addModule(module10);
		student.addModule(module11);
		assertEquals(student.checkModuleSelection(), false);
	}

	@Test
	public void testGetName() {
		assertEquals(student.getName(), name);
	}

	@Test
	public void testRecordMark() {
		student.addModule(UGModule);
		student.addModule(module);
		student.addModule(module2);
		student.addModule(module3);
		student.addModule(module4);
		student.addModule(module5);
		student.addModule(module6);
		student.addModule(module7);
		student.addModule(module8);
		student.addModule(module9);
		student.addModule(module10);
		student.addModule(module11);
		student.recordMark(UGModule, 50);
		assertEquals(student.moduleRecords[0].getModuleMark(), 50);
	}

	@Test
	public void testGetQualification() {
		student.addModule(UGModule);
		student.addModule(module);
		student.addModule(module2);
		student.addModule(module3);
		student.addModule(module4);
		student.addModule(module5);
		student.addModule(module6);
		student.addModule(module7);
		student.addModule(module8);
		student.addModule(module9);
		student.addModule(module10);
		student.addModule(module11);
		student.recordMark(UGModule, 50);
	}

	@Test
	public void testCheckAllModulesPassed() {
		student.addModule(UGModule);
		student.addModule(module);
		student.addModule(module2);
		student.addModule(module3);
		student.addModule(module4);
		student.addModule(module5);
		student.addModule(module6);
		student.addModule(module7);
		student.addModule(module8);
		student.addModule(module9);
		student.addModule(module10);
		student.addModule(module11);
		student.recordMark(UGModule, 50);
		student.recordMark(module, 50);
		student.recordMark(module2, 50);
		student.recordMark(module3, 50);
		student.recordMark(module4, 50);
		student.recordMark(module5, 50);
		student.recordMark(module6, 50);
		student.recordMark(module7, 50);
		student.recordMark(module8, 50);
		student.recordMark(module9, 50);
		student.recordMark(module10, 50);
		student.recordMark(module11, 50);
		assertEquals(student.checkAllModulesPassed(), true);
	}

}
