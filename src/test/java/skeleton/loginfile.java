package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;

public class loginfile {
	WebDriver driver;

	@Given("Launch the chrome borwser")
	public void launch_the_chrome_borwser() throws Exception {
		 System.setProperty("webdriver.chrome.driver", "C:\\C2C.04.02_Softwares\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://newtours.demoaut.com");
		  //Thread.sleep(2000);
	}
	
	@Given("enter valid uname and pwd")
	public void enter_valid_uname_and_pwd() {
		driver.findElement(By.name("userName")).sendKeys("mercury");;
		driver.findElement(By.name("password")).sendKeys("mercury");;
	}

	@Given("Click submit button")
	public void click_submit_button() {
		driver.findElement(By.name("login")).click();
	}

	@Given("close the browser")
	public void close_the_browser() {
	    driver.close();
	}

	 
}

