package org.example.services;

import org.example.constants.Env;
import org.example.model.Calculator;

import java.util.*;
import java.io.*;
public class CalculatorModelCreator {
    public CalculatorModelCreator(){}
Calculator calculator;
        public static String readProperty(String key, String file) throws Exception{
            FileReader reader=new FileReader(file);
            Properties p=new Properties();
            p.load(reader);
            return p.getProperty(key);
        }

        public Calculator Model() throws Exception {
            calculator=new Calculator();
            calculator.setNumberOfInstancesField(readProperty("testdata.value.NumberOfInstancesField", Env.DEV_ENV));
            calculator.setSelectMachineType(readProperty("testdata.value.selectMachineType",Env.DEV_ENV));
            return calculator;
        }
    }
