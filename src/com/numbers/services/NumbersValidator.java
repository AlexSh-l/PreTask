package com.numbers.services;

import com.numbers.constants.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumbersValidator {

    public ArrayList<Double> validateText(ArrayList<String> fileText){
        Logger logger = LogManager.getLogger();
        ArrayList<Double> list = new ArrayList<Double>();
        try {
            Pattern pattern = Pattern.compile(Constants.numberExpression);
            Matcher matcher;
            for (String line : fileText) {
                matcher = pattern.matcher(line);
                while (matcher.find()) {
                    String stringNumber = matcher.group();
                    Double doubleNumber = Double.parseDouble(stringNumber);
                    list.add(doubleNumber);
                }
            }
        }
        catch (NumberFormatException | NullPointerException numEx){
            logger.error(numEx.getMessage());
        }
        return list;
    }

}
