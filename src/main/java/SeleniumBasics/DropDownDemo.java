package SeleniumBasics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {
	
	public static void main(String[] args) {
		getAllUrls();
	}
	
	public static void getAllUrls() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> urls = driver.findElements(By.tagName("a"));
		System.out.println("coun tof url ="+urls.size());
		
//		for(int i=0; i<urls.size(); i++) {
//			System.out.println(urls.get(i).getText());
//		}
		for(WebElement abc :urls) {
			System.out.println(abc.getText());
		}
		
	}
	
	public static void dropDownTask() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/contact-sales/");
		WebElement country = driver.findElement(By.name("Country"));
		List<WebElement> options = country.findElements(By.tagName("Option"));
		System.out.println(options.size());
		for(WebElement opt : options) {
			System.out.println(opt.getText());
		}
	}
	
	public static void dropDownDemo() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/contact-sales/");
		WebElement dropdown = driver.findElement(By.id("Form_getForm_Country"));
		Select	obj = new Select(dropdown);
		//obj.selectByValue("2");
		obj.selectByVisibleText("Australia");
	}
	

}
