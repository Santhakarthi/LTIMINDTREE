import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver ;
		js.executeScript("document.getElementsByTagName('span')[3].click();");
		
		
 
	}

}
