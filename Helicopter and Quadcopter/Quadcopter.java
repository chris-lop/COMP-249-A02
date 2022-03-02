/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 17 "model.ump"
// line 64 "model.ump"
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

  public Quadcopter(String aBrand, double aPrice, int aHorsepower, int aNumCylinders, int aCreationYear, int aPassengerCap, int aMaxFlySpeed)
  {
    super(aBrand, aPrice, aHorsepower, aNumCylinders, aCreationYear, aPassengerCap);
    maxFlySpeed = aMaxFlySpeed;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setMaxFlySpeed(int aMaxFlySpeed)
  {
    boolean wasSet = false;
    maxFlySpeed = aMaxFlySpeed;
    wasSet = true;
    return wasSet;
  }

  public int getMaxFlySpeed()
  {
    return maxFlySpeed;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "maxFlySpeed" + ":" + getMaxFlySpeed()+ "]";
  }
}