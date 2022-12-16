package week2Day2Assignment;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Manoj");
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		driver.findElement(By.name("reg_email__")).sendKeys("9600756464");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Riyan@06");
		
		WebElement day=driver.findElement(By.id("day"));
		Select dd=new Select(day);
		dd.selectByIndex(22);
		WebElement month=driver.findElement(By.name("birthday_month"));
		Select mm=new Select(month);
		mm.selectByValue("1");
		WebElement year=driver.findElement(By.name("birthday_year"));
		Select yy=new Select(year);
		yy.selectByVisibleText("1989");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		//driver.findElement(By.className("Male")).click();
		//WebElement gender=driver.findElement(By.id("u_1m_5_Vz"));
		//gender.click();		
		
		driver.findElement(By.name("websubmit")).click();
		
		
		
		
		
		

	}

}
