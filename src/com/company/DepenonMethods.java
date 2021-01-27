package com.company;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DepenonMethods {
    @Test(groups = {"smoke"}, enabled = true)
    public void test1() {
        System.out.println("first method");
        Assert.assertEquals(11, 11);
    }

    @Test(dependsOnMethods = {"test1"}, groups = {"smoke"})
    public void dependingMethod() {
        System.out.println("print a message");
    }

    @Test(groups = {"smoke"}, enabled = true)
    public void test2() {
        System.out.println("second method");
        Assert.assertEquals(11, 11);

    }
}
