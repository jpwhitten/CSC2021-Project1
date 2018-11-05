package Project1;
//This class represents a module
public class Module {
		
//	public final static int MSC_MODULE_PASS_MARK = 40;
	public final static int MSC_MODULE_PASS_MARK = 50;
//	public final static double UG_MODULE_PASS_MARK = 40;
	public final static int UG_MODULE_PASS_MARK = 40;
	public final static int MSC_MODULE_LEVEL = 7;
	public final static int STAGE_3_MODULE_LEVEL = 6;
	
	private String moduleCode;
	private String moduleTitle;
	private int sem1Credits;
	private int sem2Credits;
	private int sem3Credits;
	private int moduleLevel;
	  
	 
	public Module(String code, String title, int sem1, int sem2, int sem3, int level)
	{    
//		moduleCode = code;
//	    moduleTitle = title;
//	    sem1Credits = sem1;
//	    sem2Credits = sem2;
//	    sem3Credits = sem3;
//	    moduleLevel = level;    
		this.setModuleCode(code);
		this.setModuleLevel(level);
		this.setModuleTitle(title);
		this.setSem1Credits(sem1);
		this.setSem2Credits(sem2);
		this.setSem3Credits(sem3);
	}

	public void setModuleCode(String moduleCode) 
	{
		this.moduleCode = moduleCode;
	}

	public void setModuleTitle(String moduleTitle)
	{
		this.moduleTitle = moduleTitle;
	}

	public void setSem1Credits(int sem1Credits) 
	{
		this.sem1Credits = sem1Credits;
	}

	public void setSem2Credits(int sem2Credits)
	{
		this.sem2Credits = sem2Credits;
	}

	public void setSem3Credits(int sem3Credits)
	{
		this.sem3Credits = sem3Credits;
	}

	public void setModuleLevel(int moduleLevel) 
	{
		this.moduleLevel = moduleLevel;
	}

	//method to return the module code
	public String getCode()
	{
		return moduleCode;  
	}
	  
	//method to return the module title
	public String getTitle()
	{      
		return moduleTitle;  
	}
	
	//method to return the Semester 1 credits
	public int getSemesterOneCredits()
	{      
		return sem1Credits;  
	}
	
	//method to return the Semester 2 credits
	public int getSemesterTwoCredits()
	{      
		return sem2Credits;  
	}
	
	//method to return the Semester 3 credits
	public int getSemesterThreeCredits()
	{      
		return sem3Credits;
	}
	  
	//method to return the total credits across all the semesters
	public int getTotalCredits()
	{      
		return this.sem1Credits + this.sem2Credits + this.sem3Credits;
	}
	  
	//method to return the module level
	public int getLevel()
	{      
		return this.moduleLevel;  
	}

}
