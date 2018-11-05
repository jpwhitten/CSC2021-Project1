package Project1;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitModuleRecordTest {

	Module module = new Module("code", "Name", 1, 2, 3, 7);
	Module UGModule = new Module("code", "Name", 1, 2, 3, 6);
	int mark = 10;
	int mark2 = 39;
	int mark3 = 40;
	int mark4 = 41;
	int mark5 = 49;
	int mark6 = 50;
	int mark7 = 51;
	int mark8 = 1000;
	ModuleRecord moduleRecord = new ModuleRecord(module, mark);
	ModuleRecord moduleRecord2 = new ModuleRecord(UGModule, mark2);
	ModuleRecord moduleRecord3 = new ModuleRecord(UGModule, mark3);
	ModuleRecord moduleRecord4 = new ModuleRecord(UGModule, mark4);
	ModuleRecord moduleRecord5 = new ModuleRecord(module, mark5);
	ModuleRecord moduleRecord6 = new ModuleRecord(module, mark6);
	ModuleRecord moduleRecord7 = new ModuleRecord(module, mark7);
	ModuleRecord moduleRecord8 = new ModuleRecord(module, mark8);
	
	ModuleResult fail = ModuleResult.FAIL;
	ModuleResult pass = ModuleResult.PASS;
	
	@Test
	public void testGetModuleMark() {
		assertEquals(moduleRecord.getModuleMark(), mark);
	}

	@Test
	public void testGetModuleResult() {
		assertEquals(moduleRecord.getModuleResult() ,fail);
		assertEquals(moduleRecord2.getModuleResult() , fail);
		assertEquals(moduleRecord3.getModuleResult() , pass);
		assertEquals(moduleRecord4.getModuleResult() , pass);
		assertEquals(moduleRecord5.getModuleResult() , fail);
		assertEquals(moduleRecord6.getModuleResult() , pass);
		assertEquals(moduleRecord7.getModuleResult() , pass);
		assertEquals(moduleRecord8.getModuleResult() , pass);
	}

	@Test
	public void testGetModule() {
		assertEquals(moduleRecord.getModule(), module);
	}

}
