package user;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class UserDetails {

	ResultSet rs;
	
	private static final String USER_ID="user_id";
	private static final String USER_NAME="user_name";
	private static final String USER_COMPANY_NAME="company_name";
	private static final String USER_SALARY="salary";
	private static final String USER_CONTACT_NO="contact_no";
	private static final String USER_POST="post";
	private static final String USER_LOCATION="location";
	private static final String COMPANY_ID="company_id";
	private static final String COMPANY_NAME="company_name";
	private static final String COMPANY_DATE="date";
	private static final String COMPANY_TIME="time";
	private static final String COMPANY_LOCATION="location";
	
	 UserDetails()
	{
		
	}

	
	 
	public void readUserDetails()
	{
		try
		{
			String user_name;
			System.out.println("Enter User Name :");
			Scanner s1= new Scanner(System.in);
			user_name = s1.next();
			String q="Select * from user e inner join company d on e.company_name=d.company_name where user_name=?";
			GetConnection getConnection=new GetConnection(); 
			Connection con= getConnection.createConnection();
		    PreparedStatement pstm = con.prepareStatement(q);
			//Statement stmt=con.createStatement(q);  
			/*ResultSet rs=stmt.executeQuery("Select d.*, e.* from user e , company d where e.company_name=d.company_name");
			*/
			pstm.setString(1,user_name);
			ResultSet rs=pstm.executeQuery();
			/*ResultSet rs=stmt.executeQuery("Select * from user e inner join company d where e.company_name=d.company_name where user_name=?");
			*/
  
			while(rs.next())
			{
				System.out.println("USER_ID BE :"+ "\t" + rs.getInt(USER_ID) +
						"\n" + "USER_NAME BE :" + " \t" + rs.getString(USER_NAME) + 
						"\n" + "USER_COMPANY_NAME GOING FOR INTERVIEW :" + "\t " + rs.getString(USER_COMPANY_NAME)+ 
						"\n" + "USER_SALARY BE :" + " \t" + rs.getString(USER_SALARY)+ 
						"\n" + "USER_CONTACT_NO BE :" + " \t" + rs.getString(USER_CONTACT_NO)+
						"\n" + "USER_POST HE APPLIED FOR :" + "\t " + rs.getString(USER_POST)+
						"\n" + "USER_LOCATION BE :" + " \t" + rs.getString(USER_LOCATION)+ 
						"\n" + "COMPANY_DATE FOR INTERVIEW :" + " \t" + rs.getString(COMPANY_DATE)+ 
						"\n" + "COMPANY_TIME FOR INTERVIEW :" + "\t " + rs.getString(COMPANY_TIME)+
						"\n" + "COMPANY_LOCATION FOR INTERVIEW :" + "\t " + rs.getString(COMPANY_LOCATION));   
				
			}
			con.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	public void readUserInfo()
	{
		try
		{
			String user_name;
			System.out.println("Enter User Name :");
			Scanner s1= new Scanner(System.in);
			user_name = s1.next();
			String q="Select * from user where user_name=?";
			GetConnection getConnection=new GetConnection(); 
			Connection con= getConnection.createConnection();
		    PreparedStatement pstm = con.prepareStatement(q);
			pstm.setString(1,user_name);
			ResultSet rs=pstm.executeQuery();

			System.out.println("**********************************************************************************************");
			   
			while(rs.next())
			{
				System.out.println("USER_ID BE :"+ "\t" + rs.getInt(USER_ID) +
						"\n" + "USER_NAME BE :" + " \t" + rs.getString(USER_NAME) + 
						"\n" + "USER_COMPANY_NAME GOING FOR INTERVIEW :" + "\t " + rs.getString(USER_COMPANY_NAME)+ 
						"\n" + "USER_SALARY BE :" + " \t" + rs.getString(USER_SALARY)+ 
						"\n" + "USER_CONTACT_NO BE :" + " \t" + rs.getString(USER_CONTACT_NO)+
						"\n" + "USER_POST HE APPLIED FOR :" + "\t " + rs.getString(USER_POST)+
						"\n" + "USER_LOCATION BE :" + " \t" + rs.getString(USER_LOCATION));   
				
			}
			con.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	

	public void readCompanyInfo()
	{
		try
		{
			String company_name;
			System.out.println("Enter Company Name :");
			Scanner s1= new Scanner(System.in);
			company_name = s1.next();
			String q="Select * from company where company_name=?";
			GetConnection getConnection=new GetConnection(); 
			Connection con= getConnection.createConnection();
		    PreparedStatement pstm = con.prepareStatement(q);
			pstm.setString(1,company_name);
			ResultSet rs=pstm.executeQuery();

			System.out.println("**********************************************************************************************");
			
			while(rs.next())
			{
				System.out.println("COMPANY_ID BE :" + " \t\t\t" + rs.getInt(COMPANY_ID)+
						"\n" + "COMPANY_NAME BE :" + " \t\t\t"  + rs.getString(COMPANY_NAME)+
						"\n" + "COMPANY_DATE FOR INTERVIEW BE :" + " \t" + rs.getString(COMPANY_DATE)+ 
						"\n" + "COMPANY_TIME FOR INTERVIEW BE :" + "\t\t " + rs.getString(COMPANY_TIME)+
						"\n" + "COMPANY_LOCATION FOR INTERVIEW BE :" + "\t " + rs.getString(COMPANY_LOCATION));   
				
			}
			con.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
	
