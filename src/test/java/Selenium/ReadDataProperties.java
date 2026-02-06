package Selenium;

public class ReadDataProperties {

    public static void main(String[] args) {

        /*

        Read Data from Properties File (Most Common)
When to use

URLs, browser name, credentials, environment configs

Example
Properties prop = new Properties();
FileInputStream fis = new FileInputStream("config.properties");
prop.load(fis);

String url = prop.getProperty("url");
String username = prop.getProperty("username");


✅ Used in almost every Selenium framework
         */
    }
}
