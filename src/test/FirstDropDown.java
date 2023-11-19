package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://trytestingthis.netlify.app/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement dropdown = driver.findElement(By.id("option"));
        Select selectobject = new Select(dropdown);
        
        selectobject.selectByIndex(1);
        
        Thread.sleep(2000);
        driver.quit();
        
        System.out.println("Done");
       
        
        

	}

}
