//-----------------------------------------------------------------------------
// Menu items 
//-----------------------------------------------------------------------------

public class MenuItems
{
	//variables
	private String type, category;
	private int calories; // in grams 

	//constructors ----------------------------------------------
	public MenuItems(String aType, String aCategory, int cal)
	{
		type = aType;
		category = aCategory;
		calories = cal; 
	}

	//accessor methods ------------------------------------------

	public String getMenuType()
	{
		return this.type; 
	}

	public int getCalories()
	{
		return this.calories;
	}

	public String getMenuCategory()
	{
		return this.category;
	}

}