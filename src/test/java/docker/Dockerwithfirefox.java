package docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Dockerwithfirefox {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc= DesiredCapabilities.firefox();
		
		URL url= new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver=	new RemoteWebDriver(url,dc);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String titleString=driver.getTitle();
		System.out.println(titleString);
		
		driver.quit();

	}

}
