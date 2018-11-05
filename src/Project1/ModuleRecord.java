package Project1;

public class ModuleRecord {
	 
	private Module m;
	private int mark;
	  
	
	public ModuleRecord(Module m, int mark)
	{      
		this.setM(m);
		this.setMark(mark);
	}
	
	public void setM(Module m) 
	{
		this.m = m;
	}

	public void setMark(int mark) 
	{
		this.mark = mark;
	}

	public ModuleRecord(Module m)
	{      
		this.m = m;  
	}
	    
	public void recordMark(int mark)
	{      
		this.mark = mark;  
	}
	    
	public int getModuleMark()
	{      
		return mark;  
	}
  	  
	public ModuleResult getModuleResult()
	{      
		if ((m.getLevel() == Module.MSC_MODULE_LEVEL && mark >= Module.MSC_MODULE_PASS_MARK) || 
	   		 (m.getLevel() == Module.STAGE_3_MODULE_LEVEL && mark >= Module.UG_MODULE_PASS_MARK)) 
		{
			return ModuleResult.PASS;
		}
		else
		{
			return ModuleResult.FAIL; 
		}
	}
	  
	 
	public Module getModule()
	{
		return m;    
	}

}
