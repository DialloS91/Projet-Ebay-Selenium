import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ebay1 {
    WebDriver driver;

    @BeforeMethod
    public void ouvrirChrome() {
        driver = new ChromeDriver();
        driver.get("https://www.ebay.fr/");
        driver.manage().window().maximize();

    }

    // @AfterMethod
    //public void fermerChrome() {
    //   driver.quit();
    // }

    @Test
    public void Test1(){

        //Arrange
        String TextArticlePresent = "Panier (1 objet)";
        String TextPanierPresent = "1";

        //Act

/*
        By cookieButton = By.id("gdpr-banner-accept");
        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.elementToBeClickable(cookieButton));
        driver.findElement(cookieButton).click();

 */
        By cathegorieExplore = By.id("gh-shop-a");
        driver.findElement(cathegorieExplore).click();



        By SportVacance = By.cssSelector("[_sp='m570.l3778']");
        driver.findElement(SportVacance).click();

        By maillotSelector = By.cssSelector(".b-list__items_nofooter.srp-results.srp-grid li:nth-of-type(1)");
        driver.findElement(maillotSelector).click();

        By AjouterPanier = By.id("isCartBtn_btn");
        driver.findElement(AjouterPanier).click();

        By articlePAnier = By.cssSelector(".main-title");
        String articlePresent= driver.findElement(articlePAnier).getText();


        //Asserts

        Assert.assertEquals(articlePresent, TextArticlePresent);


    }


}
