package Selenium;

public class WaitsTypes {
    public static void main(String[] args) {

        // waits in selenium
        //1. wait commands in slenium direct test script to pause the
        // execution for certain time before throwing element not visible exception
        // There are 3 types of waits in selenium
        // a. Implicit wait
        // b. Explicit wait
        // c. Fluent wait

        // Implicit Wait :
        //implicit wait tells the WebDriver maximum wait time when searching for an element before throwing exception
        //Implicit wait is global wait , it is applicable to all the Webelement in the script
        //Since implicit wait applies to all the elements you do dont specify the expected condition

        //Explcit Wait:
        //Explicit wait tells the WebDriver to halt the execution until the particular condition is met or maximum time passed
        //Explicit wait is applicable only to those Webelement which are specified in the users
        //Explicit wait requires the expected condition to be specified for the element like "wait until element is clickable"

        //Fluent Wait:
        //Fluent wait tells the WebDriver maximum wait time when searching for an element before throwing exception
        //Flucent wait looks for a WebElement repeadtedly at regular intervals until the object is found
        //With Fluent wait , it is possible to set a default polling period as needed
        //ypu can configure the wait to ignore any exceptions during the polling period
    }
}
