package TestNG;

import org.testng.annotations.*;

public class annotations {

    @BeforeTest
    public void loginToApplication(){
        System.out.println("Login to Application");
    }

    @AfterTest
    public void loginFromApplication(){
        System.out.println("Login from Application");
    }

    @BeforeMethod
    public void connectToDB(){
        System.out.println("Connect to DB");
    }

    @AfterMethod
    public void disconnectToDB(){
        System.out.println("disConnect to DB");
    }

    @Test(priority = 1,description = "This is Login a Test")
    public void Test1(){
        System.out.println("This is Test1");
    }

    @Test(priority = 2,description = "This is Logout a Test")
    public void Test2(){
        System.out.println("This is  Test2");
    }
}
