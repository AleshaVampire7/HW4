package com.company.icecream.addOn;

import com.company.icecream.IceCream;
import com.company.icecream.addOn.abstracts.AddOn;
import com.company.icecream.interfaces.IIceCream;

public class Nuts extends AddOn {
    public Nuts(IIceCream iceCream) {
        super(iceCream);
        System.out.println("Adding Nuts.");
    }
    public String description(){

        return iceCream.description()+" Nuts, ";
    };
    public double cost(){
        return iceCream.cost()+1.25;
    };
}
