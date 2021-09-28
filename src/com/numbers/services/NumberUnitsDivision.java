package com.numbers.services;

import com.numbers.numberUnits.NumberUnit;

import java.util.ArrayList;

public class NumberUnitsDivision {

    public Double getDivision(ArrayList<NumberUnit> numberUnits){
        Double division = numberUnits.get(0).numberValue;
        boolean firstNumberCheck = false;
        for (NumberUnit unit:numberUnits){
            if((firstNumberCheck) && (unit.numberValue != 0.0)) {
                division /= unit.numberValue;
            }
            else {
                firstNumberCheck = true;
            }
        }
        return division;
    }

}
