import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class JS_Ex {
	
	@Test
	public void js_executor() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		
		//DRAW BORDER
		
		WebElement ele= driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
		js.executeScript("arguments[0].style.border='3px solid red'",ele);
	Thread.sleep(3000);
		//Get title
		
		String title=js.executeScript("return document.title;").toString();
		System.out.println("Title of page --"+title);
		Thread.sleep(3000);
		//flash
		
		
		js.executeScript("arguments[0].style.backgroundColor='#000000'", ele);
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].style.backgroundColor='#DE3163'", ele);
		
		Thread.sleep(3000);
		
		//click element
		
		js.executeScript("arguments[0].click();", ele);
		
		Thread.sleep(2000);
		// Refresh browser
		js.executeScript("history.go(0)");
		Thread.sleep(2000);
		
		//scrolling 
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		Thread.sleep(2000);
		
		//Zoom page
		
		js.executeScript("document.body.style.zoom='50%'");
		Thread.sleep(2000);
		
		
		//display alert
		
		js.executeScript( "alert('alert using js ')");
		//js.executeScript("alert('I am an alert box!')");
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
	}

}
