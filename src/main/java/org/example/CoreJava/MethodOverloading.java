package org.example.CoreJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MethodOverloading {

    public static void main(String[] args) {

        //Method Overloading = Same method name + different parameters (type/number/order) in the same class.
        //Compile-time Polymorphism

        //benefit:
        //Provide flexibility
        //Reduce duplicate method names
        //Handle optional parameters
        //Improve readability
        //Create reusable utility methods

        //Overloaded click() Method (Selenium Framework)
        class BasePage {

            public void click(By locator) {
                WebDriver driver = new ChromeDriver();
                driver.findElement(locator).click();
            }

            void click(By locator, int timeout) {
                WebDriver driver = new ChromeDriver();
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
                wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
            }
        }

        MethodOverloading m = new MethodOverloading();
        m.login(12,"jj");


    }

    public void login(String user,String pwd){
        System.out.println("login succesffull using username and password");
    }

    public void login(int i,String pwd){
        System.out.println("login succesffull using phone no");
    }

    public void login(int i,int pwd){
        System.out.println("login succesffull using phone no");
    }

    //click() method is example of Method overloading:
    //click() method is example of Method overloading:
}
