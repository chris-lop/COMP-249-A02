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
  public AgriculturalDrone() {
    super();
    this.brand = "Standard";
    this.carryCap = 0;
  }
  public AgriculturalDrone(double aWeight, double aPrice, String aBrand, int aCarryCap)
  {
    super(aWeight, aPrice);
    brand = aBrand;
    carryCap = aCarryCap;
  }

  public AgriculturalDrone(AgriculturalDrone newDrone) {
    super(newDrone);
    this.brand = newDrone.brand;
    this.carryCap = newDrone.carryCap;
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


  public String toString()
  {
    return  "This Agricultural Drone is manufactured by "+ this.brand +". " + super.toString() + "It can carry up to "+this.carryCap+" Kg.";
  }
  
  public boolean equals(AgriculturalDrone aAgriculturalDrone)
  {
    if (super.equals(aAgriculturalDrone) && this.brand == aAgriculturalDrone.brand && this.carryCap == aAgriculturalDrone.carryCap)
    {
      return true;
    } 
    else return false;
  }
}
