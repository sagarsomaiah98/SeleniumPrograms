
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Check_Broken_Links {
	
	
	
	@Test
 public void check_links() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
     WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
	 
	List<WebElement> links= driver.findElements(By.tagName("a"));
	
	int total_links= links.size();
	
	System.out.println("total link in web page = "+total_links);
	int broken=0;
	
	for( int i=0;i<total_links;i++) {
		
		String url=links.get(i).getAttribute("href");
		
		if(url==null || url.isEmpty())
		
		
			continue;
		
		
		URL link= new URL(url);
		try {
		
		HttpURLConnection httpconn= (HttpURLConnection)link.openConnection();
		httpconn.connect();
	
		
		if(httpconn.getResponseCode()>=400) {
			System.out.println(httpconn.getResponseCode()+" - "   +httpconn.getURL()+" - Broken link ");
			broken++;
		}
		
		}
		catch(Exception e) {}
	}
	System.out.println(" total broken links - "+broken);
	driver.quit();
 }

}
