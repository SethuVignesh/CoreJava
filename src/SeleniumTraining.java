import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTraining {

            public static void main(String[] args)  {
// TODO Auto-generated method stub

                System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");


                WebDriver driver=new ChromeDriver();

                driver.manage().window().maximize();
                 driver.get("https://protect-us.mimecast.com/s/ElZ9CrkNZ9sXmoJVt7qTKb?domain=apac-uat-bpplus.test.emea.wexinc.co.uk");

                 //

                driver.findElement(By.xpath("//*[@id=\"j_username\"]")).sendKeys("KavithaBPAU");
                driver.findElement(By.xpath("//*[@id=\"j_password\"]")).sendKeys("Password01");
                driver.findElement(By.xpath("//*[@id=\"btn_login\"]")).click();
                Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"lform:selectMember\"]")));
                dropdown.selectByIndex(11);
                Actions actions = new Actions(driver);
                WebElement webelement = driver.findElement(By.xpath("//*[@id=\"levelOneCards\"]"));
                actions.moveToElement(webelement).build().perform();
                //* actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"levelOneCards\"]"))).build().perform();
                WebDriverWait wait = new WebDriverWait(driver, 5);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"menu_form:levelTwoCardNew\"]")));

                WebElement e = driver.findElement(By.xpath("//*[@id=\"menu_form:levelTwoCardNew\"]"));
               e.click();
                //driver.navigate().to("https://www.cricbuzz.com/");
                //Actions action = new Actions(driver);
                //WebElement webelement = driver.findElement(By.xpath("html/body/header/div/nav/div[3]/a"));
                //action.moveToElement(webelement).build().perform();
                //action.moveToElement(driver.findElement(By.xpath("/html/body/header/div/nav/div[3]/nav/div/div[1]/a[1]"))).click().perform();







            }

        }


