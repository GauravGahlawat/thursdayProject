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

			System.out.println("USER_ID"+ " \t" + "USER_NAME" +
					"\t " + "USER_COMPANY_NAME"+ " \t" + "USER_SALARY"+ " \t" +
					"USER_CONTACT_NO" + "\t " + "USER_POST" + " \t" + "USER_LOCATION" + " \t" +
					/*rs.getString(COMPANY_ID)+ " \t" +*/ "COMPANY_DATE" + "\t " + "COMPANY_TIME" + "\t " +
					"COMPANY_LOCATION" );   
			while(rs.next())
			{
				System.out.println(
						rs.getInt(USER_ID) + " \t" + rs.getString(USER_NAME) +
						"\t " + rs.getString(USER_COMPANY_NAME)+ " \t" + rs.getString(USER_SALARY)+ " \t" +
						rs.getString(USER_CONTACT_NO)+ "\t " + rs.getString(USER_POST)+ " \t" + rs.getString(USER_LOCATION)+ " \t" +
						/*rs.getString(COMPANY_ID)+ " \t" +*/ rs.getString(COMPANY_DATE)+ "\t " +rs.getString(COMPANY_TIME)+ "\t " +
						rs.getString(COMPANY_LOCATION));   
				
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
			System.out.println("USER_ID"+ " \t" + "USER_NAME" +
					"\t " + "USER_COMPANY_NAME"+ " \t" + "USER_SALARY"+ " \t" +
					"USER_CONTACT_NO" + "\t " + "USER_POST" + " \t" + "USER_LOCATION");   
			while(rs.next())
			{
				System.out.println(
						rs.getInt(USER_ID) + " \t" + rs.getString(USER_NAME) +
						"\t " + rs.getString(USER_COMPANY_NAME)+ " \t" + rs.getString(USER_SALARY)+ " \t" +
						rs.getString(USER_CONTACT_NO)+ "\t " + rs.getString(USER_POST)+ " \t" + rs.getString(USER_LOCATION));   
				
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

			/*System.out.println("**********************************************************************************************");
			System.out.println("USER_ID"+ " \t" + "USER_NAME" +
					"\t " + "USER_COMPANY_NAME"+ " \t" + "USER_SALARY"+ " \t" +
					"USER_CONTACT_NO" + "\t " + "USER_POST" + " \t" + "USER_LOCATION");   */
			while(rs.next())
			{
				System.out.println(
						rs.getString(COMPANY_ID)+ " \t" + rs.getString(COMPANY_DATE)+ "\t " +rs.getString(COMPANY_TIME)+ "\t " +
								rs.getString(COMPANY_LOCATION));   
				
			}
			con.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
	
