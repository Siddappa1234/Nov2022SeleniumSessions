package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Naveen AutomationLabs");
		Thread.sleep(3000);

		By googlesuggListlocator = By.xpath("/li[@role='presentation']//div[@class='wM6W7d']/span");
		dosearch(googlesuggListlocator, " Naveen AutomationLabs GitHub");

	}

	public static void dosearch(By suggListlocator, String SuggName) {

		List<WebElement> SuggList = driver.findElements(suggListlocator);

		System.out.println(SuggList.size());
		for (WebElement e : SuggList) {
			String Text = e.getText();
			if (Text.length() > 0) {
				System.out.println(Text);
			}
			if (Text.contains(SuggName)) {
				e.click();
			}
		}

	}
}
