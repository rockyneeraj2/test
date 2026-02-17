package org.example.CoreJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodOverriging {
    public static void main(String[] args) {

        //Method Overriding = A child class provides its own implementation of a method that is already
        // defined in the parent class.
        //
        //👉 It is Runtime Polymorphism.

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

        //Method name must be same
        //Parameters must be same
        //Return type must be same (or covariant)
        //Access modifier cannot be more restrictive
        //Cannot override final, static, or private methods

        //BaseTest
         class BaseTest {
            public void setup() {
                System.out.println("Generic setup");
            }
        }

        //ChromeTest:
         class ChromeTest extends BaseTest {

            @Override
            public void setup() {
                WebDriver driver = new ChromeDriver();
                driver = new ChromeDriver();
            }
        }

        //FirefoxTest:
       class FirefoxTest extends BaseTest {

            @Override
            public void setup() {
                WebDriver driver = new ChromeDriver();
                driver = new FirefoxDriver();
            }
        }




    }
}
