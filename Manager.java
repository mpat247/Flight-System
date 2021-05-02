/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/**
 *
 * @author Manav
 */
public class Manager 
{

    private static int flightNumber;
    List<Flight> flights = new ArrayList<Flight>();
    List<Ticket> tickets = new ArrayList<Ticket>();
    
    public void createFlights()
    {
        //enter flight information, every time new flight will be created
        int flightNumber;
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Flight number: ");
        flightNumber = scan1.nextInt();
        String origin, destination, dateTime;
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Origin of the flight: ");
        origin = scan2.nextLine(); 
        System.out.println("Destination of the flight: ");
        destination = scan2.nextLine();
        System.out.println("Date (mm/dd/yyyy) and Time(HH:MM XM) of the flight: ");
        dateTime = scan2.nextLine();
        int capacity;
        System.out.println("Capacity: ");
        capacity = scan1.nextInt();
        double originalPrice;
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Original price: ");
        originalPrice = scan2.nextDouble();
        //new flight will be created here
        Flight newFlight = new Flight(flightNumber, origin, destination, dateTime, capacity, originalPrice);
        flights.add(newFlight);
        System.out.println("New flight: " + newFlight);
    }
    
    //displays available flights and only those that are not yet fully booked
    public void displayAvailableFlights(String origin, String destination)
    {
        for(Flight fli:flights)
        {
            //if destination and origin received is the same as an available flight
            if(fli.getDestination().equals(destination) && fli.getOrigin().equals(origin) && fli.getNumberOfSeatsLeft() > 0)
            {
                System.out.println(fli.toString());
            }
        }
    }   
    
    //returns flight object for the specified flight number
    public Flight getFlight(int flightNumber)
    {
         for(Flight fli:flights)
         {
             if(flightNumber == fli.getFlightNumber())
             {
                 return fli;
             }
         }
         return null;
    }
    
    public void bookSeat (int flightNumber, Passenger p)
    {
        //for all the list of flights
        for (Flight fli:flights)
        {
            //find the flight for the given flight number and if it is found apply discount based on if they are a memebr or not
            if(flightNumber == fli.getFlightNumber())
            {
                //book a seat and apply discounts only if there are available seats, also add newTicket to the number of tickets each time
                double discount = p.applyDiscount(fli.getOriginalPrice());
                Ticket newTicket = new Ticket(p, fli, discount);
                tickets.add(newTicket);
            }
        }
    }
    
    public static void main(String[] args)
    {

        Manager newManager = new Manager();  
        //createFlight method
        System.out.println("Create new flight: ");
        newManager.createFlights();
        System.out.println();

        //displayAvailableFlights method
        System.out.println("Displaying flights: ");
        String origin, destination;
        System.out.println("Origin: ");
        Scanner scan = new Scanner(System.in);
        origin = scan.nextLine();
        System.out.println("Destination: ");
        destination = scan.nextLine();
        newManager.displayAvailableFlights(origin,destination);
        
        //getFlight method
        System.out.println();
        System.out.println("enter flight number");
        Scanner scan2 = new Scanner(System.in);
        int flightNumber = scan2.nextInt();
        newManager.getFlight(flightNumber);
        
        //bookSeat Method
        System.out.println("enter 'member' or 'nonmember'");
        String input = scan.nextLine();
        System.out.println("enter name");
        String name = scan.nextLine();
        System.out.println("enter age");
        int age = scan2.nextInt();
        
        if (input.equals("member") == true)
        {
            System.out.println("Enter membership length");
            int years = scan2.nextInt();
            newManager.bookSeat(flightNumber, new Member(name, age, years));
        }
        else if (input.equals("nonmember") == true)
        {
            newManager.bookSeat(flightNumber, new NonMember(name, age));
        }       
        
    }
}
