package Saction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class eaction {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\SEL\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://vettritech.com/");
		Actions a=new Actions(d);
		a.moveToElement(d.findElement(By.linkText("SERVICES"))).perform();
	}

}
