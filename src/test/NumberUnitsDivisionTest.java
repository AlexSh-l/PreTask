package test;

import com.numbers.services.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberUnitsDivisionTest {

    private NumberUnitsDivision division = new NumberUnitsDivision();

    @Test
    public void divisionTest() {
        NumbersReader reader = new NumbersReader();
        var fileData = reader.readFile();
        NumbersValidator validator = new NumbersValidator();
        var validatedData = validator.validateText(fileData);
        NumbersConverter converter = new NumbersConverter();
        var convertedNumbers = converter.convertNumber(validatedData);
        Assert.assertEquals(-1.1032443693447999E-17, division.getDivision(convertedNumbers));
    }
}
