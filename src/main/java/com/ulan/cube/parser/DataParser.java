package com.ulan.cube.parser;

import com.ulan.cube.reader.DataReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataParser {
    private static final String DELIMITER = "\\s+";

    public List parseToOneData (String dataLine){
        dataLine=dataLine.trim();
        List oneData = Arrays.asList(dataLine.split(DELIMITER));
        return oneData;
    }
    public List parseToDoubleArray (String dataLine){
        DataParser parser = new DataParser();
        List strings =parser.parseToOneData(dataLine);
        List value = new ArrayList();

    }


}
