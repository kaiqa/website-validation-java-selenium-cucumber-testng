package pages;

import main.CucumberRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.openqa.selenium.remote.http.HttpClient.USER_AGENT;


public class SearchPage extends CucumberRunner {

    @FindBy(xpath="//*[@id=\"token-input-QueryDescriptor_AdvancedSearchOptions_ArtistCriteria_InvolvedMakerName\"]")
    public WebElement advancedSearchPageFieldName;

    @FindBy(xpath="//*[@id=\"QueryDescriptor_AdvancedSearchOptions_ObjectCriteria_Title\"]")
    public WebElement advancedSearchPageFieldTitle;

    @FindBy(xpath="//*[@id=\"QueryDescriptor_AdvancedSearchOptions_ObjectCriteria_ShowImage\"]")
    public WebElement advancedSearchPageCheckBoxOnlyWithImages;

    @FindBy(xpath="//*[@id=\"QueryDescriptor_AdvancedSearchOptions_ObjectCriteria_DatingPeriod_StartDate\"]")
    public WebElement advancedSearchPageFieldStartYear;

    @FindBy(xpath="//*[@id=\"QueryDescriptor_AdvancedSearchOptions_ObjectCriteria_DatingPeriod_EndDate\"]")
    public WebElement advancedSearchPageFieldEndYear;

    @FindBy(xpath="//html/body/div[2]/section/form/div[2]/section[4]/div/fieldset/input")
    public WebElement advancedSearchPageButtonFind;


    public SearchPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String advancedSearchUrl()
    {
         String url = driver.getCurrentUrl();
         return url + "/search/advanced";
    }

    public String getUrl(String request) throws IOException
    {
        URL obj = new URL(request);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        int responseCode = con.getResponseCode();
        System.out.println("Response Code: " + responseCode);
        String response = Integer.toString(responseCode);

        return response ;
    }



}
