package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> LangLinks = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));

		System.out.println(LangLinks);
		for (WebElement e : LangLinks) {
			String Text = e.getText();
			System.out.println(Text);
			if (Text.equals("ಕನ್ನಡ")) {
				e.click();
				break;
			}

		}

	}

}
