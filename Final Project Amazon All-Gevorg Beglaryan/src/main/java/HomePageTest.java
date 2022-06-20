import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import HomePage;


public class HomePageTest extends BaseTest {


    @BeforeMethod
    void openPage() {
        navigateToURI(" ");
    }

    @Test
    // Change "Search drop down list" to "Books" option
    void ChangeSearchDropDownToBooks(){
        HomePage homePage = new HomePage();

        homePage.changingSearchDropDownToBooks();
        Assert.assertTrue(homePage.isSearchDropDownChangedToBooks(),"There is issue when user changes Search drop down list to Books option");
    }

    @Test
    //Check whether "All" drop down menu pop up is displayed or no
    void AllDropDownMenuPopUpIsDisplayed(){
        HomePage homePage = new HomePage();

        homePage.clickAllNextToTodayDeals();
        Assert.assertTrue(homePage.isAllDropDownMenuVisible(), "All drop down menu is not displayed");
    }


    @Test
    //Check "Search" Result
    void searchResult(){
        HomePage homePage = new HomePage();

        Assert.assertTrue(homePage.searchFieldReturnsCorrectBooks(), "There is issue with search result");
    }

    @Test
    //Check if Java Book page is visible after clicking on Java book 11 Edition that is the first search result
    void isUserRedirectsToJavaBookEditionPage(){
        HomePage homePage = new HomePage();

        Assert.assertTrue(homePage.clickFirstResultJavaBook11Edition(),"There is issue when user clicks on the Java book 11 Edition image link");
    }

    @Test
    //Check whether Auth Portal Page is displayed after clicking on Buy Now button or no
    void authPortalPageIsDisplayed(){
        HomePage homePage = new HomePage();

        homePage.clickBuyNowBTN();
        Assert.assertTrue(homePage.isAuthPortalPageDisplayed(), "AuthPortalPage is not displayed after clicking on Buy Now button");
    }

    @Test
    //Sign In with already registered user
    void signInAlreadyRegisteredUser(){
        HomePage homePage = new HomePage();

        Assert.assertTrue(homePage.signInAlreadyRegisteredUser(),"There is issue when user wants to Sign In with already registered email address");
    }

    @Test
    // Check whether the country popup opens or no
    void isCountryRegionPopUpDisplayed(){
        HomePage homePage = new HomePage();

        homePage.selectCountryRegion();
        Assert.assertTrue(homePage.doesCountryRegionPopUpOpen(), "Country pop up does not open when clicking on Country/Region button");
    }

