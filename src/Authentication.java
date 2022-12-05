import java.util.ArrayList;
public class Authentication {
	public ArrayList<User> ArrayOfUsers = new ArrayList<User>();
	public boolean SignIn(User U )
	{
		for(int i=0;i<ArrayOfUsers.size();i++)
		{
			if( U.getEmail() == ArrayOfUsers.get(i).getEmail() && 
					U.getPassword() == ArrayOfUsers.get(i).getPassword() )
			{
				return true ;
			}
		}
		return false ;
	}
	public boolean SignUp( User U )
	{
		if( ArrayOfUsers.size() == 0 )
		{
			ArrayOfUsers.add(U) ;
		}
		for(int i=0;i<ArrayOfUsers.size();i++)
		{
			if( U.getEmail() != ArrayOfUsers.get(i).getEmail() && 
				U.getPassword() != ArrayOfUsers.get(i).getPassword() &&
				U.getUserName() != ArrayOfUsers.get(i).getUserName() )
			{
				ArrayOfUsers.add(U) ;
				return  true ;
			}
		}
		return false ;
	}
}
