package com.company;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase3 {

    @BeforeClass
    public void accountLogin(){
        System.out.println("Account has been logged in");
    }

    @AfterClass
    public void accountLogOut(){
        System.out.println("Account has been logged out");
    }

    @Test
    public void updateProfile(){
        System.out.println("automation scenarios and test to be done");

    }
    @Test
    public void verifyBankBalance(){
        System.out.println("automation scenarios and test to be done");

    }


}
