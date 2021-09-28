package com.numbers.numberUnits;

public class NumberUnitImplementation extends NumberUnitFactory {
    @Override
    public NumberUnit numberUnitCreate(Double numberValue){
        return new NumberUnit(numberValue);
    }
}
