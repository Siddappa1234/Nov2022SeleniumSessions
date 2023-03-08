package seleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {
		String browserName = "Chrome";
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initDriver(browserName);
		brUtil.launchUrl("https://www.amazon.com");

		String actTitle = brUtil.getPageTitle();
		if (actTitle.contains("Amazon")) {
			System.out.println("title---PASS");
		} else {
			System.out.println("title --fail");
		}
		brUtil.quitBrowser();

	}

}
