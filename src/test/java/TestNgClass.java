import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgClass {
    WebDriver driver=null;
    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_testng\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

    }
    @Test
    public void test1() throws InterruptedException {
        driver.get("http://www.one.co.il");
        Thread.sleep(3000);

    }
    @AfterMethod
    public void afterMethod(){
        if(driver!=null){
            driver.quit();
        }
    }
}
