package com.numbers.services;

import com.numbers.numberUnits.NumberUnit;

import java.util.ArrayList;

public class NumberUnitsSubtraction {

    public Double getSubtraction(ArrayList<NumberUnit> numberUnits){
        Double subtraction = 0.0;
        for (NumberUnit unit:numberUnits){
            subtraction -= unit.numberValue;
        }
        return subtraction;
    }

}
