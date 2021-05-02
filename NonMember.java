/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;


public class NonMember extends Passenger {

    public NonMember(String name, int age) {
        super(name, age);
    }
    
    @Override
    public double applyDiscount (double p)
    {
        //if passenger is above the age of 65, a 10% discount will be applied, otherwise there will be no discount
        if (age > 65)
        {
            p = p * 0.9;
            return p;
        }
        
        return p;
    }
}
