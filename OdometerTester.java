/***********************************************************************
 * AUTHOR:	Nery Chapeton-Lamas
 * COURSE:	CS 111 (Intro to CS I: Java)
 * HW #:	9
 * PROJECT:	1
 * LASTMOD:	10/08/2015
 * *********************************************************************/

/***********************************************************************
 * TITLE: Odometer Class Tester
 * *********************************************************************
 * PROGRAM DESCRIPTION: Test all methods and possibilities for Odometer
 * *********************************************************************
 * OBJECTIVES:
 * - Test toString() right after instantiation + after changes
 *   - Shows default values at start, and values after many changes
 * - Test addMiles() with bad and good data (include boundary)
 *   - bad = negative, good = positive, good/boundary = 0
 * - Test setFuelEfficiency() with bad and good data (include boundary)
 *   - bad = negative, good = positive, bad/boundary (because could
 *   	cause crash for divide by zero or Infinity value) = 0
 * - Test reset()
 *   - on object with miles to show it goes back to zero
 * *********************************************************************/

public class OdometerTester
{
	public static void main(String[] args)
	{
		Odometer trip1, trip2, trip3;

		trip1 = new Odometer();
		trip2 = new Odometer();
		trip3 = new Odometer();

		System.out.println("START OF ALL OBJECTS, miles and mpg should all be 0's!!");
		System.out.println( "Trip #1: " + trip1 );//testing toString(), 
		System.out.println( "Trip #2: " + trip2 );//it's called automatically on objects in println()!
		System.out.println( "Trip #3: " + trip3 );

		trip1.addMiles(160.0);//testing good (positive) value
		trip2.addMiles(0.0);  //testing good (zero/boundary) value
		trip3.addMiles(-56.0);//testing bad (negative) value

		trip1.setFuelEfficiency(0);   //testing bad (zero/boundary) value
		trip2.setFuelEfficiency(-5.4);//testing bad (negative) value
		trip3.setFuelEfficiency(26.5);//testing good (positive) value

		System.out.println("\nTrip 1 = 160.0mi/0.0mpg, Trip 2 = 0.0mi/0.0mpg, Trip 3 = 0.0mi/26.5mpg");
		System.out.println( "Trip #1: " + trip1.toString() );	//just to show explicit call works the same
		System.out.println( "Trip #2: " + trip2.toString() );
		System.out.println( "Trip #3: " + trip3.toString() );

		trip1.setFuelEfficiency(18.3);
		trip2.setFuelEfficiency(26.5);
		trip2.addMiles(190.5);
		trip3.addMiles(190.0);

		trip1.reset();	//testing reset
		trip2.setFuelEfficiency(0);

		System.out.println("\nCalculating number of gallons = 0.0, 0.0 (not Infinity/crash!), 7.169811320754717");
		System.out.println("Trip #1: " + trip1.getGallonsConsumed() + " gallons");//testing 0 mi
		System.out.println("Trip #2: " + trip2.getGallonsConsumed() + " gallons");//testing 0 mpg (no Infinity/crash!)
		System.out.println("Trip #3: " + trip3.getGallonsConsumed() + " gallons");//testing good mi and mpg
	}

}
