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

	public Resturant lowestCal(String menuType)
	{
		double minCal = 0;
		double minCalRestIndex = 0;
		int i;

		for(i=0; i < database.size(); i++)
		{
			Resturant a = database.get(i);
			if(a.hasMenuType(menuType))
			{
				for(int j = 0; i < a.menu.size(); i++)
				{
					MenuItems b = a.menu.get(i);
					if(b.getMenuType().equals(menuType))
					{
						double menuCals = b.getCalories();
						if(menuCals < minCal)
						{
							minCal = menuCals;
							minCalRestIndex = i;
						}
					}
				}
			}
		}
		return database.get(i);
	}

	public void main(String[] args)
	{

		Resturant mcd = new Resturant("McDonalds");
		database.add(mcd);
		MenuItems burger = new MenuItems("burger",500);
		mcd.menu.add(burger);

	}

}