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

  public Helicopter() 
  {
    super();
    numCylinders = 0;
    creationYear = 0;
    passengerCap = 0;
  }

  public Helicopter(String aBrand, double aPrice, int aHorsepower, int aNumCylinders, int aCreationYear, int aPassengerCap)
  {
    super(aBrand, aPrice, aHorsepower);
    numCylinders = aNumCylinders;
    creationYear = aCreationYear;
    passengerCap = aPassengerCap;
  }

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


  public String toString()
  {
    return super.toString() + "["+
            "numCylinders" + ":" + getNumCylinders()+ "," +
            "creationYear" + ":" + getCreationYear()+ "," +
            "passengerCap" + ":" + getPassengerCap()+ "]";
  }

  // Check super implementation
  public boolean equals(Helicopter aHelicopter)
  {
    if (super.equals(aHelicopter) && this.numCylinders == aHelicopter.numCylinders && this.creationYear == aHelicopter.creationYear && this.passengerCap == aHelicopter.passengerCap)
    {
      return true;
    } 
    else return false;
  }
}