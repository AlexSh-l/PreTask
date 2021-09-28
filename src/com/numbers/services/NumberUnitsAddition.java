package com.numbers.services;

import com.numbers.numberUnits.NumberUnit;

import java.util.ArrayList;

public class NumberUnitsAddition {

    public Double getSummary(ArrayList<NumberUnit> numberUnits){
        Double summary = 0.0;
        for (NumberUnit unit:numberUnits){
            summary += unit.numberValue;
        }
        return summary;
    }

}
