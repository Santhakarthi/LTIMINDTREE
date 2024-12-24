import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver ;
		js.executeScript("document.getElementById('twotabsearchtextbox').value='Samsung';");
		Thread.sleep(3000);
		JavascriptExecutor js1=(JavascriptExecutor) driver ;
		js1.executeScript("document.getElementsByTagName('input')[5].click();");
		
		
	}

}
