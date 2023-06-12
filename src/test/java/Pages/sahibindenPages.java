package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.time.Duration;

public class sahibindenPages {
        AppiumDriver driver;
        WebDriverWait wait;
        ElementHelper elementHelper;

        By vasitaButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Vasıta\")");
        By tumAraclarButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Tüm \"Vasıta\" İlanları\")");
        By konumIzinVerme  = MobileBy.AndroidUIAutomator("new UiSelector().text(\"İzin Verme\")");
        By filtreleButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Filtrele\")");
        By adresButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Adres\")");
        By modelButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Vasıta\")");
        By fiyatButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Fiyat\")");
        By aramaSonucu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Arama Sonucu\")");

        public void swipeDownUntilTextVisible(String targetText) {
            String uiSelector = "new UiSelector().textMatches(\"" + targetText + "\")";
            String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(" + uiSelector + ");";

            driver.findElement(MobileBy.AndroidUIAutomator(command));
        }


        public sahibindenPages(AppiumDriver driver) {
            this.driver = driver;
            this.wait = new WebDriverWait(driver,10);
            this.elementHelper = new ElementHelper(driver);
        }


        public void vasitaTiklama() throws InterruptedException {
                driver.findElement(vasitaButonu).click();
                driver.findElement(tumAraclarButonu).click();
                driver.findElement(tumAraclarButonu).click();
                driver.findElement(konumIzinVerme).click();
                Thread.sleep(2000);
        }

        public void filtreleTiklama() {
                driver.findElement(filtreleButonu).click();
        }

        public void adresTiklama() throws InterruptedException {
            driver.findElement(adresButonu).click();
            driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Tüm İller\")")).click();
            driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Ankara\")")).click();
            driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"TAMAM\")")).click();
            driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"TAMAM\")")).click();

        }

        public void vasitaSecme() {
            driver.findElement(modelButonu).click();
            driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Otomobil\")")).click();
            driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Tümü\")")).click();
            swipeDownUntilTextVisible("Toyota");
            driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Toyota\")")).click();
            driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Tümü\")")).click();
            swipeDownUntilTextVisible("Corolla");
            driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Corolla\")")).click();
            driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Tümü\")")).click();
            swipeDownUntilTextVisible("1.6");
            driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"1.6\")")).click();
            driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"TAMAM\")")).click();
        }

        public void fiyatSecme() {
            driver.findElement(fiyatButonu).click();
            driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"En az\")")).sendKeys("850000");
            driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"En çok\")")).sendKeys("950000");
            driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"TAMAM\")")).click();
        }

        public void sonuclarGosterme() {
            driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"SONUÇLARI GÖSTER\")")).click();
        }

        public void kontrolEtme() throws InterruptedException {
            Thread.sleep(3000);
            elementHelper.checkVisible(aramaSonucu);
        }
}
