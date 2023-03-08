package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutSelect {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By country = By.id("Form_getForm_Country");
		By Options = By.xpath("//select[@id=\"Form_getForm_Country\"]/option");

		List<WebElement> OptionsList = driver.findElements(Options);
		System.out.println(OptionsList.size());

		for (WebElement e : OptionsList) {
			String Text = e.getText();
			if (Text.equals("India"))
				e.click();
			break;
		}

	}

}