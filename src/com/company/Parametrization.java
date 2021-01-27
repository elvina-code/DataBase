package com.company;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization {

    @Test(groups = {"smoke"})
    @Parameters({"userName", "password"})


    public void test1(String user, String pass){
        System.out.println(user);
        System.out.println(pass);

        Assert.assertEquals(11,11);
    }
}
