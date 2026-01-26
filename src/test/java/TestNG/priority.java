package TestNG;

import org.testng.annotations.Test;

public class priority {

    @Test(priority = 1,description = "This is Login a Test")
    public void bloginTest(){
        System.out.println("This is Login b Test");
    }

    @Test(priority = 2,description = "This is Logout a Test")
    public void alogoutTest(){
        System.out.println("This is Logout a Test");
    }
}
