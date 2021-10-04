package com.company.icecream.addOn;

import com.company.icecream.IceCream;
import com.company.icecream.addOn.abstracts.AddOn;
import com.company.icecream.interfaces.IIceCream;

public class Chocolate extends AddOn {
    public Chocolate(IIceCream iceCream) {
        super(iceCream);
        System.out.println("Adding Chocolate.");
    }


    public String description(){

        return iceCream.description()+" Chocolate,";
    };
    public double cost(){
        return iceCream.cost()+1.0;
    };
}
