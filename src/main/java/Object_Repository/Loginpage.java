package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username")
	private WebElement un;
	
	public WebElement getUn() {
		return un;
	}

	public WebElement getPwd() {
		return pwd;
	}

	@FindBy(name = "password")
	private WebElement pwd;

}
