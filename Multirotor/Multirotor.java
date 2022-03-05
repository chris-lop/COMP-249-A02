// -----------------------------------------------------
// Part: I
// Written by: Christopher Lopez, 40199547
// -----------------------------------------------------

package Multirotor;

import Airplane.Airplane;
import HeliQuad.Helicopter;

/**
 * This is the blueprint for the Multirotor objects
 * @author Christopher Lopez
 *
 */
public class Multirotor extends Helicopter
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Multirotor Attributes
  private int numRotors;

  //------------------------
  // CONSTRUCTOR
  //------------------------
  
  /**
   * This method constructs a Multirotor object based on default values
   */
  public Multirotor()
  {
    super();
    numRotors = 0;
  }
  
  /**
   * This method constructs a Multirotor object based on given parameters
   * @param aBrand
   * @param aPrice
   * @param aHorsepower
   * @param aNumCylinders
   * @param aCreationYear
   * @param aPassengerCap
   * @param aNumRotors
   */
  public Multirotor(String aBrand, double aPrice, int aHorsepower, int aNumCylinders, int aCreationYear, int aPassengerCap, int aNumRotors)
  {
    super(aBrand, aPrice, aHorsepower, aNumCylinders, aCreationYear, aPassengerCap);
    numRotors = aNumRotors;
  }
  
  /**
   * This method constructs and copies a Multirotor object based on given Object
   * @param aMultirotor
   */
  public Multirotor(Multirotor aMultirotor)
  {
    super(aMultirotor);
    numRotors = aMultirotor.numRotors;
  }

  //------------------------
  // INTERFACE
  //------------------------
  
  /**
   * This method mutates the NumRotors attribute of the given object
   * @param aNumRotors
   * @return
   */
  public boolean setNumRotors(int aNumRotors)
  {
    boolean wasSet = false;
    numRotors = aNumRotors;
    wasSet = true;
    return wasSet;
  }
  
  /**
   * This method accesses the NumRotors attribute of the given object
   * @return
   */
  public int getNumRotors()
  {
    return numRotors;
  }
  
  /**
   * This method returns textual information about the given object in a String format
   */
  public String toString()
  {
	  return super.toString()+" This multirotor has "+this.numRotors+" rotors.";
  }
  
  /**
   * This method compares two given objects based on type and attributes
   * @param aMultirotor
   * @return
   */
  public boolean equals(Multirotor aMultirotor)
  {
	if (aMultirotor != null) {
		if (aMultirotor instanceof Multirotor) {
			if (super.equals(aMultirotor) && this.numRotors == aMultirotor.numRotors)
		    {
		      return true;
		    } 
		    else return false;
		} else return false;
	} else return false;
  }
}