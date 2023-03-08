package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAttribute {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		By links = By.tagName("a");
		By images = By.tagName("img");

//		List<WebElement>linksList=getElements(links);
//		
//		System.out.println("total links-->+linksList.size()");
//		
//		for(WebElement e:linksList)
//		{
//			String hrefval=e.getAttribute("href");
//			String linkText=e.getText();
//			System.out.println(hrefval+"--"+linkText);
//		}
//		
//		List<WebElement>imagesList=getElements(images);
//		System.out.println("total images:"+imagesList.size());
//		
//		for(WebElement e:imagesList)
//		{
//			String SrcVal=e.getAttribute("Src");
//			System.out.println(SrcVal);
//			
//		}
		getElementAttributes(images, "Src");
		getElementAttributes(links, "href");

	}

	public static void getElementAttributes(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		for (WebElement e : eleList) {
			String attrVal = e.getAttribute(attrName);
			System.out.println(attrVal);
		}
	}

	private static List<WebElement> getElements(By locator) {

		return driver.findElements(locator);
	}

}
