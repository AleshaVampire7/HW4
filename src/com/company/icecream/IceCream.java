package com.company.icecream;

import com.company.icecream.interfaces.IIceCream;

public class IceCream implements IIceCream {
    @Override
    public String description() {
        return "SimpleIceCream";
    }

    @Override
    public double cost() {
        return 4.0;
    }
}
