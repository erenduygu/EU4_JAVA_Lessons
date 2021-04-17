package day40_accessModifiers_final_Hiding;

public class EducationalInstitution{
	  private int years;
	  
	  EducationalInstitution(int years){
	    this.years=years;
	  }
	  
	  String graduationRequirements(){
		String newst=years+" years of study";
		  return newst;
	    
	  }

	
	}