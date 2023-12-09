package com.greatlearning.LAB1.service;

import com.greatlearning.LAB1.interfaces.EmailService;
import com.greatlearning.LAB1.model.Employee;

import java.util.Scanner;

public class CredentialService implements EmailService{
	
	public String EmailSuffix = ".com";
	public String department ="";
	public String emailID = "";
	public  char[] password =new char[8]; 
	public String prefixx = "";
	String firstName="";
	
	String Fname,Lname,Cname="";
	
	Scanner userinput = new Scanner(System.in);
	
	public void generateEmailAddress()
	{
		
		System.out.println("Enter Firstname");   
	    Fname = userinput.nextLine();
		
		System.out.println("Enter Lastname");
	    Lname = userinput.nextLine();
		
		System.out.println("Enter Company Name");
		Cname = userinput.nextLine();
		
		Employee obj1 = new Employee(Fname,Lname);	
		prefixx = obj1.getName();
		firstName = obj1.firstName;
		
		
	}
	
	public void generatePassword()
	{
		String passwordSet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		for(int i=0;i<8;i++) 
		{
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		//System.out.println(password);
	}
	
	public void determineDepartment()
	{
		
		System.out.println("Please Enter Department from the following .........");   
		System.out.println("\n 1. Technical \n 2. Admin \n 3. HumanResource  \n 4. Legal ");
		int input = userinput.nextInt();
	
		if(input==1)
		{
			department = "Technical";
		}
		
		else if(input==2)
		{
			department = "Admin";
	    }
		else if(input==3)
		{
		department = "HumanResource";
	    }
		else if(input==4)
		{
			department = "Legal";
		}
		else 
		{
			System.out.println("Wrong Input");
		}
		
	}
		
	public void showCredentials()
	{
		
		System.out.println("Dear "+firstName+" your generated credentials are as follows ...\n");
		System.out.println("--------------------------------------------");
		emailID = prefixx + "@" + department + "." +Cname +".com";
		System.out.println ("Email ID : "+emailID);
		System.out.print("Password Is : ");
		System.out.println(password);	
		System.out.println("--------------------------------------------");
		
	}
	
	

}
