package ATS_Wave;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaveRoster {
	@Test(priority = 1)
	public void hover() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\john.sampedro\\eclipse\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		
		//Pass debugger address
		options.setExperimentalOption("debuggerAddress","localhost:9222");
		
		//Pass ChromeOptions
		WebDriver driver = new ChromeDriver(options);
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Obeyaboard/Waveroster/11474");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		WebElement headcnt = driver.findElement(By.cssSelector("#hiring-goal"));
		WebElement IPhired = driver.findElement(By.cssSelector(".roster-count.display-3.kt-font-info.d-lg-none.d-xl-block"));
		WebElement PerGoal = driver.findElement(By.xpath("//span[contains(@class,'d-lg-none d-xl-block')][normalize-space()='NaN%']"));
		WebElement FTE = driver.findElement(By.xpath("//span[contains(@data-field,'requiredfulltime')]"));
		WebElement PTE = driver.findElement(By.xpath("//span[contains(@data-field,'requiredparttime')]"));
		WebElement IPfull = driver.findElement(By.xpath("//span[contains(@data-field,'inprogressfulltime')]"));
		WebElement IPpart = driver.findElement(By.cssSelector("span[data-field='inprogressparttime']"));
		WebElement PerFTE = driver.findElement(By.cssSelector("span[data-field='fulltimepercentage']"));
		WebElement PerPTE = driver.findElement(By.cssSelector("span[data-field='parttimepercentage']"));
		
		//Hover
		action.moveToElement(headcnt).perform();
		Thread.sleep(1000);
		action.moveToElement(IPhired).perform();
		Thread.sleep(1000);
		action.moveToElement(PerGoal).perform();
		Thread.sleep(1000);
		action.moveToElement(FTE).perform();
		Thread.sleep(1000);
		action.moveToElement(PTE).perform();
		Thread.sleep(1000);
		action.moveToElement(IPfull).perform();
		Thread.sleep(1000);
		action.moveToElement(IPpart).perform();
		Thread.sleep(1000);
		action.moveToElement(PerFTE).perform();
		Thread.sleep(1000);
		action.moveToElement(PerPTE).perform();
		Thread.sleep(2000);
	}
	
	@Test(priority = 2)
	public void addEmployee() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\john.sampedro\\eclipse\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		
		//Pass debugger address
		options.setExperimentalOption("debuggerAddress","localhost:9222");
		
		//Pass ChromeOptions
		WebDriver driver = new ChromeDriver(options);
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Obeyaboard/Waveroster/11474");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Add Employee
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Add/Rehire Employee']")).click();
		
		//Wait for element
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[normalize-space()='Add Employee']")));
		Thread.sleep(1000);
		WebElement search = driver.findElement(By.cssSelector("#search_check_in"));
		Thread.sleep(1000);
		search.click();
		Thread.sleep(1000);
		search.sendKeys("Carter");
		Thread.sleep(1000);
		action.sendKeys(Keys.ENTER).build().perform();
		
		//Wait for element
		new WebDriverWait(driver, Duration.ofSeconds(60))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[normalize-space()='prettiahcarter@gmail.com']")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[contains(@title,'add')])[3]")).click();
		
		//Wait for popup
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='wave-selector-modal']//h4[contains(@class,'modal-title')]")));
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div[class='modal-dialog modal-dialog-centered'] "
				+ "div[class='modal-header'] button[type='button']")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 3)
	public void fillOut() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\john.sampedro\\eclipse\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		
		//Pass debugger address
		options.setExperimentalOption("debuggerAddress","localhost:9222");
		
		//Pass ChromeOptions
		WebDriver driver = new ChromeDriver(options);
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Obeyaboard/Waveroster/11474");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		WebElement firstName = driver.findElement(By.cssSelector("#kt_firstName"));
		WebElement lastName = driver.findElement(By.cssSelector("#kt_lastName"));
		WebElement phoneNo = driver.findElement(By.cssSelector("#kt_phone"));
		WebElement email = driver.findElement(By.cssSelector("#kt-email"));
		WebElement street = driver.findElement(By.cssSelector("input[placeholder='Street']"));
		WebElement aptNo = driver.findElement(By.cssSelector("input[placeholder='Apartment Number']"));
		WebElement city = driver.findElement(By.cssSelector("input[placeholder='City']"));
		WebElement state = driver.findElement(By.cssSelector("input[placeholder='State']"));
		WebElement postal = driver.findElement(By.cssSelector("input[placeholder='Postal Code']"));
		WebElement country = driver.findElement(By.cssSelector("input[placeholder='Country Name']"));
		
		//Fillout
		driver.findElement(By.xpath("//a[normalize-space()='Create']")).click();
		Thread.sleep(2000);
		firstName.sendKeys("John Michael");
		Thread.sleep(1000);
		lastName.sendKeys("Sampedro");
		Thread.sleep(1000);
		phoneNo.sendKeys("09395046098");
		Thread.sleep(1000);
		email.sendKeys("johnmichaelsampedro@gmail.com");
		Thread.sleep(1000);
		street.sendKeys("Galas Street");
		Thread.sleep(1000);
		aptNo.sendKeys("Blk 11 Lot 25");
		Thread.sleep(1000);
		city.sendKeys("Valenzuela City");
		Thread.sleep(1000);
		state.sendKeys("Arizona");
		Thread.sleep(1000);
		postal.sendKeys("1440");
		country.sendKeys("Philippines");
		Thread.sleep(3000);
	}
	
	@Test(priority = 4)
	public void status() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\john.sampedro\\eclipse\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		
		//Pass debugger address
		options.setExperimentalOption("debuggerAddress","localhost:9222");
		
		//Pass ChromeOptions
		WebDriver driver = new ChromeDriver(options);
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Obeyaboard/Waveroster/11474");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Click status
		WebElement status = driver.findElement(By.cssSelector("#select2-kt_form_status-container"));
		status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'In Interview')]")).click();
		Thread.sleep(2000);
		status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'All')]")).click();
		Thread.sleep(2000);
		WebElement employmentStat = driver.findElement(By.xpath("(//span[@id='select2-kt_form_empstatus-container'])[1]"));
		employmentStat.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'Full Time')]")).click();
		Thread.sleep(2000);
		employmentStat.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'All')]")).click();
		Thread.sleep(2000);
		WebElement language = driver.findElement(By.xpath("(//span[@id='select2-kt_form_empstatus-container'])[2]"));
		language.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'English')]")).click();
		Thread.sleep(2000);
		language.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'All')]")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 5)
	public void bell() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\john.sampedro\\eclipse\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		
		//Pass debugger address
		options.setExperimentalOption("debuggerAddress","localhost:9222");
		
		//Pass ChromeOptions
		WebDriver driver = new ChromeDriver(options);
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Obeyaboard/Waveroster/11474");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Click bell button
		Boolean isPresent = false;
		
		do {
			try {
				driver.findElement(By.xpath("(//span[@class='btn btn-default btn-reminder'])[1]")).click();
				//Wait for element
				new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='modal-dialog modal-dialog-centered modal-med'] h4[class='modal-title']")));
				Thread.sleep(1000);
				driver.findElement(By.cssSelector("#select2-follow-up-select-container")).click();
				Thread.sleep(1000);
				driver.findElement(By.cssSelector("li[title='Others']")).click();
				isPresent = true;
				Thread.sleep(1000);
				
				//Fill out information
				driver.findElement(By.cssSelector(".form-control.kt-input.follow-up-date")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//td[@class='day'][normalize-space()='27']")).click();
				Thread.sleep(1000);
				driver.findElement(By.cssSelector("input[data-input-name='Description']")).sendKeys("Bell Test");
				Thread.sleep(1000);
				driver.findElement(By.cssSelector("input[data-input-name='RequestedBy']")).sendKeys("JM");
				
				//Save
				Thread.sleep(1000);
				driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
				Thread.sleep(3000);
			} catch(Exception e) {
				driver.findElement(By.cssSelector("div[class='modal-dialog modal-dialog-centered modal-med'] div[class='modal-header'] button[type='button']")).click();
				isPresent = false;
				Thread.sleep(1000);
			}
		} while(isPresent == false);
		
		//Clicking red bell button
		driver.findElement(By.xpath("(//span[@class='btn btn-default btn-reminder'])[1]")).click();
		Boolean isRed = false;
		
		do {
			try {
				new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[normalize-space()='Follow Up Items']")));
				Thread.sleep(1000);
				driver.findElement(By.xpath("//td[normalize-space()='Others']")).click();
				Thread.sleep(3000);
				driver.findElement(By.cssSelector("div[class='modal-dialog modal-dialog-centered modal-med'] div[class='modal-header'] button[type='button']")).click();
				Thread.sleep(1000);
				driver.findElement(By.cssSelector("td[class='actions selector sorting_1'] span")).click();
				Thread.sleep(1000);
				driver.findElement(By.cssSelector("#btn-bulk-complete")).click();
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("div[class='modal-dialog modal-dialog-centered modal-lg'] div[class='modal-header'] button[type='button']")).click();
				Thread.sleep(3000);
				isRed = true;
			} catch(Exception e) {
				driver.findElement(By.xpath("(//button[@type='button'])[8]")).click();
				Thread.sleep(1000);
				isRed = false;
			}
		} while(isRed == false);
	}
	
	@Test(priority = 6)
	public void act() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\john.sampedro\\eclipse\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		
		//Pass debugger address
		options.setExperimentalOption("debuggerAddress","localhost:9222");
		
		//Pass ChromeOptions
		WebDriver driver = new ChromeDriver(options);
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Obeyaboard/Waveroster/11474");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Click actions column
		WebElement ellipsis = driver.findElement(By.xpath("(//a[@class='btn btn-sm btn-clean btn-icon btn-icon-md'])[1]"));
		ellipsis.click();
		Thread.sleep(1000);
		
		//Email
		driver.findElement(By.xpath("//div[@class='dropdown-menu dropdown-menu-right show']//a[@class='dropdown-item action-item'][normalize-space()='Email']")).click();
		new WebDriverWait(driver, Duration.ofSeconds(50))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[normalize-space()='Send Email']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='modal-dialog modal-dialog-centered modal-xl']//div[@class='modal-header']//button[@type='button']")).click();
		Thread.sleep(1000);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		
		//Update Wave/Wage Info
		ellipsis.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@id='btn-assign-wave'])[1]")).click();
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='modal-dialog modal-dialog-centered'] h4[class='modal-title']")));
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div[class='modal-dialog modal-dialog-centered'] div[class='modal-header'] button[type='button']")).click();
		Thread.sleep(1000);
		
		//Set Orientation Date
		ellipsis.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@id='btn-set-orientation'])[1]")).click();
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[normalize-space()='Orientation Schedule']")));
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class='modal-dialog modal-dialog-centered modal-lg'] "
				+ "div[class='modal-header'] button[type='button']")).click();
		Thread.sleep(1000);
		
		//Pickup
		ellipsis.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dropdown show']//a[5]")).click();
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[normalize-space()='Computer Pickup Date and Time']")));
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".form-control.kt-input.computer-pickup-schedule-datetime")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div[class='modal-dialog modal-dialog-centered'] "
				+ "div[class='modal-header'] button[type='button']")).click();
		Thread.sleep(1000);
		
	}
	@Test(priority = 7)
	public void hrInfo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\john.sampedro\\eclipse\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		
		//Pass debugger address
		options.setExperimentalOption("debuggerAddress","localhost:9222");
		
		//Pass ChromeOptions
		WebDriver driver = new ChromeDriver(options);
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Obeyaboard/Waveroster/11474");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Click actions column
		WebElement ellipsis = driver.findElement(By.xpath("(//a[@class='btn btn-sm btn-clean btn-icon btn-icon-md'])[1]"));

		//Update HR Information
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		ellipsis.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='dropdown-item action-item'])[4]")).click();
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[normalize-space()='Digital Orientation Email Sent']")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span)[251]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span)[253]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span)[255]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span)[257]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span)[259]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span)[261]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span)[263]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div[class='modal-dialog modal-dialog-centered'] "
						+ "div[class='modal-header'] button[type='button']")).click();
		Thread.sleep(1000);
		
		//Training Details
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		ellipsis.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dropdown-menu dropdown-menu-right show']//a[@class='dropdown-item'][normalize-space()='Update Training Details']")).click();
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[normalize-space()='Superpunch Id:']")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span)[251]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span)[253]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div[class='modal-dialog modal-dialog-centered modal-md'] div[class='modal-header'] button[type='button']")).click();
		Thread.sleep(1000);
	}
	
	@Test(priority = 8)
	public void updateStatus() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\john.sampedro\\eclipse\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		
		//Pass debugger address
		options.setExperimentalOption("debuggerAddress","localhost:9222");
		
		//Pass ChromeOptions
		WebDriver driver = new ChromeDriver(options);
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Obeyaboard/Waveroster/11474");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Update status
		driver.findElement(By.xpath("//div[contains(@class,'dataTables_scrollHeadInner')]//span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Update status']")).click();
		Thread.sleep(1000);
		
		//Prehire
		driver.findElement(By.cssSelector(".dropdown-item.bulk-status-update[data-applicant-statusid='9']")).click();
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[contains(text(),'Bulk Update')]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'modal-dialog modal-dialog-centered modal-lg always-on-top')]"
				+ "//div[contains(@class,'modal-header')]//button[contains(@type,'button')]")).click();
		Thread.sleep(1000);
		
		//Hired
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Update status']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".dropdown-item.bulk-status-update[data-applicant-statusid='10']")).click();
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[contains(text(),'Bulk Update')]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'modal-dialog modal-dialog-centered modal-lg always-on-top')]"
				+ "//div[contains(@class,'modal-header')]//button[contains(@type,'button')]")).click();
		Thread.sleep(1000);
		
		//On Hold
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Update status']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".dropdown-item.bulk-status-update[data-applicant-statusid='11']")).click();
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[contains(text(),'Bulk Update')]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'modal-dialog modal-dialog-centered modal-lg always-on-top')]"
				+ "//div[contains(@class,'modal-header')]//button[contains(@type,'button')]")).click();
		driver.findElement(By.cssSelector("#select2-disposition-modal-select-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@title='Part Time']")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		
		//Not Right Now
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Update status']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".dropdown-item.bulk-status-update[data-applicant-statusid='12']")).click();
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[contains(text(),'Bulk Update')]")));
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#select2-disposition-modal-select-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@title='Not Hired - Low Spoken']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'modal-dialog modal-dialog-centered modal-lg always-on-top')]"
				+ "//div[contains(@class,'modal-header')]//button[contains(@type,'button')]")).click();
		Thread.sleep(1000);
	}
	
	@Test(priority = 9)
	public void download() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\john.sampedro\\eclipse\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		
		//Pass debugger address
		options.setExperimentalOption("debuggerAddress","localhost:9222");
		
		//Pass ChromeOptions
		WebDriver driver = new ChromeDriver(options);
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Obeyaboard/Waveroster/11474");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Click Download button
		driver.findElement(By.xpath("//button[normalize-space()='Download']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li[data-id='excel-adp']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Download']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li[data-id='excel-all']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Download']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li[data-id='excel-hire']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Download']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li[data-id='excel-master-roster']")).click();
		Thread.sleep(2000);
	}
}
