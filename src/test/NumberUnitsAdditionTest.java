package test;

import com.numbers.services.NumberUnitsAddition;
import com.numbers.services.NumbersConverter;
import com.numbers.services.NumbersReader;
import com.numbers.services.NumbersValidator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberUnitsAdditionTest {

    private NumberUnitsAddition addition = new NumberUnitsAddition();

    @Test
    public void additionTest(){
        NumbersReader reader = new NumbersReader();
        var fileData = reader.readFile();
        NumbersValidator validator = new NumbersValidator();
        var validatedData = validator.validateText(fileData);
        NumbersConverter converter = new NumbersConverter();
        var convertedNumbers = converter.convertNumber(validatedData);
        Assert.assertEquals(812.5, addition.getSummary(convertedNumbers));
    }
}
