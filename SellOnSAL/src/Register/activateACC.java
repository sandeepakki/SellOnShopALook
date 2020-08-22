package Register;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class activateACC {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String browser="Chrome";
		if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		driver.get("http://sportalook.cstechns.com/");
		String main=driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Sell On SportALook')]")).click();
		driver.navigate().to("http://sellersportalook.cstechns.com/register");
		driver.switchTo().window(main);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("right_txtname")).sendKeys("Sandeep A.S.K");
		driver.findElement(By.id("right_txtemailid")).sendKeys("sandeepakkic2@gmail.com");
		driver.findElement(By.id("right_txtpwd")).sendKeys("Xyz@123");
		driver.findElement(By.id("right_txtcpwd")).sendKeys("Xyz@123");
		driver.findElement(By.id("right_txtcontact")).sendKeys("09912478798");
		driver.findElement(By.id("Agree")).click();	
		driver.findElement(By.xpath("//input[@value='REGISTER']")).click();
		driver.findElement(By.xpath("//button[@class='confirm']")).click();
		
		
		Thread.sleep(1000);
		driver.get(" http://sellersportalook.cstechns.com/SupplierRegistration/3C889F0A-1061-4C45-A7BA-C6A90AD4F801");
		driver.findElement(By.name("txtcompanyname")).sendKeys("ABC");
		driver.findElement(By.name("txtdisplayname")).sendKeys("ABC.");
		driver.findElement(By.name("txtship_address")).sendKeys("P.NO:11-1-109 Laxmi Nagar");
		driver.findElement(By.name("txtship_landmark")).sendKeys("Near Ayyappa temple");
		driver.findElement(By.name("txtpinsupplier")).sendKeys("500035"+Keys.ENTER);
		
		Thread.sleep(5000);
		
		WebElement w1=driver.findElement(By.id("txtbusinesstype"));
		Select s1=new Select(w1);
		s1.selectByVisibleText("Sole Proprietor");
		driver.findElement(By.name("txtpassportno")).sendKeys("CDIN1234");
		driver.findElement(By.name("txtaboutus")).sendKeys("Leading Website Designer");
		driver.findElement(By.name("txtbuisnessdescription")).sendKeys("End to End Client service.");
		 Thread.sleep(5000);
		 
		 driver.findElement(By.name("txtbankaccount")).sendKeys("2013045987");
		 driver.findElement(By.name("txtBeneficiary")).sendKeys("Sandeep");
		 driver.findElement(By.name("txtbankname")).sendKeys("RBI");
		 driver.findElement(By.name("txtbranch")).sendKeys("Mumbai");
		 driver.findElement(By.name("txtifsc")).sendKeys("RBI0011999");
		 driver.findElement(By.linkText("NEXT STEP")).click();
		 driver.findElement(By.xpath("//button[@class='confirm']")).click();
		 driver.findElement(By.linkText("NEXT STEP")).click();
		 driver.findElement(By.xpath("//button[@class='confirm']")).click();
		 
		 
		 Thread.sleep(10000);
		 
		 driver.findElement(By.id("filetopancard")).sendKeys("C:\\Users\\USER\\Documents\\Upload.pdf");
		 Thread.sleep(5000);
		 driver.findElement(By.id("filetocst")).sendKeys("C:\\Users\\USER\\Documents\\Upload.pdf");
		 Thread.sleep(5000);
		 driver.findElement(By.id("filetocancelcheque")).sendKeys("C:\\Users\\USER\\Documents\\Upload.pdf");
		 Thread.sleep(5000);
		 driver.findElement(By.id("filetologo")).sendKeys("C:\\Users\\USER\\Documents\\Upload.pdf");
		 Thread.sleep(5000);
		 driver.findElement(By.id("filetologoBN")).sendKeys("C:\\Users\\USER\\Documents\\Upload.jpg");
		 Thread.sleep(5000);
		 driver.findElement(By.id("filetosignature")).sendKeys("C:\\Users\\USER\\Documents\\File1.jpg");
		 Thread.sleep(10000);
		 driver.findElement(By.linkText("SUBMIT")).click(); 
		 driver.findElement(By.xpath("//button[@class='confirm']")).click();
		 driver.findElement(By.linkText("SUBMIT")).click(); 
		 driver.findElement(By.xpath("//button[@class='confirm']")).click();
		 Thread.sleep(1000);
		 WebElement w2= driver.findElement(By.id("ddlbrandname"));
		 Select s2=new Select(w2);
		 s2.deselectByVisibleText("Brakefree");
		 driver.findElement(By.name("filetobrand")).sendKeys("C:\\Users\\USER\\Documents\\File1.jpg");
		 
		 driver.findElement(By.linkText("Add Brand")).click();
		 
		 driver.findElement(By.xpath("//button[@class='confirm']")).click();
driver.findElement(By.linkText("Add Brand")).click();
		 
		 driver.findElement(By.xpath("//button[@class='confirm']")).click();
		 driver.findElement(By.id("btnsave")).click();
		 
		 driver.findElement(By.xpath("//button[@class='confirm']")).click();
		 
		 driver.close();

	}

}
