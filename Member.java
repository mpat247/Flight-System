/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;


public class Member extends Passenger 
{
    //instance variables
    public int yearsOfMembership;
    
    public Member(String name, int age, int yearsOfMembership) {
        super(name, age);
        this.yearsOfMembership = yearsOfMembership;
    }

    
    
    @Override
    public double applyDiscount(double p)
    {
        if (yearsOfMembership > 5)
        {
            //50% discount
            p = p * 0.5;
            return p;
        }
        else if (yearsOfMembership > 1 && yearsOfMembership <= 5)
        {
            //10% discount
            p = p * 0.9;
            return p;
        }
        return p;
    }
}
