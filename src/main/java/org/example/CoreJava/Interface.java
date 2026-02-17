package org.example.CoreJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interface {

    public static void main(String[] args) {

        //An interface is a blueprint of a class that contains:
        //Abstract methods (by default)
        //No object instantiation
        //Supports multiple inheritance
        //Used to define behavior, not implementation

         interface Animal {
            void sound();   // abstract method
        }

        //Implementation:

         class Dog implements Animal {

            @Override
            public void sound() {
                System.out.println("Bark");
            }
        }

        //Why Interface is Important?
        //Achieves 100% abstraction
        //Supports multiple inheritance
        //Defines contract
        //Improves loose coupling
        //Supports scalable design


        //1️⃣ Browser Strategy Pattern (Very Common in Framework)
        //Instead of using if-else for browsers:
        //if(browser.equals("chrome")) { ... }
        //else if(browser.equals("firefox")) { ... }
        //We use Interface.
        //Browser Interface
        interface BrowserFactory {
            WebDriver createDriver();
        }

        //Chrome Implementation
        class ChromeBrowser implements BrowserFactory {

            @Override
            public WebDriver createDriver() {
                return new ChromeDriver();
            }
        }



    }
}
