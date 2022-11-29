package homepage;

import Utility.Utility;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends Utility {
    String baseUrl = "http://tutorialsninja.com/demo/index.php?";

    @Before
    public void setup() {
        openBroswer(baseUrl);
    }

   // @After
   // public void tearDown() throws InterruptedException {
      //  Thread.sleep(3000);
       // closeBrowser();
   // }

    private void closeBrowser() {
        driver.close();

    }

    public void selectMenu(String menu) {
        // clickOnElement(By.xpath("//nav/div/ul/li/a[contains(text(), '"+menu+"')]"));
        clickOnElement(By.linkText(menu));
    }

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() throws InterruptedException {

        mouseHoverToElement(By.xpath("//nav/div/ul/li/a[contains(text(), 'Desktops')]"));
        selectMenu("Show All Desktops");
        String expText = "Desktops";
        String actText = getTextFromElement(By.xpath("//h2[contains(text(),'Desktops')]"));
        Assert.assertEquals("NotMatching",expText,actText);
    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        mouseHoverToElement(By.linkText("Laptops & Notebooks"));
        selectMenu("Show All Laptops & Notebooks");
        String expText = "Laptops & Notebooks";
        String actText = getTextFromElement(By.xpath("//h2[contains(text(),'Laptops & Notebooks')]"));
        Assert.assertEquals("NotMatching",expText,actText);
    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
        mouseHoverToElement(By.linkText("Components"));
        selectMenu("Show All Components");
        String expText = "Components";
        String actText = getTextFromElement(By.xpath("//h2[contains(text(),'Components')]"));
        Assert.assertEquals("NotMatching",expText,actText);
    }
}
