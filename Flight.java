/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Manav Patel - 500967756
 */
public class Flight 
{
    //initializing instance variables
    private String origin;
    private int flightNumber;
    private double originalPrice;
    private int numberOfSeatsLeft;
    private int capacity;
    private String departureTime;
    private String destination;
    
    public Flight(int flightNumber, String origin, String destination, String departureTime, int capacity, double originalPrice)
    {
        //throw exception if the origin and destination entered are the same
        if (origin.equals(destination) == true)
            {
                throw new IllegalArgumentException("The origin entered and the destination entered are the same.");
            }
        
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.capacity = capacity;
        this.originalPrice = originalPrice;
        this.numberOfSeatsLeft = capacity;

    }
    
    //if the numberOfSeatsLeft is greater than 0, this method decrements the numberOfSeats variable and returns true, otherwise it returns false
    public boolean bookASeat()
    {
        if (numberOfSeatsLeft < 0 || numberOfSeatsLeft == 0)
        {
            return false;
        }
        numberOfSeatsLeft = numberOfSeatsLeft - 1;
        return true;
    }
    
    //getter flightNumber
    public int getFlightNumber()
    {
        return flightNumber;
    }
    
    //getter Origin
    public String getOrigin()
    {
        return origin;
    }
    
    //getter destination
    public String getDestination()
    {
        return destination;
    }
    
    //getter departureTime
    public String getDepartureTime()
    {
        return departureTime;
    }
    
    //getter capacity
    public int getCapacity()
    {
        return capacity;
    }
    
    //getter numberOfSeatsLeft
    public int getNumberOfSeatsLeft()
    {
        return numberOfSeatsLeft;
    }
    
    //getter originalPrice
    public double getOriginalPrice()
    {
        return originalPrice;
    }
    
    //setter flightNumber
    public void setFlightNumber(int flightNumber)
    {
        this.flightNumber = flightNumber;
    }
    
    //setter origin
    public void setOrigin(String origin)
    {
        this.origin = origin;
    }
    
    //setter destination
    public void setDestination(String destination)
    {
        this.destination = destination;
    }
    
    //setter departureTime
    public void setDepartureTime(String departureTime)
    {
        this.departureTime = departureTime;
    }
    
    //setter capacity
    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }
    
    //setter numberOfSeatsLeft
    public void setNumberOfSeatsLeft(int numberOfSeatsLeft)
    {
        this.numberOfSeatsLeft = numberOfSeatsLeft;
    }
    
    //setter originalPrice
    public void setOriginalPrice(double originalPrice)
    {
        this.originalPrice = originalPrice;
    }
    
    //overrides toString method and returns String representation of a Flight Object
    //Flight Number, origin, destination, departure time, and original price
    @Override
    public String toString()
    {
        //info about flight printed out
      //  String info = "Flight: " + flightNumber + ", " + origin + " to " + destination + ", " + departureTime + ", original Price: " + originalPrice + "$";
        return ("Flight: " + flightNumber + ", " + origin + " to " + destination + ", " + departureTime + ", original Price: " + originalPrice + "$");
    }
    
    
}