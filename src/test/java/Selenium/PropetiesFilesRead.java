package Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropetiesFilesRead {

    public static void main(String[] args) throws IOException {


                Properties prop = new Properties();

                FileInputStream fis = new FileInputStream("config.properties");

                prop.load(fis);

                System.out.println(prop.getProperty("browser"));
                System.out.println(prop.getProperty("baseUrl"));

                fis.close();
            }
        }

        //config.properties
       //browser=chrome
      //baseUrl=https://testapp.com
     //username=admin
    //password=admin123
    //timeout=10





