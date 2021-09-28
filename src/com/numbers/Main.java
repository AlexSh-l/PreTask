package com.numbers;

import com.numbers.services.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    public static void main(String[] args) {
        Logger logger = LogManager.getLogger();
        NumbersReader reader = new NumbersReader();
        var fileData = reader.readFile();
        NumbersValidator validator = new NumbersValidator();
        var validatedData = validator.validateText(fileData);
        NumbersConverter converter = new NumbersConverter();
        var convertedNumbers = converter.convertNumber(validatedData);
        NumberUnitsAddition addition = new NumberUnitsAddition();
        NumberUnitsSubtraction subtraction = new NumberUnitsSubtraction();
        NumberUnitsMultiplication multiplication = new NumberUnitsMultiplication();
        NumberUnitsDivision division = new NumberUnitsDivision();
        logger.info(addition.getSummary(convertedNumbers));
        logger.info(subtraction.getSubtraction(convertedNumbers));
        logger.info(multiplication.getMultiplication(convertedNumbers));
        logger.info(division.getDivision(convertedNumbers));
    }
}
