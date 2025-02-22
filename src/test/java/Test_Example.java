import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test_Example extends TestBase{

    @Test

    public void SearchModule_TC001_VerifyGoogleSearch_FP() throws InterruptedException {

        WebDriver driver = getDriver();
        driver.get("https://googlechromelabs.github.io/chrome-for-testing/#stable");
       // driver.findElement (By.name("q")).sendKeys("Sri Lanka");
        //driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
       // Thread.sleep(10000);
       // driver.quit();



    }
    @Test

    public void test_Google_Example2() throws InterruptedException {

        WebDriver driver = getDriver();
        driver.get("https://www.google.com");
        driver.findElement (By.name("q")).sendKeys("Sri Lanka");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        driver.quit();



    }

}