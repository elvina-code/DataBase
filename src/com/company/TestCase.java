package com.company;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestCase {

    @BeforeSuite
    public void initializeTest(){
        System.out.println("started selenium webdriver and it opened the browser");
    }
    @Test(groups = {"smoke"})
    public void test1(){
        System.out.println("automation scenarios and test to be done");

    }
    @Test(groups = {"regression"})
    public void test2(){
        System.out.println("automation scenarios and test to be done");

    }

    @AfterSuite
    public void close(){
        System.out.println("close the browsers");
    }
}
