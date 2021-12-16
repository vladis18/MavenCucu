package practice;

import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException {
        String userName;
        String password;
        FileReader reader=new FileReader("C:\\TryAgain\\CucumberFrameworkVlad\\src\\test\\resources\\configs\\configuration.properties");
        Properties p=new Properties();
        p.load(reader);
        userName=p.getProperty("username");
        password=p.getProperty("password");
        System.out.println(p.getProperty("username"));
        System.out.println(p.getProperty("password"));
        //String myPassword = System.getProperty("C:\\TryAgain\\CucumberFrameworkVlad\\src\\test\\resources\\configs\\configuration.properties", "password");
//        String pass = "C:\\TryAgain\\CucumberFrameworkVlad\\src\\test\\resources\\configs\\configuration.properties";
//        String myPassword =System.getProperty("user.dir");
//        String CONFIGURATION_FILEPATH= System.getProperty("user.dir") +"\\src\\test\\resources\\configs\\configuration.properties";
//        System.out.println(myPassword);

    }
}
