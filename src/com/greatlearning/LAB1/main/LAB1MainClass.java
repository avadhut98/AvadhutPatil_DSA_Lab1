package com.greatlearning.LAB1.main;

import com.greatlearning.LAB1.service.CredentialService;
import java.util.Scanner;
public class LAB1MainClass {
	
	public static void main(String args[]) {
		//Scanner input = new Scanner(System.in);
	  
	CredentialService obj2 = new CredentialService();
	
    	 obj2.generateEmailAddress();
    	 obj2.determineDepartment();
     	 obj2.generatePassword();
 	 obj2.showCredentials();


		
		
    
	
	}

}
