package test;

import com.numbers.services.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberUnitsMultiplicationTest {

    private NumberUnitsMultiplication multiplication = new NumberUnitsMultiplication();

    @Test
    public void multiplicationTest(){
        NumbersReader reader = new NumbersReader();
        var fileData = reader.readFile();
        NumbersValidator validator = new NumbersValidator();
        var validatedData = validator.validateText(fileData);
        NumbersConverter converter = new NumbersConverter();
        var convertedNumbers = converter.convertNumber(validatedData);
        Assert.assertEquals(-8.1577574742982502E17, multiplication.getMultiplication(convertedNumbers));
    }

}
