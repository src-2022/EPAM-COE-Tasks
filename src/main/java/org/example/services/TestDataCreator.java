package org.example.services;

import org.example.model.Calculator;

import java.io.IOException;

public class TestDataCreator {
    private final String INSTANCE_FIELD = "testdata.value.NumberOfInstancesField";
    Calculator calculator;

    public Calculator getCalculatorData() throws IOException {

        System.out.println(TestDataReader.getTestData(INSTANCE_FIELD));
        calculator = new Calculator();
        calculator.setNumberOfInstancesField(TestDataReader.getTestData(INSTANCE_FIELD));
        // calculator.setInstancesField( PropertyReader.readProperty(INSTANCE_FIELD));
        return calculator;

    }
}
