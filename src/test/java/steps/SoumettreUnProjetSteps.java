package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.Cookies;
import pages.HomePage;
import pages.SoumettreUnProjet;
import utilities.Driver;
import utilities.WaitHelper;

import static org.junit.Assert.assertTrue;

public class SoumettreUnProjetSteps {
    WaitHelper waitHelper = new WaitHelper(10);
    SoumettreUnProjet soumettreUnProjet = new SoumettreUnProjet();
    HomePage homePage = new HomePage();
    Actions actions = new Actions(Driver.getDriver());
    Cookies cookies = new Cookies();

    @Given("User is on the Soumettre's project page")
    public void user_is_on_the_soumettre_s_project_page() {
       waitHelper.waitForPageToLoad();
       homePage.soumettreUnProjet.click();
    }
    @When("User fills in the required {string}{string}{string}{string}{string}{string}{string}{string}{string}  on the form")
    public void userFillsInTheRequiredOnTheForm(String candidate, String sector, String city, String subject, String firstName, String lastName, String email, String phone, String message) {
       waitHelper.waitForElementToBeClickable(cookies.cookie);
       cookies.cookie.click();
        Select select = new Select(soumettreUnProjet.vousEtes);
        select.selectByValue(candidate);
        waitHelper.waitForElementToBeVisible(soumettreUnProjet.dansLeSecteur);
        Select select1 = new Select(soumettreUnProjet.dansLeSecteur);
        select1.selectByValue(sector);
        Select select2 = new Select(soumettreUnProjet.vousSouhaitez);
        select2.selectByValue(subject);
        actions.sendKeys(soumettreUnProjet.prenom, firstName)
                .sendKeys(soumettreUnProjet.nom, lastName)
                .sendKeys(soumettreUnProjet.votreVille, city)
                .sendKeys(soumettreUnProjet.email, email)
                .sendKeys(soumettreUnProjet.phone, phone)
                .sendKeys(soumettreUnProjet.message, message)
                .perform();




    }
    @When("User clicks on the Send button")
    public void user_clicks_on_the_send_button() {
     soumettreUnProjet.envoyerBtn.click();
    }
    @Then("User should see a confirmation that the nomination has been sent successfully")
    public void user_should_see_a_confirmation_that_the_nomination_has_been_sent_successfully() {
waitHelper.waitForElementToBeVisible(soumettreUnProjet.seeYou);
        assertTrue(soumettreUnProjet.seeYou.isDisplayed());

    }


}
