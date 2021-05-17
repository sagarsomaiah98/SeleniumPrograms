import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {
	
	//@Ignore
	@Test
	public void dynamic_webtables() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).clear();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a/i[@class='fa fa-shopping-cart fw']")).click();
		driver.findElement(By.xpath("//a[text()='Orders']")).click();
		int rows= driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tr")).size();
		
		String page_number=driver.findElement(By.xpath("//div[contains(text(),'Showing')]")).getText();
		System.out.println(page_number);
		int start=page_number.indexOf('(');
		int end= page_number.indexOf('P');
		
		int p_no=Integer.parseInt(page_number.substring(start+1, end-2));
		System.out.println(" actual page --"+p_no);
		System.out.println(" rows "+rows);
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//ul[@class='pagination']/li[3]/a")).click()
;		
		for ( int i=2;i<5;i++) {
			
			driver.findElement(By.xpath("//ul[@class='pagination']/li["+i+"]/a")).click();
		}
		
	}
		
		//driver.quit();
		
		
		
		
		
	}


