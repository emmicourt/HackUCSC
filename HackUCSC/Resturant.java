//-----------------------------------------------------------------------------
// Resturant class 
//-----------------------------------------------------------------------------
import java.util.*;

public class Resturant
{
    // variables 
	private String name;
	private String type;
	public ArrayList<MenuItems> menu = new ArrayList<MenuItems>();

	// Constructor -------------------------------------------------
	public Resturant(String aName)
	{
		name = aName;
	}

	// Accessor Methods --------------------------------------------
	public String getRestName()
	{
		return this.name;
	}

	//other methods ------------------------------------------------
	public void addMenuItem(MenuItems a)
	{
		menu.add(a);
	}


	// checks menu for menu type
	public boolean hasMenuType(String type)
	{
		boolean contains = false;
		for(int i = 0; i < menu.size(); i++)
		{
			String indexType = (this.menu.get(i)).getMenuType();
			
			if(indexType.equals(type))
				contains = true;
		}
		return contains;
	}
}








