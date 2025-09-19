package mockProject1;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class screenshotmock {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.selenium.dev/");
		
		
		WebElement ss= driver.findElement(By.xpath("//*[@id=\'Layer_1\']"));
		File mainfile= ss.getScreenshotAs(OutputType.FILE);
		File store = new File("C:\\Users\\Dell\\OneDrive\\Desktop\\Selenium Wrokspace\\mockProject\\Screenshot\\ss.png");
		mainfile.renameTo(store);
		
	}

}
