//-----------------------------------------------------------------------------
// Resturant class 
//-----------------------------------------------------------------------------
import java.util.*;

public class Resturant
{
    // variables 
	private String name;
	private String type;
	private int menuLength;
	private List<MenuItems> menu = new ArrayList<MenuItems>();

	// Constructor 
	public Resturant(String aName, String aType)
	{
		name = aName;
		type = aType;
	}

	// Accessor Methods 
	public String getName()
	{
		return this.name;
	}

	public String getType()
	{
		return this.type;
	}

	//other methods 
	public void addItem(MenuItems a)
	{
		this.menu.add(a);
	}
}








