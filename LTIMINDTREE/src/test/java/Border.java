import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Border {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor) driver ;
		js.executeScript("document.getElementsByClassName('sc-bxivhb dsDRlf')[0].style.border='2px red solid';");
		Thread.sleep(3000);
		JavascriptExecutor je=(JavascriptExecutor) driver ;
		je.executeScript("document.getElementsByClassName('sc-bxivhb dsDRlf')[0].style.background='yellow';");
	
	
		JavascriptExecutor d=(JavascriptExecutor) driver;
		d.executeScript("document.getElementsByClassName('sc-bxivhb dsDRlf')[0].setAttribute('style','border:5px blue solid;background:red');");
	
	
	}
	
	

}
