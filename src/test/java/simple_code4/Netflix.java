package simple_code4;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Netflix {
	public static WebDriver driver;
	

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String actualCurrentUrl = "https://www.netflix.com/";
	    String expectedCurrentUrl= driver.getCurrentUrl();
	    String actualTitle="Netflix - Watch TV Shows Online, Watch Movies Online";
	    String expectedTitle= driver.getTitle();
	    
	    
	    if (actualCurrentUrl.equals(expectedCurrentUrl)&&actualTitle.equals(expectedTitle)) {
	    	System.out.println("My Url is Correct");
	    }else {
	    	System.out.println("My Url is Incorrect");
	    }
		

	}

}
