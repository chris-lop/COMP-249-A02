// -----------------------------------------------------
// Part: I
// Written by: Christopher Lopez, 40199547
// -----------------------------------------------------


package AgriMAV;

import UAV.UAV;

/**
 * This is the blueprint for the AgriculturalDrone objects
 * @author Christopher Lopez
 *
 */
public class AgriculturalDrone extends UAV
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AgriculturalDrone Attributes
  private String brand;
  private int carryCap;

  //------------------------
  // CONSTRUCTOR
  //------------------------
  
  /**
   * This method constructs the object without parameters
   */
  public AgriculturalDrone() {
    super();
    this.brand = "Standard";
    this.carryCap = 0;
  }
  
 /**
  * This method constructs the object with parameters.
  * @param aWeight
  * @param aPrice
  * @param aBrand
  * @param aCarryCap
  */
  public AgriculturalDrone(double aWeight, double aPrice, String aBrand, int aCarryCap)
  {
    super(aWeight, aPrice);
    brand = aBrand;
    carryCap = aCarryCap;
  }
  
  /**
   * This method copies and constructs a new object from a given object
   * @param newDrone
   */
  public AgriculturalDrone(AgriculturalDrone newDrone) {
    super(newDrone);
    this.brand = newDrone.brand;
    this.carryCap = newDrone.carryCap;
  }

  //------------------------
  // INTERFACE
  //------------------------
  
  /**
   * This method mutates the attribute brand
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
   * This method mutates the attribute carry capacity
   * @param aCarryCap
   * @return
   */
  public boolean setCarryCap(int aCarryCap)
  {
    boolean wasSet = false;
    carryCap = aCarryCap;
    wasSet = true;
    return wasSet;
  }
  
  /**
   * This method accesses the attribute brand
   * @return
   */
  public String getBrand()
  {
    return brand;
  }
  
  /**
   * This method accesses the attribute carry capacity
   * @return
   */
  public int getCarryCap()
  {
    return carryCap;
  }

  /**
   * This method prints the information of the object in the form of a String.
   */
  public String toString()
  {
    return  super.toString()+" This Agricultural Drone is manufactured by "+ this.brand +". " + "It can carry up to "+this.carryCap+" Kg.";
  }
  
  /**
   * This method compares two objects by type and attributes, and returns boolean value.
   * @param aAgriculturalDrone
   * @return
   */
  public boolean equals(AgriculturalDrone aAgriculturalDrone)
  {
	if (aAgriculturalDrone != null) {
		if (aAgriculturalDrone instanceof AgriculturalDrone) {
			if (super.equals(aAgriculturalDrone) && this.brand == aAgriculturalDrone.brand && this.carryCap == aAgriculturalDrone.carryCap)
		    {
		      return true;
		    } 
		    else return false;
		} else return false;
	} else return false;
  }
}
