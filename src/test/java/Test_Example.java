import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Example extends TestBase {

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

        //navigate to calculator page
        driver.get("https://www.calculator.net/calorie-calculator.html");

        //clear existing data
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[5]/form/table[4]/tbody/tr[3]/td[2]/input[4]")).click();

        //Locator - Id
        //driver.findElement(By.id("cage")).sendKeys("20");

        //Locator - Name
        //driver.findElement(By.name("cage")).sendKeys("30");

        //Locator - ClassName
        //driver.findElement(By.className("inhalf")).sendKeys("40");

        //Locator - CSSSelector - option1
        driver.findElement(By.cssSelector("input#cheightmeter")).sendKeys("100");

        //Locator - CSSSelector - option2
        //driver.findElement(By.cssSelector("input.inhalf")).sendKeys("40");

        //Locator - CSSSelector - option3
        driver.findElement(By.cssSelector("[name='x']")).click();

        //Locator - Link Test
        //driver.findElement(By.linkText("Other Units")).click();

        //Locator - partial Link Test
        driver.findElement(By.partialLinkText("Other Units")).click();

        //Locator - tagName
        driver.findElement(By.tagName("input")).sendKeys("60");

        //Locator - xpath
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[5]/form/table[4]/tbody/tr[3]/td[2]/input[4]")).click();


        Thread.sleep(10000);
        driver.quit();


    }


    @Test

    public void ReporterTest() throws InterruptedException {

        WebDriver driver = getDriver();

        //navigate to calculator page
        driver.get("https://www.calculator.net/calorie-calculator.html");

        //clear existing data
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[5]/form/table[4]/tbody/tr[3]/td[2]/input[4]")).click();

        //Enter Age
        driver.findElement(By.id("cage")).sendKeys("20");

        //Enter Height
        driver.findElement(By.id("cheightmeter")).sendKeys("100");

        //Enter Weight
        driver.findElement(By.id("ckg")).sendKeys("18");

        //press calculate button
        driver.findElement(By.name("x")).click();

        //Assert Result
        String ExpectedTitle = "Result";
        WebElement titleElement = driver.findElement(By.xpath("//*[@id=\"content\"]/h2[1]"));
        String ActualTitle = titleElement.getText();

        //print excepted ad actual result
        System.out.println(ExpectedTitle);
        System.out.println(ActualTitle);

        //compare actual vs expected result
        Assert.assertEquals(ActualTitle,ExpectedTitle);


        Thread.sleep(10000);
        driver.quit();


    }

}