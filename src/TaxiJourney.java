

/**TaxiJourney class will take the user inputs for a ride
 * Class has methods to handle the the user inputs and assign values
 * It returns the cost of the journey when the method is called from test class
 *
 */
public class TaxiJourney {

	//variables
	// start location for storing journey start location
	// destination location for storing journey destination location
	// distance for storing the distance of journey
	//duration for storing the duration of journey
	private String Start_location;  
	private String destination_location; 
	private double distance;
	private int duration;
	
	// base fair for storing minumum base fair of a trip
	// cost per mile for storing unit cost for a mile
	//cost per minute for storing unit cost per minute
	// traffic related costs is for storing waiting cost in traffic
	private double base_fair;
	private double cost_per_mile;
	private double cost_per_minute;
	private double Traffic_related_costs;
	
	/**default constructor
	 * Default variable values are set by user
	 * user will assign the values for base_fair,cost_per_mile,cost_per_minute,Traffic_related_costs
	 * values for Start_location,destination_location are set null and distance,duration are set to 0
	 */
	public TaxiJourney()
		{
			this.Start_location="";
			this.destination_location="";
			this.distance=0.0;
			this.duration=0;
			this.base_fair=4.80;
			this.cost_per_mile=1.50;
			this.cost_per_minute=0.36;
			this.Traffic_related_costs=0.62;	
		}	
		/**sets the start location of journey
		 * 
		 * @param Start_location this parameter is for start location
		 */
		public void set_Start_location(String Start_location) {
			this.Start_location = Start_location;
		}
		/**sets the destination location of journey
		 * 
		 * @param destination_location this parameter is for destination location
		 */
		public void set_destination_location(String destination_location) {
			this.destination_location = destination_location;
		}
		/**sets the distance of journey
		 * 
		 * @param distance this parameter is for distance 
		 */
		public void set_distance(double distance) {
			this.distance = distance;
		}
		/**sets the duration of journey
		 * 
		 * @param duration this parameter is for duration
		 */
		public void set_duration(int duration) {
			this.duration = duration;
		}	
		/**returns the travel cost of journey
		 * 
		 * @return total_journey_cost this is the total cost of journey
		 */
		public double get_travel_cost() 
		{
			double total_dist_cost=(cost_per_mile*this.distance);
			double cost_for_travel_duration=(cost_per_minute*Traffic_related_costs);
			double total_journey_cost=(base_fair+total_dist_cost+cost_for_travel_duration);
			return total_journey_cost;	
		}
	}
	