/***********************************************
 * 	Class that connects with the data base.
 *********************************************/
import java.sql.*;

import javax.swing.*;


public class sqliteConnection
{
	Connection conn =null;
	// method 
	public static Connection dbConnector()
	{
		try
		{
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Cesar\\EclipseWorkspace\\Healthcare\\healthcare_user_info.sqlite");
			
			//-------------------- For testing -------------------------------------
			//JOptionPane.showMessageDialog(null, "Connection to databass was successful");
			return conn;
			
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
			return null;
		}	
	}

}


