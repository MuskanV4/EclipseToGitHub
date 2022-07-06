package building2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Test 8 - Get the page source - getPageSource();

public class p07p8p9p10p11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver obj = new ChromeDriver();
		
		obj.get("https://youtube.com/");
		
		//System.out.print(obj.getPageSource());
		System.out.println(obj.getTitle());
		System.out.print(obj.getWindowHandle());
		
	}

}
