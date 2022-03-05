// -----------------------------------------------------
// Part: I
// Written by: Christopher Lopez, 40199547
// -----------------------------------------------------

package Airplane;

/**
 * This is the blueprint for the Airplane objects
 * @author Christopher Lopez
 *
 */
public class Airplane extends FlyingObject
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Airplane Attributes
  protected String brand;
  protected double price;
  protected int horsepower;

  //------------------------
  // CONSTRUCTOR
  //------------------------
  /**
   * This method constructs an Airplane object on default values
   */
  public Airplane() 
  {
    brand = "Standard";
    price = 0;
    horsepower = 0;
  }
  
  /**
   * This method constructs an Airplane object based on the given parameters
   * @param aBrand
   * @param aPrice
   * @param aHorsepower
   */
  public Airplane(String aBrand, double aPrice, int aHorsepower)
  {
    brand = aBrand;
    price = aPrice;
    horsepower = aHorsepower;
  }

  /**
   * This method constructs and copies an Airplane object based on a given object
   * @param aAirplane
   */
  public Airplane(Airplane aAirplane) 
  {
    brand = aAirplane.brand;
    price = aAirplane.price;
    horsepower = aAirplane.horsepower;
  }

  //------------------------
  // INTERFACE
  //------------------------
  
  /**
   * This method mutates the brand attribute of the given object
   * @param aBrand
   * @return
   */
  public boolean setBrand(String aBrand)
  {
    boolean wasSet = false;
    brand = aBrand;
    wasSet = true;
    return wasSet;
  }
  
  /**
   * This method mutates the price attribute of the given object
   * @param aPrice
   * @return
   */
  public boolean setPrice(double aPrice)
  {
    boolean wasSet = false;
    price = aPrice;
    wasSet = true;
    return wasSet;
  }
  
  /**
   * This method mutates the horsepower attribute of the given object
   * @param aHorsepower
   * @return
   */
  public boolean setHorsepower(int aHorsepower)
  {
    boolean wasSet = false;
    horsepower = aHorsepower;
    wasSet = true;
    return wasSet;
  }
  
  /**
   * This method accesses the brand attribute of the given object
   * @return
   */
  public String getBrand()
  {
    return brand;
  }
  
  /**
   * This method accesses the price attribute of the given object
   * @return
   */
  public double getPrice()
  {
    return price;
  }
  
  /**
   * This method accesses the horsepower attribute of the given object
   * @return
   */
  public int getHorsepower()
  {
    return horsepower;
  }

  /**
   * This method returns textual information about the object in a String format
   */
  public String toString()
  {
    return "The airplane's brand is "+this.brand+" and its price is "+this.price+"$. It has a horsepower of "+this.horsepower+".";
  }
  
  /**
   * This method compares the given object based on type and attributes
   * @param aAirplane
   * @return
   */
  public boolean equals(Airplane aAirplane)
  {
	if (aAirplane != null) {
		if (aAirplane instanceof Airplane) {
			if (this.brand == aAirplane.brand && this.price == aAirplane.price && this.horsepower == aAirplane.horsepower)
		    {
		      return true;
		    } 
		    else return false;
		} else return false;
	} else return false;
  }
}