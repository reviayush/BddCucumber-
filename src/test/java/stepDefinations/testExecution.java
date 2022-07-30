package stepDefinations;

import io.cucumber.java.en.*;
import pageObjects.HomePage;
import utilities.BaseClass;

public class testExecution extends BaseClass {

	HomePage home;
	BaseClass base;
	
	
	@Given("Launch chrome browser")
	public void launch_chrome_browser() {
       base= new BaseClass();
       base.setup();
      System.out.println("Launching browser");
	}

	@When("open Url ={string}")
	public void open_url(String url) {
		driver.get(url);
		base= new BaseClass();
		home = new HomePage();
		home.navigateHomepage();
	}

	@Then("page title shuld be {string}")
	public void page_title_shuld_be(String string) {
  System.out.println(string);
	}

	@Then("close browser")
	public void close_browser() {
		base.teraDown();
     
	}

}
