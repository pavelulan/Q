package com.ulan.cube.reader;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class DataReader {
    private static final Logger logger = LogManager.getLogger();

        public List<String> readDataToList (String filePath) {
            List < String > listOfData = new ArrayList<>();
            try (FileReader fr = new FileReader(filePath);
                 BufferedReader br = new BufferedReader(fr)){
                listOfData=br.lines().collect(Collectors.toList());
/*              String line;
                while((line = br.readLine()) != null){
                    listOfData.add(line);
                }*/
                } catch (IOException ex) {
                logger.log(Level.ERROR, "Input Output error with file:"+filePath, ex);
                //ex.printStackTrace();
                throw new RuntimeException("I/O Error ", ex);
            }
            return listOfData;
        }
    }

