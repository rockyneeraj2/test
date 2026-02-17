package org.example.CoreJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractClass {

    public static void main(String[] args) {

        //An abstract class is a class that:
        //Cannot be instantiated
        //Can have abstract methods (no body)
        //Can also have normal (concrete) methods
        //Can have constructors and variables
        //abstract method must be oveeride by first concerete class which inherit abstract class

        abstract class Animal {

            public abstract void sound();   // abstract method

            public void sleep() {           // concrete method
                System.out.println("Sleeping...");
            }
        }

        //Child class must implement abstract method:
       class Dog extends Animal {

            @Override
            public void sound() {
                System.out.println("Bark");
            }
        }

        //Why Use Abstract Class?
        //To define common structure
        //To enforce implementation rules
        //To provide partial implementation
        //To achieve runtime polymorphism

        //AbstractBaseTest
         abstract class AbstractBaseTest {

            protected WebDriver driver;

            public abstract void setup();   // Force child to implement

            public void tearDown() {
                driver.quit();
            }
        }

        //ChromeTest
        class ChromeTest extends AbstractBaseTest {

            @Override
            public void setup() {
                driver = new ChromeDriver();
            }
        }

        //Abstract Page Class in POM
        abstract class BasePage {

            protected WebDriver driver;

            public BasePage(WebDriver driver) {
                this.driver = driver;
            }

            public abstract boolean isPageLoaded();

            public void click(By locator) {
                driver.findElement(locator).click();
            }
        }

        //Now every page must implement:
         class LoginPage extends BasePage {

            public LoginPage(WebDriver driver) {
                super(driver);
            }

            @Override
            public boolean isPageLoaded() {
                return driver.getTitle().contains("Login");
            }
        }







    }
}
