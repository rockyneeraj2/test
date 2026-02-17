package org.example.CoreJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OOPS_uses_in_Framework {

    public static void main(String[] args) {

        //Encapsulation:
        //Binding data + methods together and restricting direct access using private variables and public
        // methods.

         class LoginPage {

            private WebDriver driver;
            private By username = By.id("user");

            public LoginPage(WebDriver driver) {
                this.driver = driver;
            }

            public void enterUsername(String user) {
                driver.findElement(username).sendKeys(user);
            }
        }

        //Benefit:
        //Locators are private
        //Test classes cannot directly access locators
        //Changes in locator don’t impact test class
        //Improves maintainability

        //2.Abstraction:
        //Hiding implementation details and showing only essential behavior.

         abstract class BaseTest {

            protected WebDriver driver;

            public abstract void setup();

            public void tearDown() {
                driver.quit();
            }
        }

        //child class:
         class ChromeTest extends BaseTest {

            @Override
            public void setup() {
                driver = new ChromeDriver();
            }
        }

        //Benefit:
        //Common structure enforced
        //Browser-specific logic abstracted
        //Clean architecture


        // Inheritance is an OOP concept where one class (child/subclass) acquires the properties and behavior
        // (variables + methods) of another class (parent/superclass).
        //
        //It promotes code reusability, maintainability, and extensibility.

        class Parent {
            void display() {
                System.out.println("Parent class method");
            }
        }

        class Child extends Parent {
            void show() {
                System.out.println("Child class method");
            }
        }

        //Now Child can use both display() and show() methods.
        //Types of Inheritance in Java
        //Single Inheritance
        //Multilevel Inheritance
        //Hierarchical Inheritance
        //Multiple Inheritance (via Interfaces only)
        //Java does not support multiple inheritance with classes (to avoid diamond problem),
        // but supports it using interfaces.

        class BaseTest1 {
            WebDriver driver;

            //  @BeforeMethod
            public void setup() {
                driver = new ChromeDriver();
            }

            //  @AfterMethod
            public void tearDown() {
                driver.quit();
            }
        }

        class LoginTest extends BaseTest1 {
            //   @Test
            public void testLogin() {
                driver.get("https://example.com");
            }
        }

        //Benefit:
        //Common methods (click, sendKeys, wait) in one place
        //Reduces duplication
        //Improves scalability


        //One interface, multiple implementations.
        //Polymorphism

        class BasePage {
            public void click() {
                System.out.println("Normal click");
            }
        }

         class JSPage extends BasePage {
            @Override
            public void click() {
                System.out.println("JavaScript click");
            }
        }






    }
}
