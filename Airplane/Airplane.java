/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 2 "model.ump"
// line 54 "model.ump"
public class Airplane
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Airplane Attributes
  private String brand;
  private double price;
  private int horsepower;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Airplane() 
  {
    brand = "Standard";
    price = 0;
    horsepower = 0;
  }

  public Airplane(String aBrand, double aPrice, int aHorsepower)
  {
    brand = aBrand;
    price = aPrice;
    horsepower = aHorsepower;
  }

  public Airplane(Airplane aAirplane) 
  {
    brand = aAirplane.brand;
    price = aAirplane.price;
    horsepower = aAirplane.horsepower;
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

  public boolean setPrice(double aPrice)
  {
    boolean wasSet = false;
    price = aPrice;
    wasSet = true;
    return wasSet;
  }

  public boolean setHorsepower(int aHorsepower)
  {
    boolean wasSet = false;
    horsepower = aHorsepower;
    wasSet = true;
    return wasSet;
  }

  public String getBrand()
  {
    return brand;
  }

  public double getPrice()
  {
    return price;
  }

  public int getHorsepower()
  {
    return horsepower;
  }

  public String toString()
  {
    return super.toString() + "["+
            "brand" + ":" + getBrand()+ "," +
            "price" + ":" + getPrice()+ "," +
            "horsepower" + ":" + getHorsepower()+ "]";
  }

  public boolean equals(Airplane aAirplane)
  {
    // Use getClass
    if (this.brand == aAirplane.brand && this.price == aAirplane.price && this.horsepower == aAirplane.horsepower)
    {
      return true;
    } 
    else return false;
  }
}