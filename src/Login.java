/******************************************************************
 * 	Helper class to Log in GUI
 *  connects the the GUI with the data base.
 *  
 *   Need: to able to connect will the doctor table 
 *     and the patient table of the data base. 
 ********************************************************************/
import java.sql.*;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Login{
	protected boolean validUsername; 
	protected boolean validPassword;
	protected String name;
	protected String UserType; 
	
	Connection connection  = null; // <== global connection
	Statement stmt = null;
	
	
	public Login()
	{
		validUsername = false;
		validPassword = false;
		name = "";
		UserType = "";
		
		connection= sqliteConnection.dbConnector(); // <== connection to the database
	}
	
//===============================================================	
	public void setValidUserName(int x)
	{
		if(x == 1)
			validUsername = true;
		else if(x == 0) 
			validUsername = false;
	}
	
	public void setValidPassword( int x )
	{
		if( x == 1)
			validPassword = true;
		else if ( x == 0)
			validPassword = false;
	}
	
	public boolean ValidLogIn()
	{
		if(getValidUserName() && getValidPassword() )
			return true;
		else
			return false;
	}
//=========================================================================	
	public boolean getValidUserName()
	{
		return validUsername;
	}
	
	public boolean getValidPassword()
	{
		return validPassword;
	}
	
//=======================================================================	
	public void setName(String x)
	{
		name = x;
	}
	
	public void setUserType(String x)
	{
		UserType = x;
	}
	
	public String getName()
	{
		return name;
	}
	public String getUserType()
	{
		return UserType;
	}
	
	public void Print()
	{
		System.out.println("select * from "+ getUserType() + ";"); 
	}
	
	public String getTable()
	{
		String Table = "select * from "+ getUserType() + ";";
		return Table;
	}
	
	

	public  void CheckLogin(String Uname, String password)
	{
		
		System.out.println("select * from "+ getUserType() + ";");
		
		try
		{
			System.out.println("Print from the CheckLogin method");
			System.out.println("Login class uset the tabble "+getTable() );
			
			
			
			
			
			stmt = connection.createStatement();
			//ResultSet rs = stmt.executeQuery(Table);//"select * from User_Info;");
			
			//================ working on it right now ===============
			ResultSet rs = stmt.executeQuery(getTable());
			//=========================================================
			String dbuserN = "";
			String dbpassword = ""; 
			String dbName = "";
			
			//String dbUsertyep = ""; 
			
			// =====  For testing ========= delete later  
			System.out.println("The user name is " + Uname+ " and the password is "+ password);
			
			
			while(rs.next())
			{
				dbuserN = rs.getString("UserName");
				dbpassword = rs.getString("Password");				
				//------------- updated database ---------------- 
				//dbName =  rs.getString("Name");
				dbName =  rs.getString("FirstName");
				 
				if(Uname.equals(dbuserN))
					validUsername = true;					
				else 
					validUsername = false;					
								
				if(password.equals(dbpassword))
					validPassword = true;
				else 
					validPassword = false;
			}
			
			
					
			
			if(validUsername && validPassword )
			{
			//	setName(dbName);
			//	setUserType(dbUsertyep);
			//	setValidUserName(1);
			//	System.out.println("The the name is "+ getName());
			//	System.out.println("The user Type is " +getUserType());
			//	System.out.println("correct password");	
				
				 rs.close();
				 stmt.close();
				 connection.close();
			
			
			}
			
			/*
			else if (validUsername && !validPassword )
			{
				System.out.println("wrong password");
			}*/
					
			
		}
									 
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
		
	}
}
			

