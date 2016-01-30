//-----------------------------------------------------------------------------
// Menu items 
//-----------------------------------------------------------------------------

public class MenuItems
{
	//variables
	private String name, type;  
	private double calories; // in grams 

	//constructors ----------------------------------------------
	public MenuItems(String aName, String aType, double cal)
	{
		name = aName;
		type = aType;
		calories = cal; 
	}

	//accessor methods ------------------------------------------
	public String getMenuName()
	{
		return this.name;
	}

	public String getMenuType()
	{
		return this.type; 
	}

	public double getCalories()
	{
		return this.calories;
	}

}