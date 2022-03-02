/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 36 "model.ump"
// line 79 "model.ump"
public class UAV
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UAV Attributes
  private double weight;
  private double price;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UAV(double aWeight, double aPrice)
  {
    weight = aWeight;
    price = aPrice;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setWeight(double aWeight)
  {
    boolean wasSet = false;
    weight = aWeight;
    wasSet = true;
    return wasSet;
  }

  public boolean setPrice(double aPrice)
  {
    boolean wasSet = false;
    price = aPrice;
    wasSet = true;
    return wasSet;
  }

  public double getWeight()
  {
    return weight;
  }

  public double getPrice()
  {
    return price;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "weight" + ":" + getWeight()+ "," +
            "price" + ":" + getPrice()+ "]";
  }
}