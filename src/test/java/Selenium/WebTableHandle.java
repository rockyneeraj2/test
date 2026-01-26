package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTableHandle {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");

        //1.get the no of rows
        //2.get the no of columns
        //3.iterate through rows and columns to get the text and print

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']//tr"));
        System.out.println("no of rows: " + rows.size());

        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='resultTable']//tr/th"));
        System.out.println("no of columns: " + columns.size());

        for(int i=1;i<rows.size();i++){
            for(int j=1;j<=columns.size();j++){
                String cellText = driver.findElement(By.xpath("//table[@id='resultTable']//tr["+i+"]/td["+j+"]")).getText();
                System.out.print(cellText + " | ");
            }
            System.out.println();
        }
    }
}
