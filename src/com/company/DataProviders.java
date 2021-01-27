package com.company;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

    @DataProvider(name = "loginTestData")
    public static Object[][] loginTestmethod() {

        return new Object [][]{
        {"Motorola", "100"},
//        {"adam@gmail.com", "123aada"},
//        {"nata@gmail.com", "123nat"}

    };
}

    @Test(dataProvider = "loginTestData", groups = {"smoke"})
    public void login(String name, String expected){
//        System.out.println("username: "  + name);
//        System.out.println("password: " + password);

//        another logic will search for the dealName

        String actualValue = "100";
        String expectedValue = expected;

        Assert.assertEquals(expectedValue, actualValue);

    }
}
