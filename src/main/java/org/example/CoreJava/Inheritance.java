package org.example.CoreJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Inheritance {

    public static void main(String[] args) {
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

         class BaseTest {
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

         class LoginTest extends BaseTest {
         //   @Test
            public void testLogin() {
                driver.get("https://example.com");
            }
        }

        //Benefit:
        //Common methods (click, sendKeys, wait) in one place
        //Reduces duplication
        //Improves scalability



    }
}
