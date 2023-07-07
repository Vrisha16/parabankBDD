Feature: User Registration



  Scenario: User should register account successfully
    Given I am on the ParaBank home page
    When I clickOnRegisterLink
    When I enter "Jai" as the first name
    And I enter "Patel" as the last name
    And I enter "20 laksh icon" as the address
    And I enter "Anand" as the city
    And I enter "Gujarat" as the state
    And I enter "388520" as the zip code
    And I enter "07912345678" as the phone number
    And I enter "1234" as the SSN
    And I enter "utisletap@gmail.com" as the username
    And I enter "Msm_2023" as the password
    And I confirm the password as "Msm_2023"
    And I click on the "REGISTER" button
    Then I should see the text "Your account was created successfully. You are now logged in."
