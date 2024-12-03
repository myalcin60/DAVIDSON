package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SoumettreUnProjet {
    public SoumettreUnProjet (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (id="youare")
    public WebElement vousEtes;
    @FindBy(id="job")
    public WebElement dansLeSecteur;
    @FindBy(id="city")
    public WebElement votreVille;
    @FindBy(id="subjectcandidat")
    public WebElement vousSouhaitez;
    @FindBy(id="firstname")
    public WebElement prenom;
    @FindBy(id="lastname")
    public WebElement nom;
    @FindBy(id="email")
    public WebElement email;
     @FindBy(id="phone")
    public WebElement phone;
     @FindBy(id="message")
    public WebElement message;
     @FindBy(xpath = "//span[text()='Envoyer']")
    public WebElement envoyerBtn;
     @FindBy(xpath = "//div[text()='See you ']")
    public WebElement seeYou;

}
