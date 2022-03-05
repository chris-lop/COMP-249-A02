// -----------------------------------------------------
// Part: I
// Written by: Christopher Lopez, 40199547
// -----------------------------------------------------

package AgriMAV;

import UAV.UAV;

/**
 * This is the blueprint for the MAV objects
 * @author Christopher Lopez
 *
 */
public class MAV extends UAV
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MAV Attributes
  private String model;
  private double size;

  //------------------------
  // CONSTRUCTOR
  //------------------------
  /**
   * This method constructs an object of type MAV with default values.
   */
  public MAV() {
    super();
    model = "Standard";
    size = 0.0;
  }
  
  /**
   * This method constructs an object of type MAV with the given parameters
   * @param aWeight
   * @param aPrice
   * @param aModel
   * @param aSize
   */
  public MAV(double aWeight, double aPrice, String aModel, double aSize)
  {
    super(aWeight, aPrice);
    model = aModel;
    size = aSize;
  }
  
  /**
   * This method constructs and copies a new object based on given object.
   * @param newMAV
   */
  public MAV(MAV newMAV) {
    super(newMAV);
    this.model = newMAV.model;
    this.size = newMAV.size;
  }

  //------------------------
  // INTERFACE
  //------------------------
  
  /**
   * This method mutates the attribute model of the given object.
   * @param aModel
   * @return
   */
  public boolean setModel(String aModel)
  {
    boolean wasSet = false;
    model = aModel;
    wasSet = true;
    return wasSet;
  }
  
  /**
   * This method mutates the attribute size of the given objects.
   * @param aSize
   * @return
   */
  public boolean setSize(double aSize)
  {
    boolean wasSet = false;
    size = aSize;
    wasSet = true;
    return wasSet;
  }
  
  /**
   * This method accesses the model attribute of the given object.
   * @return
   */
  public String getModel()
  {
    return model;
  }
  
  /**
   * This method accesses the size attribute of the given object.
   * @return
   */
  public double getSize()
  {
    return size;
  }

  /**
   * This method returns textual information about the object in the form of a String
   */
  public String toString()
  {
    return  super.toString()+" This MAV is a "+ this.model +". " + "Its size is "+this.size+".";
  }
  
  /**
   * This method compares two given objects based on type and attributes.
   * @param aMAV
   * @return
   */
  public boolean equals(MAV aMAV)
  {
	if (aMAV != null) {
		if (aMAV instanceof MAV) {
			if (super.equals(aMAV) && this.model == aMAV.model && this.size == aMAV.size)
		    {
		      return true;
		    } 
		    else return false;
		} else return false;
	} else return false;
  }
}