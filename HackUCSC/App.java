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
	{ database.add(a); }

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


	public static int[] lowestCal(String menuCat)
	{
		int lowestCoordinates[] = new int[2]; //
		int i;
		int minCalRestIndex = 0;
		int minCalMenuIndex = 0;
		int minCal = 5000; 

		for(i = 0; i < database.size(); i++)
		{
			Resturant a = database.get(i);
			if(a.hasMenuCat(menuCat))
			{
				for(int j = 0; j < a.menu.size(); j++)
				{
					MenuItems b = a.menu.get(j);
					if(b.getMenuCategory().equals(menuCat))
					{
						int menuCals = b.getCalories();
						if(menuCals < minCal)
						{
							minCal = menuCals;
							minCalRestIndex = i;
							minCalMenuIndex = j;
						}
					}
				}
			}
		}
		lowestCoordinates[0] = minCalMenuIndex;
		lowestCoordinates[1] = minCalRestIndex;
		return lowestCoordinates;
	}


	public static int[] lowestSod(String menuCat)
	{
		int lowestCoordinates[] = new int[2]; //
		int i;
		int minSodRestIndex = 0;
		int minSodMenuIndex = 0;
		int minSod = 5000; 

		for(i = 0; i < database.size(); i++)
		{
			Resturant a = database.get(i);
			if(a.hasMenuCat(menuCat))
			{
				for(int j = 0; j < a.menu.size(); j++)
				{
					MenuItems b = a.menu.get(j);
					if(b.getMenuCategory().equals(menuCat))
					{
						int menuSod = b.getSodium();
						if(menuSod < minSod)
						{
							minSod = menuSod;
							minSodRestIndex = i;
							minSodMenuIndex = j;
						}
					}
				}
			}
		}
		lowestCoordinates[0] = minSodMenuIndex;
		lowestCoordinates[1] = minSodRestIndex;
		return lowestCoordinates;
	}

	public static int[] lowestFat(String menuCat)
	{
		int lowestCoordinates[] = new int[2]; //
		int i;
		int minFatRestIndex = 0;
		int minFatMenuIndex = 0;
		int minFat = 5000; 

		for(i = 0; i < database.size(); i++)
		{
			Resturant a = database.get(i);
			if(a.hasMenuCat(menuCat))
			{
				for(int j = 0; j < a.menu.size(); j++)
				{
					MenuItems b = a.menu.get(j);
					if(b.getMenuCategory().equals(menuCat))
					{
						int menuFat = b.getFat();
						if(menuFat < minFat)
						{
							minFat = menuFat;
							minFatRestIndex = i;
							minFatMenuIndex = j;
						}
					}
				}
			}
		}
		lowestCoordinates[0] = minFatMenuIndex;
		lowestCoordinates[1] = minFatRestIndex;
		return lowestCoordinates;
	}

	public static boolean checkPrecence(String type)
	{
		boolean x = false;
		for(int i = 0; i < database.size(); i++)
		{
			if(database.get(i).hasMenuCat(type))
			{
				x = true;
			}
		}
		return x;
	}

	public static void main(String[] args)
	{
		String input;
		Resturant lowestCalRest,lowestFatRest, lowestSodRest; 
		MenuItems lowestCalBurger,lowestSodBurger, lowestFatburger;
		int calorieCount, sodiumCount, fatCount; 


		Scanner sc = new Scanner(System.in);

//=============================================================================
		// McDonalds Data =====================================================
		Resturant mcd = new Resturant("McDonalds");
		database.add(mcd);
		MenuItems mcdburger1 = new MenuItems("Quarter Pounder with Cheese", 
											"Cheeseburger", 540, 1110, 28);
		mcd.menu.add(mcdburger1);
		MenuItems mcdburger2 = new MenuItems("Double Quarter Pounder with Cheese", 
											"Double Cheeseburger", 780, 1310, 45);
		mcd.menu.add(mcdburger2);
		MenuItems mcdburger3 = new MenuItems("Hamburger", "Hamburger", 250, 490, 8);
		mcd.menu.add(mcdburger3);
		MenuItems mcdburger4 = new MenuItems("Cheeseburger", "Cheeseburger", 300, 680, 12);
		mcd.menu.add(mcdburger4);
		MenuItems mcdburger5 = new MenuItems("BBQ Ranch Burger","Hamburger", 350, 670, 15);
		mcd.menu.add(mcdburger5);
		MenuItems mcdburger6 = new MenuItems("Grilled Onion Cheddar",
											"Cheeseburger", 310, 640, 13);
		mcd.menu.add(mcdburger6);
		MenuItems mcdburger7 = new MenuItems("Double Cheeseburger", 
											"Double Cheeseburger", 440, 1050, 22);
		mcd.menu.add(mcdburger7);
		MenuItems mcdburger8 = new MenuItems("McDouble", "Double Hamburger", 390, 850, 18);
		mcd.menu.add(mcdburger8);
		MenuItems mcdburger9 = new MenuItems("Bacon McDouble",
											"Double Hamburger", 460, 1120, 23);
		mcd.menu.add(mcdburger9);
		MenuItems mcdburger10 = new MenuItems("Daily Double",
											"Double Hamburger", 440, 770, 24);
		mcd.menu.add(mcdburger10);
		MenuItems mcdburger11 = new MenuItems("Jalapeño Double",
											"Double Hamburger", 440, 990, 24);
		mcd.menu.add(mcdburger11);
		MenuItems mcdburger12 = new MenuItems("Quarter Pounder Deluxe",
											"Double Cheeseburger", 600, 1200, 33);
		mcd.menu.add(mcdburger12);

		//In-n-Out ============================================================
		Resturant inOut = new Resturant("In-n-Out");
		database.add(inOut);

		MenuItems inburger1 = new MenuItems("Hamburger", "Hamburger", 390, 650, 19);
		inOut.menu.add(inburger1);
		MenuItems inburger2 = new MenuItems("Cheeseburger", "Cheeseburger", 480, 1000, 27);
		inOut.menu.add(inburger2);
		MenuItems inburger3 = new MenuItems("Double-Double", "Double Cheeseburger", 670, 1440, 41);
		inOut.menu.add(inburger3);

		//Burger King =========================================================
		Resturant BK = new Resturant("Burger King");
		database.add(BK);
		MenuItems BKburger1 = new MenuItems("Whopper", "Hamburger", 650, 910, 37);
		BK.menu.add(BKburger1);
		MenuItems BKburger2 = new MenuItems("Whopper with Cheese", "Cheeseburger",730, 790, 22);
		BK.menu.add(BKburger2);
		MenuItems BKburger3 = new MenuItems("Whopper with Bacon and Cheese","Cheeseburger",770, 1260,48);
		BK.menu.add(BKburger3);
		MenuItems BKburger4 = new MenuItems("Big King","Hamburger",530, 790, 31);
		BK.menu.add(BKburger4);
		MenuItems BKburger5 = new MenuItems("A.1. Ultimate Bacon Cheeseburger","Cheeseburger",810, 1400, 16);
		BK.menu.add(BKburger5);
		MenuItems BKburger6 = new MenuItems("Hamburger","Hamburger", 230, 460, 9);
		BK.menu.add(BKburger6);
		MenuItems BKburger7 = new MenuItems ("Cheeseburger","Cheeseburger",270, 540, 12);
		BK.menu.add(BKburger7);
		MenuItems BKburger8 = new MenuItems("Double Hamburger","Double Hamburger",320, 450, 15);
		BK.menu.add(BKburger8);
		MenuItems BKburger9 = new MenuItems("Double Cheeseburger","Double Cheeseburger",360, 490, 19);
		BK.menu.add(BKburger9);
		MenuItems BKburger10 = new MenuItems("Bacon Cheeseburger","Cheeseburger",290, 680, 13);
		BK.menu.add(BKburger10);
		MenuItems BKburger11 = new MenuItems("Bacon Double Cheeseburger","Double Cheeseburger", 390, 800, 21);
		BK.menu.add(BKburger11);
		MenuItems BKburger12 = new MenuItems("Double Cheeseburger","Double Cheeseburger",360, 670, 19);
		BK.menu.add(BKburger12);
		MenuItems BKburger13 = new MenuItems("Bacon Cheeseburger Deluxe","Cheeseburger",650, 720, 14);
		BK.menu.add(BKburger13);
//=============================================================================

		int[] calCoor;
		int[] sodCoor;
		int[] fatCoor;

		while(true)
		{
			input = sc.nextLine();

		
			if(checkPrecence(input))
			{
				calCoor = lowestCal(input);
				sodCoor = lowestSod(input);
				fatCoor = lowestFat(input);
				break;
			}
			else
			{
				System.out.println("Option not available");
			}
		}

		
		lowestCalRest = database.get(calCoor[1]);
		lowestCalBurger = lowestCalRest.menu.get(calCoor[0]);

		lowestSodRest = database.get(sodCoor[1]);
		lowestSodBurger = lowestSodRest.menu.get(sodCoor[0]);

		lowestFatRest = database.get(fatCoor[1]);
		lowestFatburger = lowestFatRest.menu.get(fatCoor[0]);

		calorieCount = lowestCalBurger.getCalories();
		sodiumCount = lowestSodBurger.getSodium();
		fatCount = lowestFatburger.getFat();


		String a = lowestCalRest.getRestName();
		String b = lowestCalBurger.getMenuType();
		String c = lowestSodRest.getRestName();
		String d = lowestSodBurger.getMenuType();
		String e = lowestFatRest.getRestName();
		String f = lowestFatburger.getMenuType();

		System.out.println("The lowest: 		resturants    Burger     Calories");
		System.out.println("	calories:	" +a+ "           " +b+ "    " + calorieCount);
		System.out.println("	fat:        "+e+"             "+f+"      "+ fatCount);
		System.out.println("	sodium:     "+c+"             "+d+"      "+sodiumCount);
	
	}

}