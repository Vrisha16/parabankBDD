package com.parabank.pages;

import com.parabank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    //static WebDriver driver;
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='loginPanel']/p[2]/a")
    WebElement Registerlink;
    // By Registerlink = By.xpath("//div[@id='loginPanel']/p[2]/a");
    //By ClassName = ( By.className("Register") );
    @CacheLookup
    @FindBy(xpath = "//input[@id='customer.firstName']")
    WebElement Firstname;

    // By Firstname = ( By.xpath("//input[@id='customer.firstName']") );
    @CacheLookup
    @FindBy(xpath = "//input[@id='customer.lastName']")
    WebElement Lastname;
    // By Lastname = ( By.xpath("//input[@id='customer.lastName']") );
    @CacheLookup
    @FindBy(xpath = "//input[@id='customer.address.street']")
    WebElement AdressField;
    // By AdressField = ( By.xpath("//input[@id='customer.address.street']") );
    @CacheLookup
    @FindBy(xpath = "//input[@id='customer.address.city']")
    WebElement CityField;
    // By CityField = ( By.xpath("//input[@id='customer.address.city']") );
    @CacheLookup
    @FindBy(xpath = "//input[@id='customer.address.state']")
    WebElement StateField;
    // By StateField = ( By.xpath("//input[@id='customer.address.state']") );
    @CacheLookup
    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    WebElement ZipCodeField;
    // By ZipCodeField = ( By.xpath("//input[@id='customer.address.zipCode']") );
    @CacheLookup
    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    WebElement PhoneField;
    // By PhoneField = ( By.xpath("//input[@id='customer.phoneNumber']") );
    @CacheLookup
    @FindBy(xpath = "//input[@id='customer.ssn']")
    WebElement SSNField;
    // By SSNField = ( By.xpath("//input[@id='customer.ssn']") );
    @CacheLookup
    @FindBy(xpath = "//input[@id='customer.username']")
    WebElement UsernameField;
    //By UsernameField = ( By.xpath("//input[@id='customer.username']") );
    @CacheLookup
    @FindBy(xpath = "//input[@id='customer.password']")
    WebElement Passwordid;
    // By Passwordid = ( By.xpath("//input[@id='customer.password']") );
    @CacheLookup
    @FindBy(xpath = "//input[@id='repeatedPassword']")
    WebElement MsgField;
    // By MsgField = ( By.xpath("//input[@id='repeatedPassword']") );
    @CacheLookup
    @FindBy(xpath = "//input[@value='Register']")
    WebElement ClickButton;

    public static void navigateToHomePage() {
    }


    // By ClickButton = ( By.xpath("//input[@value='Register']") );

    public void Reglink() {
        clickOnElement(Registerlink);
    }

    // public void ClassName(){
    //clickOnElement(Register);
    public void Firstname(String fname1) {
        sendTextToElement(Firstname, fname1);
    }

    public void Lastname(String lname1) {
        sendTextToElement(Lastname, lname1);
    }

    public void AdressField(String adress1) {
        sendTextToElement(AdressField, adress1);
    }

    public void CityField(String cityname) {
        sendTextToElement(CityField, cityname);
    }

    public void StateField(String statename) {
        sendTextToElement(StateField, statename);
    }

    public void ZipCodeField(String Zipcode) {
        sendTextToElement(ZipCodeField, Zipcode);
    }

    public void PhoneField(String phone1) {
        sendTextToElement(PhoneField, phone1);
    }

    public void SSNField(String ssn) {
        sendTextToElement(SSNField, ssn);
    }

    public void UsernameField(String uname) {
        sendTextToElement(UsernameField, uname);
    }

    public void Passwordid(String password1) {
        sendTextToElement(Passwordid, password1);
    }

    public void MsgField(String msg) {
        sendTextToElement(MsgField, msg);
    }

    public void ClickButton(String ClickButton1) {
        sendTextToElement(ClickButton, ClickButton1);

    }
        public void registerpage ( ) {
            Reglink();
            Firstname("Jai");
            Lastname("patel");
            AdressField("20 laksh icon");
            CityField("Anand");
            StateField("gujarat");
            ZipCodeField("388520");
            PhoneField("07912345678");
            SSNField("1234");
            UsernameField("utisletap");
            Passwordid("Msm_2023");
            MsgField("Msm_2023");
            ClickButton("reglink");
        }
    }





































