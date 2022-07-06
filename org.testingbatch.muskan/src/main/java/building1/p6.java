package building1;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class p6
{
	public static void main(String[] args)
	{
		//Take browser name from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		String bn=sc.nextLine();
		sc.close();
		//Open browser
		RemoteWebDriver driver;
		//declare object to parent class
		if(bn.equals("chrome"))
		{
			//Get "chrome driver software" as per chrome version in our computer
			WebDriverManager.chromedriver().setup();
			//Open chrome browser using that chrome driver software
			driver=new ChromeDriver(); //define object using child class constructor
		}
		else if(bn.equals("firefox"))
		{
			//Get "gecko driver software" as per firefox version in our computer
			WebDriverManager.firefoxdriver().setup();
			//Open firefox browser using gecko driver
			driver=new FirefoxDriver();//define object to child class
		}
		else if(bn.equals("opera"))
		{
			//Get "opera driver software" as per opera version in our computer
			WebDriverManager.operadriver().setup();
			//Open opera browser using  opera driver
			driver=new OperaDriver();//define object to child class
		}
		else if(bn.equals("edge"))
		{
			//Get "msedgedriver software" as per edge version in our computer
			WebDriverManager.edgedriver().setup();
			//open edge browser using "msedgedriver software"
			driver=new EdgeDriver();//define object to child class
		}
		else
		{
			//Get "IEdriverserver software" as per IE version in our computer
			WebDriverManager.iedriver().setup();
			//Open IE browser using "IEdriverserver" software
			driver=new InternetExplorerDriver();//define object to child class
		}
		//Common code BY MUSKAN
		driver.get("http://www.gmail.com"); //give base URL to launch site
	}
}
