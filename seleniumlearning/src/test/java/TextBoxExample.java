import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxExample {

        WebDriver driver;

        @BeforeMethod
        public void openLinkTestPage(){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.leafground.com/link.xhtml");

        }

        @Test
        public void textBoxTests(){
            //01) Type Your name
            driver.findElement(By.id("j_idt88:name")).sendKeys("Kavindu Maleesha");

            //02) Append Country to this City
            driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("India");

            //03)Verify if text box is disabled
            
        }

    }
