// -----------------------------------------------------
// Part: I
// Written by: Christopher Lopez, 40199547
// -----------------------------------------------------

package HeliQuad;

/**
 * This is the blueprint for the Quadcopter objects
 * @author Christopher Lopez
 *
 */
public class Quadcopter extends Helicopter
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Quadcopter Attributes
  private int maxFlySpeed;

  //------------------------
  // CONSTRUCTOR
  //------------------------
  
  /**
   * This method constructs a Quadcopter object on default values
   */
  public Quadcopter() 
  {
    super();
    maxFlySpeed = 0;
  }
  
  /**
   * This method constructs a Quadcopter object based on given parameters
   * @param aBrand
   * @param aPrice
   * @param aHorsepower
   * @param aNumCylinders
   * @param aCreationYear
   * @param aPassengerCap
   * @param aMaxFlySpeed
   */
  public Quadcopter(String aBrand, double aPrice, int aHorsepower, int aNumCylinders, int aCreationYear, int aPassengerCap, int aMaxFlySpeed)
  {
    super(aBrand, aPrice, aHorsepower, aNumCylinders, aCreationYear, aPassengerCap);
    maxFlySpeed = aMaxFlySpeed;
  }
  
  /**
   * This method constructs and copies a Quadcopter object based on copied attributes
   * @param aQuadcopter
   */
  public Quadcopter(Quadcopter aQuadcopter) 
  {
    super(aQuadcopter);
    maxFlySpeed = aQuadcopter.maxFlySpeed;
  }

  //------------------------
  // INTERFACE
  //------------------------
  
  /**
   * This method mutates the MaxFlySpeed attribute of the given object
   * @param aMaxFlySpeed
   * @return
   */
  public boolean setMaxFlySpeed(int aMaxFlySpeed)
  {
    boolean wasSet = false;
    maxFlySpeed = aMaxFlySpeed;
    wasSet = true;
    return wasSet;
  }
  
  /**
   * This method accesses the MaxFlySpeed atteribute of the given object
   * @return
   */
  public int getMaxFlySpeed()
  {
    return maxFlySpeed;
  }

  /**
   * This method returns textual information of the given object in String format
   */
  public String toString()
  {
    return super.toString()+" The max flight speed of this Quadcopter is "+this.maxFlySpeed+" km/h.";
  }
  
  /**
   * This method compares two objects based on type and attribute
   * @param aQuadcopter
   * @return
   */
  public boolean equals(Quadcopter aQuadcopter)
  {
	if (aQuadcopter != null) {
		if (aQuadcopter instanceof Quadcopter) {
			if (super.equals(aQuadcopter) && this.maxFlySpeed == aQuadcopter.maxFlySpeed)
		    {
		      return true;
		    } 
		    else return false;
		} else return false;
	} else return false;
  }
}