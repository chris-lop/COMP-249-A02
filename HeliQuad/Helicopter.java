// -----------------------------------------------------
// Part: I
// Written by: Christopher Lopez, 40199547
// -----------------------------------------------------

package HeliQuad;

import Airplane.Airplane;
import UAV.UAV;

/**
 * This is the blueprint for the Helicpter objects
 * @author Christopher Lopez
 *
 */
public class Helicopter extends Airplane
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Helicopter Attributes
  protected int numCylinders;
  protected int creationYear;
  protected int passengerCap;

  //------------------------
  // CONSTRUCTOR
  //------------------------
  
  /**
   * This method constructs a Helicopter object on default values
   */
  public Helicopter() 
  {
    super();
    numCylinders = 0;
    creationYear = 0;
    passengerCap = 0;
  }
  
  /**
   * This method constructs a Helicopter object on given parameters
   * @param aBrand
   * @param aPrice
   * @param aHorsepower
   * @param aNumCylinders
   * @param aCreationYear
   * @param aPassengerCap
   */
  public Helicopter(String aBrand, double aPrice, int aHorsepower, int aNumCylinders, int aCreationYear, int aPassengerCap)
  {
    super(aBrand, aPrice, aHorsepower);
    numCylinders = aNumCylinders;
    creationYear = aCreationYear;
    passengerCap = aPassengerCap;
  }
  
  /**
   * This method constructs Helicopter object based on copied values from another object
   * @param aHelicopter
   */
  public Helicopter(Helicopter aHelicopter) 
  {
    super(aHelicopter);
    numCylinders = aHelicopter.numCylinders;
    creationYear = aHelicopter.creationYear;
    passengerCap = aHelicopter.passengerCap;
  }

  //------------------------
  // INTERFACE
  //------------------------
  
  /**
   * This method mutates the NumCylinders attribute of the given object
   * @param aNumCylinders
   * @return
   */
  public boolean setNumCylinders(int aNumCylinders)
  {
    boolean wasSet = false;
    numCylinders = aNumCylinders;
    wasSet = true;
    return wasSet;
  }
  
  /**
   * This method mutates the CreationYear attribute of the given object
   * @param aCreationYear
   * @return
   */
  public boolean setCreationYear(int aCreationYear)
  {
    boolean wasSet = false;
    creationYear = aCreationYear;
    wasSet = true;
    return wasSet;
  }
  
  /**
   * This method mutates the PassengerCap attribute of the given object
   * @param aPassengerCap
   * @return
   */
  public boolean setPassengerCap(int aPassengerCap)
  {
    boolean wasSet = false;
    passengerCap = aPassengerCap;
    wasSet = true;
    return wasSet;
  }
  
  /**
   * This method accesses the NumCylinders attribute of the given object
   * @return
   */
  public int getNumCylinders()
  {
    return numCylinders;
  }
  
  /**
   * This method accesses the CreationYear attribute of the given object
   * @return
   */
  public int getCreationYear()
  {
    return creationYear;
  }
  
  /**
   * This method accesses the PassengerCap attribute of the given object
   * @return
   */
  public int getPassengerCap()
  {
    return passengerCap;
  }

  /**
   * This method returns textual information about the given object in String format
   */
  public String toString()
  {
    return super.toString()+" It is an helicopter with "+this.numCylinders+" cylinders. It was created in the year "+this.creationYear+". The passenger capacity of this helicopter is "+this.passengerCap;
  }
  
  /**
   * This method compares two given objects based on type and attributes
   * @param aHelicopter
   * @return
   */
  public boolean equals(Helicopter aHelicopter)
  {
	if (aHelicopter != null) {
		if (aHelicopter instanceof Helicopter) {
			if (super.equals(aHelicopter) && this.numCylinders == aHelicopter.numCylinders && this.creationYear == aHelicopter.creationYear && this.passengerCap == aHelicopter.passengerCap)
		    {
		      return true;
		    } 
		    else return false;
		} else return false;
	} else return false;
  }
}