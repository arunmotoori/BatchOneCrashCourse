package doubts;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassF {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any browser name (chrome/firefox/edge):");
		String browserName = scanner.nextLine();
		scanner.close();
		
		WebDriver driver;
		
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}else if(browserName.equals("edge")) {
			driver = new EdgeDriver();
		}else {
			throw new Exception("You can only enter chrome/firefox/edge");
		}
	
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement textAreaFieldOne = driver.findElement(By.id("ta1"));
		textAreaFieldOne.sendKeys("Arun Motoori");

	}

}
