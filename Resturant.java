//-----------------------------------------------------------------------------
// Resturant class 
//-----------------------------------------------------------------------------


public class Resturant
{
    // variables 
	private String name;
	private String type; 

	// Constructor 
	Resturant(String aName, String aType)
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
}