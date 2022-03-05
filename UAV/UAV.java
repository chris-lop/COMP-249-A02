// -----------------------------------------------------
// Part: I
// Written by: Christopher Lopez, 40199547
// -----------------------------------------------------

package UAV;

import Airplane.FlyingObject;

/**
 * This is the blueprint for the UAV objects
 * @author Christopher Lopez
 *
 */
public class UAV extends FlyingObject
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UAV Attributes
	protected double weight;
	protected double price;

  //------------------------
  // CONSTRUCTOR
  //------------------------
	
  /**
   * This method constructs a UAV object on default values
   */
  public UAV()
  {
    weight = 0;
    price = 0;
  }
  
  /**
   * This method constructs a UAV object based on given parameters
   * @param aWeight
   * @param aPrice
   */
  public UAV(double aWeight, double aPrice)
  {
    weight = aWeight;
    price = aPrice;
  }
  
  /**
   * This method constructs and copies a UAV object based on given Object
   * @param aUAV
   */
  public UAV(UAV aUAV)
  {
    weight = aUAV.weight;
    price = aUAV.price;
  }

  //------------------------
  // INTERFACE
  //------------------------
  
  /**
   * This method mutates Weight attribute of given object
   * @param aWeight
   * @return
   */
  public boolean setWeight(double aWeight)
  {
    boolean wasSet = false;
    weight = aWeight;
    wasSet = true;
    return wasSet;
  }
  
  /**
   * This method mutates Price attribute of given object
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
   * This method accesses Weight attribute of given object
   * @return
   */
  public double getWeight()
  {
    return weight;
  }
  
  /**
   * This method accesses Price attribute of given object
   * @return
   */
  public double getPrice()
  {
    return price;
  }

  /**
   * This method returns textual information about given object in String format
   */
  public String toString()
  {
    return "This UAV weighs "+this.weight+", and costs "+this.price+"$.";
  }
  
  /**
   * This method compares two given objects based on type and attributes
   * @param aUAV
   * @return
   */
  public boolean equals(UAV aUAV)
  {
	if (aUAV != null) {
		if (aUAV instanceof UAV) {
			if (this.weight == aUAV.weight && this.price == aUAV.price)
		    {
		      return true;
		    } 
		    else return false;
		} else return false;
	} else return false;
  }
}