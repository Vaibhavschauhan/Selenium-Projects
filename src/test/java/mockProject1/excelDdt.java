package mockProject1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class excelDdt {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\OneDrive\\Desktop\\Selenium Wrokspace\\mockProject\\src\\test\\resources\\testdatamock.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String un = wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		String pwd = wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		
		wb.close();
		
		WebElement USERNAME =driver.findElement(By.name("username"));
		USERNAME.sendKeys(un);
		
		WebElement PASSWORD =driver.findElement(By.name("password"));
		PASSWORD.sendKeys(pwd);
		
		driver.findElement(By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div.oxd-form-actions.orangehrm-login-action > button")).click();
	}

}
