package may18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.nio.file.*;

import java.util.ArrayList;
import java.util.HashMap;

public class AutomateUsingArrayList {

    WebDriver driver=null;
    Path fileName = Path.of("/Users/mithunroy/Downloads/AutomationWorkspace/EDYODA_08Java/flipKart.txt");


    public static void main(String args[]) throws Exception{

        AutomateUsingArrayList obj = new AutomateUsingArrayList();
        obj.launch_Application();
        obj.capture_All_Links();
        obj.closeTheApplication();
    }


    public void launch_Application(){
        System.setProperty("webdriver.chrome.driver" , "/Users/mithunroy/Downloads/BrowserDrivers/chromedriver");
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");
    }

    public void capture_All_Links()throws Exception{

        // Get Total number of Links ..

        // Declare an ArrayList

        ArrayList<String> AllLinks = new ArrayList<String>();

        HashMap<Integer,String> LinksNameAsPerINdex = new HashMap<Integer, String>();

        int totalLinks = driver.findElements(By.xpath("//a")).size();
        for(int i = 1;i<=totalLinks;i++){
            String linkName = driver.findElement(By.xpath("(//a)["+i+"]")).getAttribute("href");
            System.out.println(linkName);
            AllLinks.add(linkName);
            LinksNameAsPerINdex.put(i,linkName);
        }
        //Files.writeString(fileName , AllLinks.toString());
        Files.writeString(fileName , LinksNameAsPerINdex.toString());
    }

    public void closeTheApplication(){
            driver.quit();
    }
}
