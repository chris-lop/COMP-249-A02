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

  public MAV(double aWeight, double aPrice, String aModel, double aSize)
  {
    super(aWeight, aPrice);
    model = aModel;
    size = aSize;
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

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "model" + ":" + getModel()+ "," +
            "size" + ":" + getSize()+ "]";
  }
}