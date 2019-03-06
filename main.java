package user;

import java.sql.SQLException;
import java.util.Scanner;

public class main {

	public static void main(String[] args){
		
		

		final String pas = "job";

		Scanner sc = new Scanner(System.in);
	    System.out.println("----------------------------------------------------");
		System.out.println("****************************************************");
		System.out.println("     J O B   M A N A G E M E N T    S Y S T E M     ");
		System.out.println();
		System.out.println("::::::::::::::PLEASE SELECT YOUR CHOICE:::::::::::::");
		System.out.println("press 1 for user");
		System.out.println("press 2 for admin");
		System.out.println("press 3 for company");
		System.out.println("press 4 for fetch");
		
		int d = sc.nextInt();
		if(d==1)
		{
			//user
			System.out.println("Select : ");
			System.out.println( "1. Enter new user \n" + "2. View User Details\n");
		
			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1:
				{
					User u1=new User();
					u1.insertUser();
					break;
				}
				case 2:
				{
					UserDetails u2=new UserDetails();
					u2.readUserInfo();
					break;
				}
			}

		}
		
		else if(d==2)
		{
			System.out.println("Enter password : ");
			String pass =sc.next();
			if(pass.equals(pas))
			{	//admin
				System.out.println("Select : ");
				System.out.println("1. Update User \n" +  "2. Update company \n" + "3. Delete User \n" 
						+ "4. Delete Company \n");
			
				System.out.println("Enter your choice : ");
				int ch = sc.nextInt();
				switch(ch)
				{
					case 1:
					{
						User u1=new User();
						u1.updateUser();
						break;
					}
					case 2 :
					{
						Company c2=new Company();
						c2.updateCompany();
						break;
					}
					case 3: 
					{
						Delete d1=new Delete();
						d1.deleteUser();
						break;			
					}
					case 4: 
					{
						Delete d2=new Delete();
						d2.deleteCompany();
						break;			
					}
				}
			
			}	
			else {
				System.out.println("Invalid password!!");
			}
		}
		else if(d==3)
		{
			//user
			System.out.println("Select : ");
			System.out.println( "1. Enter new company \n" + "2. View company Details\n");
		
			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1:
				{
					Company c1=new Company();
					c1.insertCompany();
					break;
				}
				case 2:
				{
					UserDetails u2=new UserDetails();
					u2.readCompanyInfo();
					break;
				}
			}

		}
		else if(d==4)
		{

			System.out.println("Select : ");
			System.out.println( "1.View Details Of Employee at the time of interview date \n");
		
			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1:
				{
					UserDetails ud1=new UserDetails();
					ud1.readUserDetails();
					break;
				}
			}
			
		}

		else
			System.out.println("You have Enter Invalid Value.");
	}
}
		
