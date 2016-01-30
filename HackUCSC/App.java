//-----------------------------------------------------------------------------
// main class 
//-----------------------------------------------------------------------------
import java.util.*;


public class App
{
	// variables 
	public ArrayList<Resturant> database = new ArrayList<Resturant>();

	//Methods-------------------------------------------------------------
	public void addResturant(Resturant a)
	{
		database.add(a);
	}

	// to make inputing resturants faster 
	public void inputResturant(String aName, String aType)
	{
		addResturant(new Resturant(aName, aType));
	}

	//Comparing resturants 
	public boolean hasRestType(String aType)
	{
		boolean contains = false;
		for(int i = 0; i < database.size(); i++)
		{
			Resturant a = database.get(i);
			for(int j = 0; i < a.menu.size(); i++)
			{
				MenuItems b = (a.menu).get(j);
				if(b.getMenuType().equals(aType))
				{
					contains = true;
				} 
			}
		}
		return contains; 
	}


}