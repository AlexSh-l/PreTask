package com.numbers.services;

import com.numbers.numberUnits.NumberUnit;

import java.util.ArrayList;

public class NumberUnitsMultiplication {

    public Double getMultiplication(ArrayList<NumberUnit> numberUnits){
        Double multiplication = 1.0;
        for (NumberUnit unit:numberUnits){
            multiplication *= unit.numberValue;
        }
        return multiplication;
    }

}
