package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//img[@src='/_nuxt/img/logo-davidson-clear.92edaf1.svg']")
    public WebElement logo;
    @FindBy(xpath = "//a[text()='Soumettre un projet']")
    public WebElement soumettreUnProjet;
    @FindBy(xpath = "//a[text()='Nous rejoindre']")
    public WebElement nousRejoindre;
    @FindBy(xpath = "//a[text()='Filiales']")
    public WebElement filiales;

    @FindBy(xpath = "//span[text()='Bienvenue']")
    public WebElement bienvenue;

}
