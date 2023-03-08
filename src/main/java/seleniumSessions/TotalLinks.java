package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		// find all links on the page
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		// print the total links count
		int linksCount = linksList.size();
		System.out.println("totallinks:" + linksCount);

		// print the text of each link
		// and avoid blank text
		// get totalblank links count--Assignment

		for (int i = 0; i < linksCount; i++) {
			String text = linksList.get(i).getText();
			if (text.length() > 0) {
				System.out.println(i + ":" + text);
			}
		}

		// For each
		int count = 0;
		for (WebElement e : linksList) {
			String text = e.getText();
			if (text.length() > 0) {
				System.out.println(count + ":" + text);
			}
			count++;

		}

	}

}
