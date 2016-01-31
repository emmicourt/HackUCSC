//-----------------------------------------------------------------------------
// Menu items 
//-----------------------------------------------------------------------------

public class MenuItems
{
	//variables
	private String type, category;
	private int calories, sodium, fat;

	//constructors ----------------------------------------------
	public MenuItems(String aType, String aCategory, int cal, int aSodium, int aFat)
	{
		type = aType;
		category = aCategory;
		calories = cal; 
		sodium = aSodium;
		fat = aFat;
	}

	//accessor methods ------------------------------------------

	public String getMenuType()
		{ return this.type; }

	public int getCalories()
		{ return this.calories; }

	public String getMenuCategory()
		{ return this.category; }

	public int getFat()
		{ return this.fat; }

	public int getSodium()
		{ return this.sodium; }

}