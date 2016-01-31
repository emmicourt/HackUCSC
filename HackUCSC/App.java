//-----------------------------------------------------------------------------
// main class 
//-----------------------------------------------------------------------------
import java.util.*;
import java.util.Scanner;

public class App
{
	// variables 
	public static ArrayList<Resturant> database = new ArrayList<Resturant>();

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


	public static Resturant lowestCal(String menuType)
	{
		int i;
		int minCalRestIndex = 0;

		for(i=0; i < database.size(); i++)
		{
			Resturant a = database.get(i);
			if(a.hasMenuType(menuType))
			{
				for(int j = 0; j < a.menu.size(); j++)
				{
					MenuItems b = a.menu.get(i);
					double minCal = b.getCalories();
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
		return database.get(minCalRestIndex);
	}

	public static boolean checkPrecence(String type)
	{
		boolean x = false;
		for(int i = 0; i < database.size(); i++)
		{
			if(database.get(i).hasMenuType(type))
			{
				x = true;
			}
		}
		return x;
	}

	public static void main(String[] args)
	{
		String input;
		Resturant healthiest;

		Scanner sc = new Scanner(System.in);


		Resturant mcd = new Resturant("McDonalds");
		database.add(mcd);
		MenuItems mcdburger1 = new MenuItems("Quarter Pounder with Cheese",540);
		mcd.menu.add(mcdburger1);
		MenuItems mcdburger2 = new MenuItems("Double Quarter Pounder with Cheese",780);
		mcd.menu.add(mcdburger2);
		MenuItems mcdburger3 = new MenuItems("Hamburger",250);
		mcd.menu.add(mcdburger3);
		MenuItems mcdburger4 = new MenuItems("Cheeseburger",300);
		mcd.menu.add(mcdburger4);
		MenuItems mcdburger5 = new MenuItems("BBQ Ranch Burger",350);
		mcd.menu.add(mcdburger5);
		MenuItems mcdburger6 = new MenuItems("Grilled Onion Cheddar",310);
		mcd.menu.add(mcdburger6);
		MenuItems mcdburger7 = new MenuItems("Double Cheeseburger",440);
		mcd.menu.add(mcdburger7);
		MenuItems mcdburger8 = new MenuItems("McDouble",390);
		mcd.menu.add(mcdburger8);
		MenuItems mcdburger9 = new MenuItems("Bacon McDouble",460);
		mcd.menu.add(mcdburger9);
		MenuItems mcdburger10 = new MenuItems("Daily Double",440);
		mcd.menu.add(mcdburger10);
		MenuItems mcdburger11 = new MenuItems("Jalapeño Double",440);
		mcd.menu.add(mcdburger11);
		MenuItems mcdburger12 = new MenuItems("Quarter Pounder Deluxe",600);
		mcd.menu.add(mcdburger12);

		while(true)
		{
			System.out.println("Enter what you would like to eat: ");
			input = sc.next();

		
			if(checkPrecence(input))
			{
				healthiest = lowestCal(input);
				break;
			}
			else
			{
				System.out.println("Option not available");
			}
		}

		String output = healthiest.getRestName();
		System.out.println(output);
	
	}

}