package Selenium;

public class DiffCloseAndQuit {

    public static void main(String[] args) {

        /*

        | Feature              | `close()`                           | `quit()`                    |
| -------------------- | ----------------------------------- | --------------------------- |
| Closes               | **Current browser window** only     | **All browser windows**     |
| WebDriver session    | Session remains active              | Session is terminated       |
| Use case             | When multiple windows/tabs are open | End of test execution       |
| Grid / Parallel runs | ⚠ May cause session leak            | ✅ Safely releases resources |
| Recommended usage    | Rare                                | **Always preferred**        |

         */
    }
}
