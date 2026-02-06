package Selenium;

public class DiffFindElementAndFindElements {

    public static void main(String[] args) {

        /*

        findElement() Example:
        WebElement loginBtn = driver.findElement(By.id("login"));
        loginBtn.click();


        Use when you are sure the element exists
        If not found → NoSuchElementException

        findElements() Example:
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        Returns empty list if no elements are found
        No exception thrown

        | Feature              | `findElement()`                       | `findElements()`                        |
| -------------------- | ------------------------------------- | --------------------------------------- |
| Return type          | `WebElement`                          | `List<WebElement>`                      |
| Finds                | **Single element**                    | **Multiple elements**                   |
| If element not found | Throws `NoSuchElementException`       | Returns **empty list**                  |
| Usage                | When only **one element** is expected | When **multiple elements** are expected |
| Index access         | ❌ Not applicable                      | ✅ Can access using index                |
| Exception handling   | Mandatory                             | Not required                            |



         */
    }
}
