package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonDataSetup {

    @BeforeSuite()
    public void dataSetup(){
        System.out.println("common data setup");
    }

    @AfterSuite()
    public void afterSetup(){
        System.out.println("common data cleanup");
    }


}
