package Project1;

public class Test {
	public static void main (String [] args)
    {
       //this is a driver class if you wish to use one. It contains a sample student and a sample module
	   //You do NOT need to review the code in this class and you CAN modify it to add your own test data if you wish.
		
		Module csc8001 = new Module("CSC8001", "Programming and data structures", 20, 0, 0, 7);
		Module csc8002 = new Module("CSC8002", "Some Other Module", 20, 0, 0, 7);
        
        Student chris = new Student("Chris", "1"); 
       
        chris.addModule(csc8001);
        chris.addModule(csc8002);


    }
}
