package com.company.icecream.addOn.abstracts;

import com.company.icecream.interfaces.IIceCream;

public abstract class AddOn implements IIceCream {
    protected IIceCream iceCream;
    public  AddOn(IIceCream iceCream){
        this.iceCream=iceCream;
    }
    public String description(){

        return iceCream.description();
    };
    public double cost(){
        return iceCream.cost();
    };

}
