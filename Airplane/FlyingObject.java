// -----------------------------------------------------
// Part: I
// Written by: Christopher Lopez, 40199547
// -----------------------------------------------------

package Airplane;

/**
 * This is the blueprint for the FlyingObject objects
 * @author Christopher Lopez
 *
 */
public class FlyingObject {
	String brand;
	
	/**
	 * This method constructs a FlyingObject object on default values 
	 */
	public FlyingObject() {
		
	}
	
	/**
	 * This method constructs a FlyingObject object on copied values from another object
	 * @param aFlyingObject
	 */
	public FlyingObject(FlyingObject aFlyingObject) {
		this.brand = aFlyingObject.brand;
	}
}
