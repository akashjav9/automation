package Hotel_adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hoteladactin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		 driver.get("https://adactinhotelapp.com/");
		
	// login invalid username and valid password  1
		driver.findElement(By.id("username")).sendKeys("tqakash123");
		driver.findElement(By.id("password")).sendKeys("tquser1234");
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		// login valid username and invalid password  2
		 
		driver.findElement(By.id("username")).sendKeys("tquser123");
		driver.findElement(By.id("password")).sendKeys("takash1234");
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		
		// login invalid username and password   3
		driver.findElement(By.id("username")).sendKeys("tdff123");
		driver.findElement(By.id("password")).sendKeys("takash1234");
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		
		// login valid page   4
	            
		driver.findElement(By.id("username")).sendKeys("tquser123");
		driver.findElement(By.id("password")).sendKeys("tquser1234");
		driver.findElement(By.id("login")).click();
		
		
		   // change password
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[3]")).click();  // click on change password
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[5]/td[2]/label/input")).sendKeys("tquser1234");// current password
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[6]/td[2]/label/input")).sendKeys("akashjav9"); // new password
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[7]/td[2]/label/input")).sendKeys("akashjav9");  // confirm password
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[8]/td[2]/input")).click();  // click on submit
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")).click();  // click on logout
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[1]/table/tbody/tr/td/a")).click();  // click on login again
		driver.findElement(By.id("username")).sendKeys("tquser123");
		driver.findElement(By.id("password")).sendKeys("akashjav9");
		driver.findElement(By.id("login")).click();
		
		   //5
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[2]/td[2]/select")).sendKeys("london");
		driver.findElement(By.id("hotels")).sendKeys("Hotel Creek");
		driver.findElement(By.id("room_type")).sendKeys("Standard");
		driver.findElement(By.id("room_nos")).sendKeys("1-One");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[6]/td[2]/input")).sendKeys("22/09/2021");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[7]/td[2]/input")).sendKeys("25/09/2021");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[8]/td[2]/select")).sendKeys("2-Two");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[10]/td[2]/input[1]")).click();// search
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[3]/td/input[2]")).click();// cancel
		  //6
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[2]/td[2]/select")).sendKeys("london");
		driver.findElement(By.id("hotels")).sendKeys("Hotel Creek");
		driver.findElement(By.id("room_type")).sendKeys("Standard");
		driver.findElement(By.id("room_nos")).sendKeys("1-One");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[6]/td[2]/input")).sendKeys("22/09/2021");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[7]/td[2]/input")).sendKeys("25/09/2021");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[8]/td[2]/select")).sendKeys("5-Five");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[10]/td[2]/input[1]")).click();// search
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[3]/td/input[2]")).click();// cancel
		
		//7
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[2]/td[2]/select")).sendKeys("london");
		driver.findElement(By.id("hotels")).sendKeys("Hotel Creek");
		driver.findElement(By.id("room_type")).sendKeys("Standard");
		driver.findElement(By.id("room_nos")).sendKeys("1-One");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[6]/td[2]/input")).sendKeys("22/09/2021");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[7]/td[2]/input")).sendKeys("25/09/2021");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[8]/td[2]/select")).sendKeys("1-One");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[10]/td[2]/input[1]")).click();// search
		//8
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();  //continue
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/input[1]")).click();//  select button
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[3]/td/input[1]")).click();
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[12]/td[2]/input")).sendKeys("mahesh");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[13]/td[2]/input")).sendKeys("Javalekar");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[14]/td[2]/textarea")).sendKeys("303,Akash Building hadapsar");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[15]/td[2]/input")).sendKeys("1234567845694569");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[16]/td[2]/select")).sendKeys("Master Card");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[17]/td[2]/select[1]")).sendKeys("March");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[17]/td[2]/select[2]")).sendKeys("2021");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[18]/td[2]/input")).sendKeys("897");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[19]/td[2]/input[1]")).click();  // book now 
		
		
	  driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")).click();  // logout
		
		
	}
}
