package com.company.icecream;

import com.company.icecream.addOn.Candies;
import com.company.icecream.addOn.Chocolate;
import com.company.icecream.addOn.Nuts;
import com.company.icecream.interfaces.IIceCream;

public class IcecreamMaker {
    public static void main(String[] args) {
        IIceCream iceCream=new Chocolate(new Nuts(new Candies(new IceCream())));
        
        System.out.println("Ingredients: "+iceCream.description()+" Milk.");
        System.out.println("Total cost: "+iceCream.cost());
    }
}
