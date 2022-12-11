package pkg1;

public class student
{ // boundary of a class
	int number; // integer variable
	public void  abc() // ()indicates the method ,
	// abc is a method here , number is a variable
	{ // boundary of method 
     System.out.println("Learning is Fun & keep learning !!!");
	}
	
	public static void main(String[] args) 
	{ student megha = new student(); 
	// abc here it is a object of A class hence we use with 
	//class name + Object name = new + class name ()
	
	  megha.abc(); 
	  // for executing of method / to call method  , 
	  //no need to give syso command 
	  // but for variable / integer , have to assign a value & give syso command to print
	  
	 // abc.number = 123 ;
	 // System.out.println(abc.number);
	 // abc.number = 500 ;
	  //System.out.println(abc.number);
	}
		
	}

