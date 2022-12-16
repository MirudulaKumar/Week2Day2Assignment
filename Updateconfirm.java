package week2Day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Updateconfirm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//a[text()='10406']")).click();
		
		String Title=driver.getTitle();
		System.out.println(Title);
		driver.findElement(By.linkText("Edit")).click();
		
		WebElement name=driver.findElement(By.name("companyName"));
		name.clear();
		name.sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		WebElement update=driver.findElement(By.id("viewLead_companyName_sp"));
		update.getText();
		System.out.println(update.getText());
		
		driver.close();
		
		
		
		
		
		
		

	}

}
