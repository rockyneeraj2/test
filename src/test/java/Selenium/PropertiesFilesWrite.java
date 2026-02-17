package Selenium;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFilesWrite {

    public static void main(String[] args) throws IOException {

        Properties prop = new Properties();

        prop.setProperty("browser", "chrome");
        prop.setProperty("baseUrl", "https://testapp.com");
        prop.setProperty("timeout", "10");

        FileOutputStream fos = new FileOutputStream("config.properties");

        prop.store(fos, "Test Configuration");

        fos.close();

        System.out.println("Properties file created successfully.");
    }
}

//It stores key-value pairs.
//browser=chrome
//baseUrl=https://testapp.com
//timeout=10
