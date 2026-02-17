package org.example.CoreJava;

import org.openqa.selenium.WebDriver;

public class Super {

    public static void main(String[] args) {
        //super is used to refer to the immediate parent class object.
        //It is mainly used to:
        //Access parent class variable
        //Call parent class method
        //Call parent class constructor

        //1️⃣ Using super to Access Parent Variable
        class Parent {
            String name = "Parent Class";
        }

        class Child extends Parent {
            String name = "Child Class";

            void display() {
                System.out.println(super.name);   // Parent variable
                System.out.println(this.name);    // Child variable
            }
        }

        //✅ Why?
        //When parent and child have same variable name.

        //2️⃣ Using super to Call Parent Method
        class BasePage {

            public void click() {
                System.out.println("Normal Click");
            }
        }

        class LoginPage extends BasePage {

            @Override
            public void click() {
                super.click();   // calling parent method
                System.out.println("Logging click action");
            }
        }


        //framework uses:
        //3️⃣ Using super() to Call Parent Constructor
        class BasePage1 {

            WebDriver driver;

            public BasePage1(WebDriver driver) {
                this.driver = driver;
            }
        }

        class LoginPage1 extends BasePage1 {

            public LoginPage1(WebDriver driver) {
                super(driver);   // Calling parent constructor
            }
        }

        //🔹 BaseTest

         class BaseTest {

            protected WebDriver driver;

            public BaseTest(WebDriver driver) {
                this.driver = driver;
            }
        }

        //LoginTest
        class LoginTest extends BaseTest {

            public LoginTest(WebDriver driver) {
                super(driver);
            }
        }




    }
}
