package StepDefinitions;

import Pages.sahibindenPages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class sahibindenStepDefinitions {

    sahibindenPages sahibindenPages = new sahibindenPages(DriverFactory.getDriver());
    @When("Vasita butonuna tiklanir.")
    public void vasitaButonunaTiklanir() throws InterruptedException {
        sahibindenPages.vasitaTiklama();
    }

    @When("Filtrele butonuna tiklanir")
    public void filtreleButonunaTiklanir() {
        sahibindenPages.filtreleTiklama();
    }

    @When("Adres butonuna tiklanir ve adres secilir")
    public void adresButonunaTiklanirVeAdresSecilir() throws InterruptedException {
        sahibindenPages.adresTiklama();
    }

    @When("Vasita butonuna tiklanir ve marka model secilir")
    public void vasitaButonunaTiklanirVeMarkaModelSecilir() {
        sahibindenPages.vasitaSecme();
    }

    @When("Fiyat butonuna tiklanir ve fiyat araligi secilir")
    public void fiyatButonunaTiklanirVeFiyatAraligiSecilir() {
        sahibindenPages.fiyatSecme();
    }

    @When("Sonuclari goster butonuna tiklanir")
    public void sonuclariGosterButonunaTiklanir() throws InterruptedException {
        sahibindenPages.sonuclarGosterme();
    }

    @Then("Vasitalarin geldigi kontrol edilir")
    public void vasitalarinGeldigiKontrolEdilir() throws InterruptedException {
        sahibindenPages.kontrolEtme();
    }
}