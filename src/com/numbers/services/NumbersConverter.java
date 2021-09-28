package com.numbers.services;

import com.numbers.numberUnits.NumberUnit;
import com.numbers.numberUnits.NumberUnitFactory;
import com.numbers.numberUnits.NumberUnitImplementation;

import java.util.ArrayList;

public class NumbersConverter {

    public ArrayList<NumberUnit> convertNumber(ArrayList<Double> numbersList){
        ArrayList<NumberUnit> numberUnitList = new ArrayList<NumberUnit>();
        NumberUnitFactory numberFactory = new NumberUnitImplementation();
        for(Double number:numbersList) {
            NumberUnit unit = numberFactory.numberUnitCreate(number);
            numberUnitList.add(unit);
        }
        return numberUnitList;
    }

}
