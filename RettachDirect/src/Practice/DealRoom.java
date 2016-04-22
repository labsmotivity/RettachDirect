package Practice;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class DealRoom {
//	 public static Logger log;
//	 private static Logger Log = Logger.getLogger(Log.class.getName());
	 WebDriver driver;
	 public static final String USERNAME = "labsmotiv1";
	  public static final String AUTOMATE_KEY = "LksgxRzVsGpzPZsiVk5h";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
	  DesiredCapabilities caps;
	 @BeforeTest  
	  public void setUpDriver() {  
		caps = new DesiredCapabilities();
		caps.setCapability("browser", "Chrome");
caps.setCapability("browser_version", "49.0");
caps.setCapability("os", "Windows");
caps.setCapability("os_version", "7");
caps.setCapability("resolution", "1024x768");
		      
	  }  
	   
	 @Test  
	 public void start() throws Exception{  
		 driver = new RemoteWebDriver(new URL(URL), caps);
		 
		 driver.get("https://app.dealroom.co");
		 Thread.sleep(15000);
		 driver.manage().window().maximize();
		 Login();
		 searchcompany();
	 }
	 
	 public void Login()
	 {
		 Thread.sleep(15000);
		 driver.findElement(By.linkText("LOGIN")).click();
		 driver.findElement(By.name("username")).sendKeys("labsmotivity@gmail.com");
		 driver.findElement(By.name("password")).sendKeys("Qagood@123");
		 driver.findElement(By.xpath("//*[@id='app']/div/div[1]/div[2]/div/div/div/div[1]/form/button")).click();
		 
//		 Log.info("Login is successful");
	 }
	 
	 public void LinkCheck() throws Exception
	 {
		 driver.findElement(By.xpath("//*[@id='app']/div/div[1]/div[1]/ul[2]/li[1]/a")).click(); Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id='app']/div/div[1]/div[1]/ul[2]/li[2]/a")).click();Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id='app']/div/div[1]/div[1]/ul[2]/li[3]/a")).click();Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//*[@id='app']/div/div[1]/header/div[1]/div[2]/a")).click();Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id='app']/div/div[1]/header/div[1]/div[3]/a")).click();Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id='app']/div/div[1]/header/div[1]/div[4]/a")).click();Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id='app']/div/div[1]/header/div[1]/div[5]/a")).click();Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id='app']/div/div[1]/header/div[1]/div[6]/a")).click();Thread.sleep(3000);
	 }
	 
	 public void searchcompany()throws Exception
	 {
		 driver.findElement(By.xpath("//*[@id='app']/div/div[1]/div[2]/div/div/div[1]/div[1]/div/input")).sendKeys("keeptrax");
		 driver.findElement(By.xpath("//*[@id='app']/div/div[1]/div[2]/div/div/div[1]/div[1]/div/input")).sendKeys(Keys.ENTER);
		 
		 Thread.sleep(15000);
		 int n =driver.findElements(By.xpath("//*[@class='virtual-list table-list']")).size();
		 System.out.println("THe no of rows idendtified for the search company are: "+n);
		 
	 }
	@AfterSuite
	public void stop()	  
	{
//		driver.quit();
	}
	 
}