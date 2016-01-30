//-----------------------------------------------------------------------------
// Menu items 
//-----------------------------------------------------------------------------

public class MenuItems
{
	//variables
	private String type;  
	private double calories; // in grams 

	//constructors ----------------------------------------------
	public MenuItems(String aType, double cal)
	{
		type = aType;
		calories = cal; 
	}

	//accessor methods ------------------------------------------

	public String getMenuType()
	{
		return this.type; 
	}

	public double getCalories()
	{
		return this.calories;
	}

}