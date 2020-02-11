
import java.io.*; // import io class
import java.util.Scanner; // import scanner class
/**This program will test whether the program is working properly or not 
 * constructor and the methods are called and test cases are checked
 */

public class TaxiJourneyTest 
{
	public static void main(String[] args) 
	{
		String Start_location;
		String destination_location;
		double distance;
		int duration;
		
		Scanner sc = new Scanner(System.in);
		TaxiJourney Journey_instance=new TaxiJourney();
		System.out.println("Enter current location");
		Start_location=sc.nextLine();                      // input for start location is taken from user
		Journey_instance.set_Start_location(Start_location); // start location is set
		
		System.out.println("Enter Destination location");
		destination_location=sc.nextLine();                     // input for destination is taken from user
		Journey_instance.set_destination_location(destination_location);// destination location is set
		
		System.out.println("Enter Approximate distance(in miles)");
		distance=sc.nextInt();                                           // input for distance is taken from user
		Journey_instance.set_distance(distance);                          // distance of journey is set
		
		System.out.println("Enter Approximate time duration in minutes");
		duration=sc.nextInt();                                              // input for duration is taken from user
		Journey_instance.set_duration(duration);                             // duration of journey is set
		
		System.out.println("Total cost of Journey is	"+Journey_instance.get_travel_cost()); // booking cost of journey is displayed
	}
}
