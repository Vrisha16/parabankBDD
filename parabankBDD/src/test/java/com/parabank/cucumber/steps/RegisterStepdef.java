package com.parabank.cucumber.steps;

import com.parabank.pages.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class RegisterStepdef {
    @Given("^I am on the ParaBank home page$")
    public void iAmOnTheParaBankHomePage() {

    }

    @When("^I clickOnRegisterLink$")
    public void iClickOnRegisterLink() {
        new RegisterPage().Reglink();
    }

    @When("^I enter \"([^\"]*)\" as the first name$")
    public void iEnterAsTheFirstName(String fname1 )  {
        new RegisterPage().Firstname("Jai");
    }

    @And("^I enter \"([^\"]*)\" as the last name$")
    public void iEnterAsTheLastName(String lname1)  {
       new RegisterPage().Lastname("patel");
    }

    @And("^I enter \"([^\"]*)\" as the address$")
    public void iEnterAsTheAddress(String adress1)  {
        new RegisterPage().AdressField("20 laksh icon");
    }

    @And("^I enter \"([^\"]*)\" as the city$")
    public void iEnterAsTheCity(String cityname)  {
       new RegisterPage().CityField("Anand");
    }

    @And("^I enter \"([^\"]*)\" as the state$")
    public void iEnterAsTheState(String statename)  {
        new RegisterPage().StateField("gujarat");
    }

    @And("^I enter \"([^\"]*)\" as the zip code$")
    public void iEnterAsTheZipCode(String Zipcode)  {
    new RegisterPage().ZipCodeField("388520");
    }

    @And("^I enter \"([^\"]*)\" as the phone number$")
    public void iEnterAsThePhoneNumber(String phone1)  {
        new RegisterPage().PhoneField("07912345678");
    }

    @And("^I enter \"([^\"]*)\" as the SSN$")
    public void iEnterAsTheSSN(String ssn)  {
        new RegisterPage().SSNField("1234");
    }

    @And("^I enter \"([^\"]*)\" as the username$")
    public void iEnterAsTheUsername(String uname)  {
        new RegisterPage().UsernameField("utisletap@gmail.com");
    }

    @And("^I enter \"([^\"]*)\" as the password$")
    public void iEnterAsThePassword(String password1)  {
        new RegisterPage().Passwordid("Msm_2023");
    }

    @And("^I confirm the password as \"([^\"]*)\"$")
    public void iConfirmThePasswordAs(String msg)  {
        new RegisterPage().MsgField("Msm_2023");

    }

    @And("^I click on the \"([^\"]*)\" button$")
    public void iClickOnTheButton()  {
        new RegisterPage().ClickButton("reglink");
    }

    @Then("^I should see the text \"([^\"]*)\"$")
    public void iShouldSeeTheText(String text)  {
        Assert.assertEquals(text,new RegisterPage(),"Your account was created successfully.");
    }
}
