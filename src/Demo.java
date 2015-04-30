import java.util.Scanner;


public class Demo {
	
	public static void main(String[] args)
	{
		
		String un;
		String password;		
		
		
		Scanner user_input = new Scanner( System.in );
        
		
        int count = 0;
         Login Lin = new Login();
       do
        {
	        System.out.println("Enter User Name : ");
	        un =  user_input.next( );
	        System.out.println("Enter password: ");
	        password =  user_input.next( );
	        
	        //------- Creating an instance of he log in call ---------------
	       
	       // Lin.Print();
	        Lin.CheckLogin(un, password);
	        System.out.println("Valid password: " + Lin.getValidPassword());
	        System.out.println("Valid userName: " + Lin.getValidUserName());
	        
	        
	        System.out.println("************************");
        	
        	
        }while(count < 4 && !Lin.ValidLogIn());
		
		
        
	}

}
