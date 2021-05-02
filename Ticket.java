/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Manav
 */
public class Ticket 
{
    //instance variables
    private Passenger passenger;
    private Flight flight;
    private double price;
    private int number;
    //ticketNumber count starts at 0
    private static int ticketNumber = 0;
    
    Ticket(Passenger p, Flight flight, double price)
    {
        this.passenger = p;
        this.flight = flight;
        this.price = price;
        ticketNumber++;
        number = ticketNumber;
    }
       
    //getters and setters
    public Passenger getPassenger() 
    {
        return passenger;
    }

    public void setPassenger(Passenger passenger) 
    {
        this.passenger = passenger;
    }

    public Flight getFlight() 
    {
        return flight;
    }

    public void setFlight(Flight flight) 
    {
        this.flight = flight;
    }

    public double getPrice() 
    {
        return price;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }

    public int getNumber() 
    {
        return number;
    }

    public void setNumber(int number) 
    {
        this.number = number;
    }

    public static int getTicketNumber() 
    {
        return ticketNumber;
    }

    public static void setTicketNumber(int tN) 
    {
        Ticket.ticketNumber = tN;
    }
    
    @Override
    public String toString()
    {
        //overrides toString() method to return String representation of a Ticket object
        return (passenger.getName() + "Flight " + flight.getFlightNumber() + ", " + flight.getOrigin() + "to "+ flight.getDestination() + ", " 
               + flight.getDepartureTime() + ", original price: " + flight.getOriginalPrice() + "$, ticket price: " + this.price);
    }
    
}
