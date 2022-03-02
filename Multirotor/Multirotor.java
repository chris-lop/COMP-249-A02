/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 23 "model.ump"
// line 69 "model.ump"
public class Multirotor extends Helicopter
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Multirotor Attributes
  private int numRotors;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Multirotor(String aBrand, double aPrice, int aHorsepower, int aNumCylinders, int aCreationYear, int aPassengerCap, int aNumRotors)
  {
    super(aBrand, aPrice, aHorsepower, aNumCylinders, aCreationYear, aPassengerCap);
    numRotors = aNumRotors;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setNumRotors(int aNumRotors)
  {
    boolean wasSet = false;
    numRotors = aNumRotors;
    wasSet = true;
    return wasSet;
  }

  public int getNumRotors()
  {
    return numRotors;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "numRotors" + ":" + getNumRotors()+ "]";
  }
}