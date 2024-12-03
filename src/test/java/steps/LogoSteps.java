package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pages.Cookies;
import pages.HomePage;
import utilities.WaitHelper;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LogoSteps {
    WaitHelper wait = new WaitHelper(10);
    HomePage homePage = new HomePage();
    Cookies cookies = new Cookies();

    @Then("User should see the site logo")
    public void user_should_see_the_site_logo() {
    wait.waitForElementToBeVisible(homePage.logo);
    assertTrue(homePage.logo.isDisplayed());
    }
    @Given("User is on the {string} page")
    public void userIsOnThePage(String pages) {
        switch (pages) {
            case "Soumettre Un Projet" :
                homePage.soumettreUnProjet.click();
                break;
            case "Nous rejoindre" :
                homePage.nousRejoindre.click();
                break;
            case "Filiales" :
                homePage.filiales.click();
                break;
            default: throw new IllegalArgumentException("Page not defined: " + pages);

        }
        wait.waitForElementToBeClickable(homePage.logo);
        assertTrue(homePage.logo.isDisplayed());
    }
    @Given("User is on the page")
    public void user_is_on_the_page(DataTable dataTable) {
        List<String> pages = dataTable.asList();
        for (String page : pages){
           switch (page) {
               case "Soumettre Un Projet" :
                   homePage.soumettreUnProjet.click();
                   break;
               case "Nous rejoindre " :
                   homePage.nousRejoindre.click();
                   break;
               case "Filiales" :
                   homePage.filiales.click();
                   break;
               default: throw new IllegalArgumentException("Page not defined: " + page);

           }
           wait.waitForElementToBeClickable(homePage.logo);
           assertTrue(homePage.logo.isDisplayed());

        }
    }
    @When("User clicks on the site logo")
    public void user_clicks_on_the_site_logo() {
        wait.waitForPageToLoad();
        if (cookies.cookie.isDisplayed()){
            cookies.cookie.click();
        }
        homePage.logo.click();
    }
    @Then("User shoulds be redirected to the homepage")
    public void user_shoulds_be_redirected_to_the_homepage() {
        wait.waitForPageToLoad();
        if (cookies.cookie.isDisplayed()){
            cookies.cookie.click();
        }
        wait.waitForElementToBeVisible(homePage.bienvenue);
        assertTrue(homePage.bienvenue.isDisplayed());
    }
    
}
