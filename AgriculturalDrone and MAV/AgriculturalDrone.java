/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 29 "model.ump"
// line 74 "model.ump"
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

  public AgriculturalDrone(double aWeight, double aPrice, String aBrand, int aCarryCap)
  {
    super(aWeight, aPrice);
    brand = aBrand;
    carryCap = aCarryCap;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setBrand(String aBrand)
  {
    boolean wasSet = false;
    brand = aBrand;
    wasSet = true;
    return wasSet;
  }

  public boolean setCarryCap(int aCarryCap)
  {
    boolean wasSet = false;
    carryCap = aCarryCap;
    wasSet = true;
    return wasSet;
  }

  public String getBrand()
  {
    return brand;
  }

  public int getCarryCap()
  {
    return carryCap;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "brand" + ":" + getBrand()+ "," +
            "carryCap" + ":" + getCarryCap()+ "]";
  }
}