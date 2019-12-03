
import java.io.*;
import java.util.*;
import Flight.java;
import Flight.User.Seat.Airplane;
public class Reservation 
{

	public static void main(String[] args) 
	{
		Scanner keybaord = new Scanner(System.in);
		System.out.println("This program will allow you to select a flight, and make reservations");
		Scanner keyboard = new Scanner(System.in);
		//ArrayList<PhoneBookEntry> nameList = new ArrayList<PhoneBookEntry>();
		//PhoneBookEntry entry1;
		Airplane flight1;
		Boeing737 flight4;
		Airplane flight2;
		Airplane flight3;
		
		
		//initialize 3 different flights
		//flights have random seating hardcoded, reserved by, flight information
		
		//initialize 4 users, the 1 user is "you" looking to reserve a seat
		//the other 3 are the users who have reserved on your plane
		
		//print the seating chart for the user
		//have a textbox for the user to type the singular seat they would like
		//check to see if seat is taken, if not, call reserve function
		//add that seat to the user's reserved arraylist
		//at the end, iterate through their reserved arraylist, add all of the costs, print total to GUI.
		
		
		

	}
	
	
	
	//pseudo code stubs
	public void printSeats(ArrayList<Seat> seatingArr) 
	{
		for(seat in seatingArr) {
			System.out.println(seat);
		}
	}
	
	public void findEmptySeat(Seat[] seatingArr) 
	{
		for (int i = 0; i < seatingArr.length(); i++) 
		{
			//If there is no passengername set the seat is empty
			if(seatingchart.passengerName == "") 
			{
				return seatingArr[i].seatNumber;
			}
		}
	}

}
