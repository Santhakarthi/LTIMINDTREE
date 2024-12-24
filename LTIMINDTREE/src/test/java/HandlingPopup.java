import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopup {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		
		//alert box
		
	System.out.println(	driver.findElement(By.xpath("//div[@id='output']")).getText());
	
	driver.findElement(By.xpath("//button[@id='alertBox']")).click();
System.out.println(driver.switchTo().alert().getText());
driver.switchTo().alert().accept();
System.out.println(	driver.findElement(By.xpath("//div[@id='output']")).getText());

//confirm box
	driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	System.out.println(	driver.findElement(By.xpath("//div[@id='output']")).getText());
	}

}
