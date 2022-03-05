// -----------------------------------------------------
// Part: II
// Written by: Christopher Lopez, 40199547
// -----------------------------------------------------

import AgriMAV.AgriculturalDrone;
import AgriMAV.MAV;
import Airplane.Airplane;
import HeliQuad.Helicopter;
import HeliQuad.Quadcopter;
import Multirotor.Multirotor;
import UAV.UAV;
import Airplane.FlyingObject;

/**
 * This class is the driver method of Part I
 * @author Christopher Lopez
 *
 */
public class driver2 {
	/**
	 * This method takes a given array and returns a copy of it.
	 * @param flyinglist
	 * @return
	 */
	public static FlyingObject[] copyFlyingObjects(FlyingObject[] flyinglist) {

		// Creation of new array with same length as inputed array
		FlyingObject[] newlist = new FlyingObject[flyinglist.length];

		// Copying of array
		for (int i = 0; i<newlist.length; i++) {
			newlist[i] = new FlyingObject(flyinglist[i]);
		}
		return newlist;
	}
	
	/**
	 * This method prints out the contents of a given array of flying objects.
	 * @param flyinglist
	 */
	public static void printList(FlyingObject[] flyinglist) {
		System.out.println("Here are the elements of the list: ");
		for (int i = 0; i<flyinglist.length; i++) {
			 System.out.println(flyinglist[i].toString()+"\n");
		}
	}
	
	/**
	 * This is the main method of Part II of the assignment
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Object Creation
		AgriculturalDrone agriDrone1 = new AgriculturalDrone(50, 299.99, "AgriCorp", 25);
		AgriculturalDrone agriDrone2 = new AgriculturalDrone(45, 319.99, "FarmLTD", 35);
		MAV mav1 = new MAV(10, 99.99, "MicroDrones", 50);
		MAV mav2 = new MAV(8, 89.99, "AmazonDrones", 42);
		Airplane plane1 = new Airplane("Boeing", 32000, 999);
		Airplane plane2 = new Airplane("Airbus", 28000, 899);
		Helicopter heli1 = new Helicopter("USA-Copters", 15000, 500, 6, 1998, 6);
		Helicopter heli2 = new Helicopter("Heli-LTD", 19000, 400, 10, 2008, 8);
		Quadcopter quad1 = new Quadcopter("QuadPro", 12000, 350, 4, 2001, 4, 200);
		Quadcopter quad2 = new Quadcopter("QuadHeliz", 14000, 300, 4, 2003, 5, 180);
		Multirotor multi1 = new Multirotor("Multi-Rotation", 8000, 180, 3, 2013, 2, 2);
		Multirotor multi2 = new Multirotor("Multi-LTD", 7499, 200, 2, 2010, 2, 3);
		UAV uav1 = new UAV(50, 5000);
		UAV uav2 = new UAV(40, 4499);
		UAV uav3 = new UAV(50, 5000);
 
	
	
		// Creation of array and storing objects in array
		FlyingObject[] list1 = new FlyingObject[15];
		list1[0] = agriDrone1;
		list1[1] = agriDrone2;
		list1[2] = mav1;
		list1[3] = mav2;
		list1[4] = plane1;
		list1[5] = plane2;
		list1[6] = heli1;
		list1[7] = heli2;
		list1[8] = quad1;
		list1[9] = quad2;
		list1[10] = multi1;
		list1[11] = multi2;
		list1[12] = uav1;
		list1[13] = uav2;
		list1[14] = uav3;

		// Print Original List
		System.out.println("Original List: ");
		printList(list1);


		// Creation of second list and copying first list
		FlyingObject[] list2 = copyFlyingObjects(list1);
		
		
		// Print second list
		System.out.println("List copy: ");
		printList(list2);
		
	}
}
