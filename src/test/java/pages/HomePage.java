package pages;

import main.CucumberRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CucumberRunner {

    WebDriver driver;
    @FindBy(xpath="/html/body/header/div/nav/div[2]/nav/button/span[1]")

    public WebElement homePageButtonLogin;

    @FindBy(xpath="/html/body/div[2]/form/button")
    public WebElement homePageButtonCookieAccept;

    @FindBy(id="email")
    public WebElement homePageLoginFormFieldEmail;

    @FindBy(id="wachtwoord")
    public WebElement homePageLoginFormFieldPassword;

    @FindBy(xpath="/html/body/div[6]/section/section[2]/div[1]/div/form/fieldset/ol/li[4]/input")
    public WebElement homePageLoginFormFieldButtonLogin;
// sign up
    @FindBy(xpath="//html/body/div[6]/section/section[2]/div[2]/p/button")
    public WebElement  homePageLoginFormSignUpLink;

    @FindBy(xpath="//html/body/div[6]/section/section[3]/div/section[2]/p/button")
    public WebElement  homePageLoginFormSButtonCreateAccount;

    @FindBy(id="register_name")
    public WebElement homePageLoginFormFieldRegisterName;

    @FindBy(id="register_password")
    public WebElement homePageLoginFormFieldRegisterPassword;

    @FindBy(id="register_password2")
    public WebElement  homePageLoginFormFieldRegisterPasswordRepeat;

    @FindBy(id="register_email")
    public WebElement homePageLoginFormFieldRegisterEmail;

    @FindBy(xpath="//label[@for='signupfornewsletter']")
    public WebElement homePageLoginFormRegisterTickBox;

    @FindBy(xpath="//html/body/div[6]/section/section[4]/form/fieldset[4]/input")
    public WebElement homePageLoginFormButtonSignUp;
    // sign up end
    @FindBy(xpath="/html/body/header/div/nav/div[2]/nav/a/span")
    public WebElement homePageHeaderButtonProfile;

    @FindBy(xpath="/html/body/header/div/nav/nav/form/input[2]")
    public WebElement homePageHeaderButtonSearch;

    @FindBy(xpath="//*[@id=\"site-header-search\"]")
    public WebElement homePageHeaderFieldSearch;

    @FindBy(xpath="//*[@data-title='The Milkmaid']")
    public WebElement searchPageResultMilkmaid;

    @FindBy(xpath="//html/body/div[6]/section/div/div[1]/div/p/a")
    public WebElement searchPageResultModalDialogButtonMyFirstCollection;

    @FindBy(xpath="//*[@class='link-reverse']")
    public WebElement collectionPageMyFirstCollectionPictureText;

    @FindBy(xpath="//html/body/div[6]/section/article/nav/div[2]/ul/li[3]/button")
    public WebElement collectionPageDialogButtonGetStarted;

    @FindBy(xpath="//html/body/div[6]/section/article/div[1]/button")
    public WebElement collectionPageDialogButtonStartTheTourCloseWithX;

    @FindBy(xpath="//html/body/div[6]/section/div/button")
    public WebElement collectionPageDialogButtonFirstTimeHintCloseWithX;

    @FindBy(xpath="/html/body/div[2]/section/div[3]/section/div/div/div[2]/figure/figcaption/h2/a")
    public WebElement collectionPageListItemTitleMilkmaid;

    @FindBy(xpath="//html/body/div[2]/section/div[3]/section/div/div/div[2]/figure/figcaption/p[1]")
    public WebElement collectionPageListItemAuthorMilkmaid;


    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Get the title from Home Page
    public String getHomePageTitle(){
    return  driver.getTitle().toString();
    }

}