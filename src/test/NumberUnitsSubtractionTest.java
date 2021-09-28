package test;

import com.numbers.services.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberUnitsSubtractionTest {

    private NumberUnitsSubtraction subtraction = new NumberUnitsSubtraction();

    @Test
    public void subtractionTest(){
        NumbersReader reader = new NumbersReader();
        var fileData = reader.readFile();
        NumbersValidator validator = new NumbersValidator();
        var validatedData = validator.validateText(fileData);
        NumbersConverter converter = new NumbersConverter();
        var convertedNumbers = converter.convertNumber(validatedData);
        Assert.assertEquals(-812.5, subtraction.getSubtraction(convertedNumbers));
    }

}