    @Test
    //Change Country/Region to Armenia
    void changingCountryRegionToArmenia(){
        HomePage homePage = new HomePage();

        homePage.changeCountryRegionToArmenia();
        Assert.assertTrue(homePage.doesCountryRegionChangedToArmenia(),"There is issue with changing Country/Region to Armenia";
    }

    @Test
    //Check whether invalid error message is displayed for All fields(Full Name,Street Address, City, Zip Code, Phone Number) when leaving empty
    void isInvalidErrorMessageDisplayedWhenLeavingFieldsEmpty(){
        HomePage homePage = new HomePage();
        SoftAssert softAssert = new SoftAssert();

        SeleniumActions.sendKeysOnElement(homePage.fullName,"");
        SeleniumActions.sendKeysOnElement(homePage.streetAddress,"");
        SeleniumActions.sendKeysOnElement(homePage.cityField,"");
        SeleniumActions.sendKeysOnElement(homePage.zipCodeField,"");
        SeleniumActions.sendKeysOnElement(homePage.phoneNumberField,"");
        homePage.clickAddressBTN();
        softAssert.assertTrue(homePage.isInvalidFullNameMessageDisplayed(),"Please enter a name, the required field error message is not displayed");
        softAssert.assertTrue(homePage.isInvalidStreetAddressMessageDisplayed(),"Please enter an address, the required field error message is not displayed");
        softAssert.assertTrue(homePage.isInvalidCityMessageDisplayed(),"Please enter a city name, the required field error message is not displayed");
        softAssert.assertTrue(homePage.isInvalidZipCodeMessageDisplayed(),"Please enter a ZIP or postal code, the required field error message is not displayed");
        softAssert.assertTrue(homePage.isInvalidPhoneNumberMessageDisplayed(),"Please enter a phone number so we can call if there are any issues with delivery, the required field error message is not displayed");
        softAssert.assertAll();
    }

    @Test
    //Check whether invalid error message is displayed for All fields(Full Name,Street Address, City, Zip Code, Phone Number) when inputting only spaces
    void isInvalidErrorMessageDisplayedForOnlySpaces(){
        HomePage homePage = new HomePage();
        SoftAssert softAssert = new SoftAssert();

        SeleniumActions.sendKeysOnElement(homePage.fullName,"       ");
        SeleniumActions.sendKeysOnElement(homePage.streetAddress,"      ");
        SeleniumActions.sendKeysOnElement(homePage.cityField,"     ");
        SeleniumActions.sendKeysOnElement(homePage.zipCodeField,"      ");
        SeleniumActions.sendKeysOnElement(homePage.phoneNumberField,"     ");
        homePage.clickAddressBTN();
        softAssert.assertTrue(homePage.isInvalidFullNameMessageDisplayed(),"Please enter a name, the required field error message is not displayed");
        softAssert.assertTrue(homePage.isInvalidStreetAddressMessageDisplayed(),"Please enter an address, the required field error message is not displayed");
        softAssert.assertTrue(homePage.isInvalidCityMessageDisplayed(),"Please enter a city name, the required field error message is not displayed");
        softAssert.assertTrue(homePage.isInvalidZipCodeMessageDisplayed(),"Please enter a ZIP or postal code, the required field error message is not displayed");
        softAssert.assertTrue(homePage.isInvalidPhoneNumberMessageDisplayed(),"Please enter a phone number so we can call if there are any issues with delivery, the required field error message is not displayed");
        softAssert.assertAll();
    }

    @Test
        //Check whether invalid error message is displayed for Zip Code field when inputting only letters
    void isInvalidErrorMessageDisplayedForZipCodeField(){
        HomePage homePage = new HomePage();

        SeleniumActions.cleanTextFromElement(homePage.fullName);
        SeleniumActions.sendKeysOnElement(homePage.fullName,"ABC");
        SeleniumActions.cleanTextFromElement(homePage.streetAddress);
        SeleniumActions.sendKeysOnElement(homePage.streetAddress,"CDE");
        SeleniumActions.cleanTextFromElement(homePage.cityField);
        SeleniumActions.sendKeysOnElement(homePage.cityField,"FGH");
        SeleniumActions.cleanTextFromElement(homePage.zipCodeField);
        SeleniumActions.sendKeysOnElement(homePage.zipCodeField,"IJK");
        SeleniumActions.cleanTextFromElement(homePage.phoneNumberField);
        SeleniumActions.sendKeysOnElement(homePage.phoneNumberField,"LMN");
        homePage.clickAddressBTN();
        Assert.assertTrue(homePage.isInvalidZipCodeMessageDisplayed(),"Please enter a valid ZIP or postal code, the required error message for Zip Code field is not displayed");
    }

    @Test
    //Check that after valid input for All fields(Full Name,Street Address, City, Zip Code, Phone Number), Credit or Debit Card button is displayed
    void afterValidInputCreditOrDebitCardBTNDisplayed(){
        HomePage homePage = new HomePage();

        SeleniumActions.cleanTextFromElement(homePage.fullName);
        SeleniumActions.sendKeysOnElement(homePage.fullName,"Gevorg Beglaryan");
        SeleniumActions.cleanTextFromElement(homePage.streetAddress);
        SeleniumActions.sendKeysOnElement(homePage.streetAddress,"Arabkir");
        SeleniumActions.cleanTextFromElement(homePage.cityField);
        SeleniumActions.sendKeysOnElement(homePage.cityField,"Yerevan");
        SeleniumActions.cleanTextFromElement(homePage.zipCodeField);
        SeleniumActions.sendKeysOnElement(homePage.zipCodeField,"0010");
        SeleniumActions.cleanTextFromElement(homePage.phoneNumberField);
        SeleniumActions.sendKeysOnElement(homePage.phoneNumberField,"098123456");
        homePage.clickAddressBTN();
        Assert.assertTrue(homePage.isCreditOrDebitCardBTNDisplayed(),"Credit or Debit Card button is not displayed after valid input in all fields");
    }

    @Test
    //Check whether Credit Or Debit Card Page is visible
    void isUserRedirectsToCreditOrDebitCardPage(){
        HomePage homePage = new HomePage();

        homePage.clickCreditOrDebitCardBTN();
        Assert.assertTrue(homePage.isCreditOrDebitCardPageDisplayed(),"Credit Or Debit Card Page is not displayed after clicking on Credit Or Debit Card button");
    }

    @Test
    //Check whether invalid error message is displayed for All fields in the Credit Or Debit Card Page(Card number,Name on card, ExpirationDateMonth, ExpirationDateYear, Phone Number) when inputting invalid data
    void isInvalidErrorMessageDisplayedInCreditOrDebitCardPage(){
        HomePage homePage = new HomePage();
        SoftAssert softAssert = new SoftAssert();

        SeleniumActions.sendKeysOnElement(homePage.cardNumber,""); //leave empty
        SeleniumActions.sendKeysOnElement(homePage.NameOnCard,""); //leave empty
        SeleniumActions.sendKeysOnElement(homePage.securityCodeCVVCVC,""); //leave empty
        homePage.clickAddressBTN();
        softAssert.assertTrue(homePage.isInvalidCardNumberMessageDisplayed(),"Card number is required error message is not displayed");
        softAssert.assertTrue(homePage.isInvalidNameOnCardMessageDisplayed(),"Cardholder's name is required error message is not displayed");
        softAssert.assertTrue(homePage.isInvalidExpirationDateMonthMessageDisplayed(),"Expiration date is not correct error message is not displayed");
        softAssert.assertTrue(homePage.isInvalidExpirationDateYearMessageDisplayed(),"Expiration date is not correct error message is not displayed");
        softAssert.assertTrue(homePage.isInvalidSecurityCodeCVVCVCMessageDisplayed(),"Security code (CVV) is not correct, Look for the 3-digit code on the back of the card, near the signature line error message is not displayed");

        SeleniumActions.sendKeysOnElement(homePage.cardNumber,"12345678791011121314"); //more than 16 digits
        SeleniumActions.sendKeysOnElement(homePage.NameOnCard,"123"); //only digits //there is a bug
        SeleniumActions.clickOnElement(homePage.expirationDateMonth);
        SeleniumActions.clickOnElement(homePage.expirationDateMonthMay);
        SeleniumActions.sendKeysOnElement(homePage.securityCodeCVVCVC,"123"); // random digits //there is a bug
        homePage.clickAddressBTN();
        softAssert.assertTrue(homePage.isInvalidCardNumberMessageDisplayed(),"Card number is required error message is not displayed");
        softAssert.assertTrue(homePage.isInvalidNameOnCardMessageDisplayed(),"Cardholder's name is required error message is not displayed");
        softAssert.assertTrue(homePage.isInvalidExpirationDateMonthMessageDisplayed(),"Expiration date is not correct error message is not displayed");
        softAssert.assertTrue(homePage.isInvalidSecurityCodeCVVCVCMessageDisplayed(),"Security code (CVV) is not correct, Look for the 3-digit code on the back of the card, near the signature line error message is not displayed");

        SeleniumActions.cleanTextFromElement(homePage.cardNumber);
        SeleniumActions.sendKeysOnElement(homePage.cardNumber,"123456789101112"); //less than 16 digits (15 digits)
        SeleniumActions.cleanTextFromElement(homePage.NameOnCard);
        SeleniumActions.sendKeysOnElement(homePage.NameOnCard,"ABC"); //random letters // there is a bug
        SeleniumActions.cleanTextFromElement(homePage.expirationDateMonth);
        SeleniumActions.clickOnElement(homePage.expirationDateMonth);
        SeleniumActions.clickOnElement(homePage.expirationDateMonthMay);
        SeleniumActions.clickOnElement(homePage.expirationDateYear);
        SeleniumActions.clickOnElement(homePage.expirationDateYear2042);
        SeleniumActions.sendKeysOnElement(homePage.securityCodeCVVCVC,"1234"); //more than 3 digits //there is a bug
        homePage.clickAddressBTN();
        softAssert.assertTrue(homePage.isInvalidCardNumberMessageDisplayed(),"Card number is required error message is not displayed");
        softAssert.assertTrue(homePage.isInvalidNameOnCardMessageDisplayed(),"Cardholder's name is required error message is not displayed");
        softAssert.assertTrue(homePage.isInvalidExpirationDateMonthMessageDisplayed(),"Expiration date is not correct error message is not displayed");
        softAssert.assertTrue(homePage.isInvalidExpirationDateYearMessageDisplayed(),"Expiration date is not correct error message is not displayed");
        softAssert.assertTrue(homePage.isInvalidSecurityCodeCVVCVCMessageDisplayed(),"Security code (CVV) is not correct, Look for the 3-digit code on the back of the card, near the signature line error message is not displayed");

        softAssert.assertAll();
    }


    @Test
    //Check that user does not redirect to the same Credit Or Debit Card Page after clicking on cancel button from Credit Or Debit Card Page
    void notBackToCreditOrDebitCardPage(){
        HomePage homePage = new HomePage();

        homePage.clickCancelCreditDebitBTN();
        Assert.assertFalse(homePage.isAddACreditOrDebitCardPageDisplayed(), "Credit Or Debit Card Page is still displayed");
    }

    @Test
    //Check whether Master Card Radio button Page is displayed or not displayed after inputting valid data in Credit Or Debit Card Page
    void isMasterCardRadioButtonPageDisplayed(){
        HomePage homePage = new HomePage();

        homePage.clickCreditOrDebitCardBTN();
        SeleniumActions.sendKeysOnElement(homePage.cardNumber,"5450570001026000");
        SeleniumActions.sendKeysOnElement(homePage.NameOnCard,"Gevorg Beglaryan");
        homePage.changeExpirationDateMonthToJune();
        homePage.clickAddYourCardBTN();
        Assert.assertTrue(homePage.isMasterCardRadioBTNPageDisplayed(), " There is issue with displaying Master Card Radio button Page");
    }

    @Test
    //Check whether Different Currency Pop Up is visible or no
    void isDifferentCurrencyPopUpDisplayed(){
        HomePage homePage = new HomePage();

        homePage.clickRadioButtonDifferentCurrencyOption();
        Assert.assertTrue(homePage.isDifferentCurrencyPopUpVisible(),"There is issue with displaying Different currency pop up");
    }

    @Test
    //Check if the currency is changed to USD
    void isCurrencyChangedToUSD(){
        HomePage homePage = new HomePage();

        homePage.changeCurrencyToUSD();
        Assert.assertTrue(homePage.isCurrencyChangedToUSD(), "There is issue with changing currency to USD");
    }

    @Test
    //Check whether Use This Address button is displayed after clicking on Continue button
    void isUseThisAddressButtonDisplayed(){
        HomePage homePage = new HomePage();

        homePage.clickOnContinueBTNCurrency();
        Assert.assertTrue(homePage.isUseThisAddressBTNVisible(), "There is issue with displaying Use this address button");
    }

    @Test
    //Check whether Place Your Order Page is displayed after clicking on Use this address button
    void isPlaceYourOrderPageDisplayed(){
        HomePage homePage = new HomePage();

        homePage.clickOnUseThisAddressBTN();
        Assert.assertTrue(homePage.isPlaceYourOrderPageVisible(), "There is issue with displaying Place Your Order Page");
    }

    @Test
    //Check whether Order Placed message is displayed after clicking on place your order button
    void isOrderPlacedMessageDisplayed(){
        HomePage homePage = new HomePage();

        homePage.clickPlaceYourOrderBTN();
        Assert.assertTrue(homePage.isOrderPlacedMessageDisplayed(), "There is issue with displaying Order Placed message");
    }

}
