import java.io.*;
import java.util.*;
public class Flight 
{
	//Variables for airplane
	String model;
	//int maxSeats;
	String flightDepart;  //leaving from where
	String flightArrive;  //going to where
	ArrayList<Seat> seatingChart = new ArrayList<Seat>();  //array list of seats
	//-------------------------------------------------------
	//########Variables for the seats#########
	String passengerName;   //who is sitting there
	String seatNumber;   //identifier A4, etc
	String seatType;    //firstclass, secondclass, economy
	double price;
	//-------------------------------------------------------
	//user has name, seat assignments
	static String userName;
	ArrayList<Seat> boughtSeats = new ArrayList<Seat>(); //variable to store a list of seats they own
	
	//-------------------------------------------------------

	
	//-------------------------------------------------------
	public static class User(String name) 
	{
		//seatsReserved is the variable that Reservation.java passes, "i would like these seats please"
		int i = 0;
		userName = name;
		boughtSeats = new ArrayList<Seat>();
		
	}
	public static void returnSeatsOwned(String user) 
	{
		int i = 0;
		while(i < seatsReserved.size())  //iterate through the seats being passed, assign them to the user
		{
			System.out.print("The user: " + user + " owns seat " + User.boughtSeats(i)); //print each seat the user owns
			i = i + 1;
		}
	}
	
	public static void setUserName(String input) 
	{
		userName = input;
	}
	
	public static void reserveSeat(User owner, Seat seatToBeReserved) 
	{
		//seatsReserved is the variable that Reservation.java passes, "i would like these seats please"
		owner.boughtSeats.Add(seatToBeReserved);   //assign the user object the seat they wish to reserve and add to arraylist
	}
	
	/*public class Seat(User owner, String seatPos) 
	{
		passengerName = owner.username;
		seatNumber = seatPos;
	}    this code could be used later if you want to make the seat have a user object that is the owner
	    */
	public class Seat(String reservedBy, String seatPos, double cost) 
	{
		//pasengerName is set to the name of the person reserving, the seat number is set by the method calling it to identify which seat they want
		passengerName = reservedBy;
		seatNumber = seatPos;
		price = cost;
	}
	
	public void setPassenegerName(String name, Seat currentSeat) 
	{
		currentSeat.passengerName = name;
	}
	
	public void setSeatPrice(Seat currentSeat, double cost) 
	{
		currentSeat.price = cost;
	}
	
	public static double getSeatPrice(Seat currentSeat) 
	{
		
		return currentSeat.price;  //in the actual main, it would take that and display costs of each seat
	}
	
	public static String getSeatNumber(Seat seatInQuestion) 
	{
		return seatInQuestion.seatNumber;   //returns the string of the number of the seat 
	}
	
	public static String getPassengerName(Seat seatInQuestion) 
	{
		return seatInQuestion.passengerName;  //return the name of person who reserved the seat
		
		//if you want to make a void and just return the print go ahead
		//System.out.println("The seat you requested is reserved by: " + currentSeat.passengerName);
	}
	
	public class Airplane(String modelNum) 
	{
		model = modelNum;
		maxSeats = totalSeats;
		
	}
	
	public class Boeing737 extends Airplane
	{
		/*initialize a bunch of rows in the fuselage of the plane
		Row row1 = new Row(6);
		Row row2 = new Row(6);
		Row row3 = new Row(6);
		Row row4 = new Row(6);
		Row row5 = new Row(4);
		Row row6 = new Row(2);   */
		
		//we need to initialize individual floorplans for each airplane, we can manually code what seats exist
		//make this airplane have 4 rows of 3, 2 rows of 2, and one seat that is reserved by a hostess
		//randomly select a few seats in each row and reserve them
	}
	
	public class AirMax747 extends Airplane
	{
		/*initialize a bunch of rows in the fuselage of the plane
		Row row1 = new Row(6);
		Row row2 = new Row(6);
		Row row3 = new Row(6);
		Row row4 = new Row(6);
		Row row5 = new Row(6);
		Row row6 = new Row(6);
		Row row7 = new Row(4);
		Row row8 = new Row(2);  */
		
		//we need to initialize individual floorplans for each airplane, we can manually code what seats exist
		//make this airplane have 4 rows of 3, 2 rows of 2, and one seat that is reserved by a hostess
		//randomly select a few seats in each row and reserve them
	}
	
	public class AirbusA220 extends Airplane
	{
		/*initialize a bunch of rows in the fuselage of the plane
		Row row1 = new Row(6);
		Row row2 = new Row(6);
		Row row3 = new Row(6);
		Row row4 = new Row(6);
		Row row5 = new Row(6);
		Row row6 = new Row(6);
		Row row7 = new Row(4);
		Row row8 = new Row(2); */
		
		//we need to initialize individual floorplans for each airplane, we can manually code what seats exist
		//make this airplane have 4 rows of 3, 2 rows of 2, and one seat that is reserved by a hostess
		//randomly select a few seats in each row and reserve them
	}	
	/*the print owner would take the array of seats and print the owner at a given postition
	public String printOwner(Seat[] seatingArr) 
	{
		for(int i = 0; i < seatingArr.length(); i++) 
		{
			if(seatingArr.seatNumber == seatingArr[i]) 
			{
				System.out.println(seatingArr.passengerName);
			}
		}
	}
	
	

	public void reserveSeat(String[] seatingArr, Scanner input) {
		int index = findEmpty(seatingChart);
		if(index == seatingChart.length()) {
			System.out.println("There are no available seats at this time.");
		}
		else {
			passengerName = input.nextLine();
			seatingChart[index].setPassengerName(passengerName);
			
		}
	}
	
	*/
	
}
