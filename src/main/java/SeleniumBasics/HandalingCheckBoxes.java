package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandalingCheckBoxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		WebElement cbox1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
		System.out.println(cbox1.isDisplayed());
		System.out.println(cbox1.isEnabled());
		System.out.println(cbox1.isSelected());
		
		WebElement cbox2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
		System.out.println(cbox2.isDisplayed());
		System.out.println(cbox2.isEnabled());
		System.out.println(cbox2.isSelected());
		
		cbox1.click();
		
	}
}
