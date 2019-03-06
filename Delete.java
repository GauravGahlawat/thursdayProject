package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {
	

		public void deleteUser()
		 {

			try
			{
			String q="delete from user where user_id=?";
			System.out.println("Enter User Id :");
			Scanner s1= new Scanner(System.in);
			int user_id = s1.nextInt();
			  GetConnection getConnection=new GetConnection();
			  Connection con= getConnection.createConnection();
		      PreparedStatement pstmt = con.prepareStatement(q);
				pstmt.setInt(1,user_id);
			
				int rowcount = pstmt.executeUpdate();
				if (rowcount > 0) 
				{
		
					System.out.println("RECORD DELETED SUCESSFULLY FROM USER");
				}
				con.close();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		 }
		
		public void deleteCompany()
		 {

			try
			{
			String q="delete from company where user_id=? and company_name=?";
			Scanner s1= new Scanner(System.in);
			System.out.println("Enter User Id :");
			int user_id = s1.nextInt();
			System.out.println("Enter Company Name :");
			String company_name = s1.next();
			  GetConnection getConnection=new GetConnection();
			  Connection con= getConnection.createConnection();
		      PreparedStatement pstmt = con.prepareStatement(q);
				pstmt.setInt(1,user_id);
				pstmt.setString(2,company_name);
			
				int rowcount = pstmt.executeUpdate();
				if (rowcount > 0) 
				{
		
					System.out.println("RECORD DELETED SUCESSFULLY FROM COMPANY");
				}
				con.close();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		 }

}
