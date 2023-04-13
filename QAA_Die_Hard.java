import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QAA {
    @Test
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "D:\\Test\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost/index.html");

        WebElement input = driver.findElement(By.id("film_name"));
        input.sendKeys("Die Hard");


        WebElement Btn = driver.findElement(By.id("get_api_res_btn"));
        Btn.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        WebElement year = driver.findElement(By.id("api_year"));

        Assert.assertEquals(year.getText(), "Year: 1988");

        WebElement director = driver.findElement(By.id("api_director"));


        Assert.assertEquals(director.getText(), "Director: John McTiernan");









    }
}
