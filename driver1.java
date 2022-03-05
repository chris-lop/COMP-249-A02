// -----------------------------------------------------
// Part: I
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
 * This class is Part I of the assignment
 * @author Christopher Lopez
 *
 */
public class driver1 {
	/**
	 * This method finds the least and most expensive UAV's in a given array of flying objects.
	 * @param flyinglist
	 */
	public static void findLeastAndMostExpensiveUAV(FlyingObject[] flyinglist) {
		UAV most = null;
		UAV least = null;
		int counter=0;


		for (int i=0; i<flyinglist.length; i++) {

			if (flyinglist[i] instanceof UAV) {
				counter++;
				
				// One UAV in list
				if (counter==1) {
					most = new UAV((UAV)flyinglist[i]);
					least = new UAV((UAV)flyinglist[i]);
				}
				// Compare price of saved UAV with current iteration (MOST)
				if (most.getPrice() < ((UAV)flyinglist[i]).getPrice()) {
					most = ((UAV)flyinglist[i]);
				}
				// Compare price of saved UAV with current iteration (LEAST)
				if(least.getPrice()> ((UAV)flyinglist[i]).getPrice()) {
					least = ((UAV)flyinglist[i]);
				}
			}
		}
		// When list has no UAVs
		if (counter==0) {
			System.out.println("There are no UAV's in this array!");
			System.exit(0);
		}
		
		// When list has ONE UAV
		if(most.equals(least)) {
			System.out.println("The most and least expensive UAV: "+ most);
			System.exit(0);
		}
		// When list had more than one UAV
		if (counter>1) {
			System.out.println("The most expensive UAV: "+ most);
			System.out.println("The least expensive UAV: "+ least);
			System.exit(0);
		}
	}
	/**
	 * This is the second main method of Part I
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
		
		// To String Testing
		System.out.println(agriDrone1.toString());
		System.out.println(agriDrone2.toString());
		System.out.println(mav1.toString());
		System.out.println(mav2.toString());
		System.out.println(plane1.toString());
		System.out.println(plane2.toString());
		System.out.println(heli1.toString());
		System.out.println(heli2.toString());
		System.out.println(quad1.toString());
		System.out.println(quad2.toString());
		System.out.println(multi1.toString());
		System.out.println(multi2.toString());
		System.out.println(uav1.toString());
		System.out.println(uav2.toString());
		System.out.println(uav3.toString());
		
		// Equals testing
		System.out.println(mav1.equals(heli1));
		System.out.println(plane1.equals(plane2));
		System.out.println(uav1.equals(uav3));
		
		// Array creation
		FlyingObject list1[]= new FlyingObject[15];
		FlyingObject list2[] = new FlyingObject[15];
		
		// Array 1
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
		
		// Array 2
		list2[0] = plane1;
		list2[1] = plane2;
		list2[2] = heli1;
		list2[3] = heli2;
		list2[4] = quad1;
		list2[5] = quad2;
		list2[6] = multi1;
		list2[7] = multi2;
		list2[8] = plane1;
		list2[9] = plane2;
		list2[10] = heli1;
		list2[11] = heli2;
		list2[12] = quad1;
		list2[13] = quad2;
		list2[14] = multi1;
		
		// Find least and most
		
		driver1.findLeastAndMostExpensiveUAV(list1);
		
		driver1.findLeastAndMostExpensiveUAV(list2);


		
	}
}
