/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 42 "model.ump"
// line 84 "model.ump"
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
  public MAV() {
    super();
    model = "Standard";
    size = 0.0;
  }
  public MAV(double aWeight, double aPrice, String aModel, double aSize)
  {
    super(aWeight, aPrice);
    model = aModel;
    size = aSize;
  }

  public MAV(MAV newMAV) {
    super(newMAV);
    this.model = newMAV.model;
    this.size = newMAV.size;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setModel(String aModel)
  {
    boolean wasSet = false;
    model = aModel;
    wasSet = true;
    return wasSet;
  }

  public boolean setSize(double aSize)
  {
    boolean wasSet = false;
    size = aSize;
    wasSet = true;
    return wasSet;
  }

  public String getModel()
  {
    return model;
  }

  public double getSize()
  {
    return size;
  }


  public String toString()
  {
    return "This MAV is a "+ this.model +". " + super.toString() + "Its size is "+this.size+".";
  }

  public boolean equals(MAV aMAV)
  {
    if (super.equals(aMAV) && this.model == aMAV.model && this.size == aMAV.size)
    {
      return true;
    } 
    else return false;
  }
}