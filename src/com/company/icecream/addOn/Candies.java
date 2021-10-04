package com.company.icecream.addOn;

import com.company.icecream.IceCream;
import com.company.icecream.addOn.abstracts.AddOn;
import com.company.icecream.interfaces.IIceCream;

public class Candies extends AddOn {
    public Candies(IIceCream iceCream) {
        super(iceCream);
        System.out.println("Adding candies.");
    }
    public String description(){

        return iceCream.description()+" Candies, ";
    };
    public double cost(){
        return iceCream.cost()+0.85;
    };
}
