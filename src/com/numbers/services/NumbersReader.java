package com.numbers.services;

import com.numbers.constants.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class NumbersReader {

    public ArrayList<String> readFile(){
        Logger logger = LogManager.getLogger();
        ArrayList<String> fileText = new ArrayList<String>();
        try(BufferedReader fileReader = new BufferedReader(new FileReader(Constants.filePath)))
        {
            String fileLine;
            while((fileLine=fileReader.readLine())!=null){
                fileText.add(fileLine);
            }
        }
        catch(IOException ex){
            logger.error(ex.getMessage());
        }
        return fileText;
    }
}
