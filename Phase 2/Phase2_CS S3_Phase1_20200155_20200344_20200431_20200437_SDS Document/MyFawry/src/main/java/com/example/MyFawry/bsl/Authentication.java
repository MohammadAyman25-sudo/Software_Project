package com.example.MyFawry.bsl;
import com.example.MyFawry.models.Usermodel;
import java.util.ArrayList;

public class Authentication {
	private ArrayList<Usermodel> ArrayOfUsers = new ArrayList<>();
	public boolean SignIn(Usermodel U )
	{
		for(Usermodel u:ArrayOfUsers)
		{
			if( U.getEmail().equals(u.getEmail())  &&
					U.getPassword().equals(u.getPassword()))
			{
				return true ;
			}
		}
		return false ;
	}
	public boolean SignUp( Usermodel U )
	{
		if( ArrayOfUsers.size() == 0 )
		{
			ArrayOfUsers.add(U) ;
		}
		for(Usermodel u : ArrayOfUsers)
		{
			if( !U.getEmail().equals(u.getEmail()) &&
				!U.getPassword().equals(u.getPassword()) &&
				!U.getUserName().equals(u.getUserName()))
			{
				ArrayOfUsers.add(U) ;
				return  true ;
			}
		}
		return false ;
	}
}
