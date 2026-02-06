package Selenium;

public class FileUpload {

    public static void main(String[] args) {

        /*

        HTML
<input type="file" id="uploadFile">

Selenium Code
driver.findElement(By.id("uploadFile"))
      .sendKeys("C:\\Users\\Neeraj\\Documents\\testfile.pdf");


✔ Works only if element is type="file"
✔ No need to click upload button unless required


Selenium does not handle Windows/macOS file dialogs. It directly sets the file path


🔹 Upload + Submit Example
driver.findElement(By.id("uploadFile"))
      .sendKeys("C:\\files\\resume.pdf");

driver.findElement(By.id("submit")).click();


🔹 What If Upload Button Is Hidden?

Use JavaScript Executor:

JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].style.display='block';",
    driver.findElement(By.id("uploadFile")));

driver.findElement(By.id("uploadFile"))
      .sendKeys("C:\\files\\resume.pdf");

         */
    }
}
