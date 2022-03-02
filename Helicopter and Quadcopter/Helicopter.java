/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 9 "model.ump"
// line 59 "model.ump"
public class Helicopter extends Airplane
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Helicopter Attributes
  private int numCylinders;
  private int creationYear;
  private int passengerCap;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Helicopter(String aBrand, double aPrice, int aHorsepower, int aNumCylinders, int aCreationYear, int aPassengerCap)
  {
    super(aBrand, aPrice, aHorsepower);
    numCylinders = aNumCylinders;
    creationYear = aCreationYear;
    passengerCap = aPassengerCap;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setNumCylinders(int aNumCylinders)
  {
    boolean wasSet = false;
    numCylinders = aNumCylinders;
    wasSet = true;
    return wasSet;
  }

  public boolean setCreationYear(int aCreationYear)
  {
    boolean wasSet = false;
    creationYear = aCreationYear;
    wasSet = true;
    return wasSet;
  }

  public boolean setPassengerCap(int aPassengerCap)
  {
    boolean wasSet = false;
    passengerCap = aPassengerCap;
    wasSet = true;
    return wasSet;
  }

  public int getNumCylinders()
  {
    return numCylinders;
  }

  public int getCreationYear()
  {
    return creationYear;
  }

  public int getPassengerCap()
  {
    return passengerCap;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "numCylinders" + ":" + getNumCylinders()+ "," +
            "creationYear" + ":" + getCreationYear()+ "," +
            "passengerCap" + ":" + getPassengerCap()+ "]";
  }
}