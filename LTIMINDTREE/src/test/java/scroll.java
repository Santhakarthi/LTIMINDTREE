import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/");
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor) driver ;
		js.executeScript("window.scrollTo(0,500);");
		Thread.sleep(3000);
		JavascriptExecutor js1=(JavascriptExecutor) driver ;
		js1.executeScript("window.scrollBy(0,500);");
		Thread.sleep(3000);
		JavascriptExecutor js2=(JavascriptExecutor) driver ;
		js2.executeScript("document.getElementById('ty_footer').scrollIntoView();");
		
		
		
	}

}
