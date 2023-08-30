package PopUps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RegisterPageProject
{
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","D:\\SeleiniumWeb\\SampleProject\\drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Users\\Vicky\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentwindowId = driver.getWindowHandle();
		System.out.println("parent window id="+parentwindowId);
		System.out.println("title of main page"+driver.getTitle());
		
		//click on open new window 
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		//switch to child brower
		Set<String> windowhandles = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList(windowhandles);
		String childwindow = al.get(1);
		driver.switchTo().window(childwindow);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Arunachalam");
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys("krishan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='englishchbx']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='malerb']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("Arunachalamkrishan@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("qwer1234");
		Thread.sleep(2000);
		driver.findElement(By.id("registerbtn")).click();
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
		driver.quit();

		
		
		
		
		
		
		
}
}
