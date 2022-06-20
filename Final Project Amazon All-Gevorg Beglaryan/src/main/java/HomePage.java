import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import DriverFactory;
import SeleniumActions;
import Waiters;



public class HomePage {

    public HomePage() {
        PageFactory.initElements(DriverFactory.getDriver(),this);
    }

    JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getDriver();


    @FindBy(xpath = "//*[@id="searchDropdownBox"]//*[@class=\"nav-search-facade\"]" )
    public WebElement searchDropdownBTN;

    @FindBy(xpath = "//form//option[6]" )
    public WebElement optionBooksSelected;

    @FindBy(xpath = "//*[@class = \"nav-search-label nav-progressive-content\"]" )
    public WebElement optionLabel;

    @FindBy(xpath = "//*[@id=\"nav-search-submit-button\"]" )
    public WebElement searchBTN;

    @FindBy(xpath = "//*[@class=\"hm-icon-label\"]" )
    public WebElement allDropDownBTN;

    @FindBy(xpath = "//*[@class=\"hmenu hmenu-visible\"]" )
    public WebElement dropDownMenu;

    @FindBy(xpath = "//*[@id = \"twotabsearchtextbox\"]")
    public WebElement searchField;

    @FindBy(xpath = "//*[@class=\"rush-component s-latency-cf-section\"]" )
    public WebElement searchResultBooksDataPage;

    @FindBy(xpath = "//*[@class=\"s-image\"]" )
    public WebElement clickJavaBook11Edition;

    @FindBy(xpath = "//*[@class=\"a-container\"]" )
    public WebElement javaBook11EditionPage;

    @FindBy(xpath = "//*[@id=\"buy-now-button\"]" )
    public WebElement buyNowBTN;

    @FindBy(xpath = "//*[@id=\"authportal-main-section\"]" )
    public WebElement authPortalPage;

    @FindBy(xpath = "//*[@id=\"ap_email\"]" )
    public WebElement emailField;

    @FindBy(xpath = "//*[@id=\"continue\"]" )
    public WebElement continueBTN;

    @FindBy(xpath = "//*[@id=\"ap_password\"]")
    public WebElement passwordField;

    @FindBy(xpath = "//*[@class=\"a-button-input\"]")
    public WebElement signInBTN;

    @FindBy(xpath = "//*[@class=\"a-button-text a-declarative\"]")
    public WebElement countryRegionBTN;

    @FindBy(xpath = "//*[@class = \"a-popover-inner\"]")
    public WebElement countryRegionPopUp;

    @FindBy(xpath = "//*[@data-value = \"AM\"]")
    public WebElement countryRegionArmeniaBTN;

    @FindBy(xpath = "//form//div[2]/span/span/span/span")
    public WebElement countryRegionArmeniaSelected;

    @FindBy(xpath = "//*[@id=\"address-ui-widgets-enterAddressFullName\"]")
    public WebElement fullName;

    @FindBy(xpath = "//form//div[4]/div/div/div/div/div")
    public WebElement invalidFullName;

    @FindBy(xpath = "//*[@id=\"address-ui-widgets-enterAddressLine1\"]")
    public WebElement streetAddress;

    @FindBy(xpath = "//*[@class=\"a-input-text a-form-error address-ui-widgets-desktop-form-field-full-width addrui-form-text-input-error\"]")
    public WebElement invalidStreetAddress;

    @FindBy(xpath = "//*[@id=\"address-ui-widgets-enterAddressCity\"]")
    public WebElement cityField;

    @FindBy(xpath = "//form//div[10]/div/div[1]/div/div/div")
    public WebElement invalidCityField;

    @FindBy(xpath = "//*[@id=\"address-ui-widgets-enterAddressPostalCode\"]")
    public WebElement zipCodeField;

    @FindBy(xpath = "//form//div[14]/div/div[1]/div/div/div")
    public WebElement invalidZipCodeField;

    @FindBy(xpath = "//*[@id=\"address-ui-widgets-enterAddressPhoneNumber\"] ")
    public WebElement phoneNumberField;

    @FindBy(xpath = "//form//div[16]/div[2]/div/div/div/div")
    public WebElement invalidPhoneNumberField;

    /*@FindBy(xpath = "//*[@id=\"address-ui-widgets-use-as-my-default\"]")
    public WebElement checkMark;*/

    @FindBy(xpath = "//*[@class=\"a-button-input\"]")
    public WebElement addressBTN;



    @FindBy(xpath = "//div[2]/div/div/span/span[1]/span/input" )
    public WebElement creditOrDebitCardBTN;

    @FindBy(xpath = "//*[@class = \"a-popover-wrapper\"]")
    public WebElement creditOrDebitPage;

    @FindBy(xpath = "//*[@class=\"a-input-text a-form-normal\"]" )
    public WebElement cardNumber;

    @FindBy(xpath = "//form//li/span" )
    public WebElement invalidCardNumber;

    @FindBy(xpath = "//form//div[2]/div[2]/input" )
    public WebElement NameOnCard;

    @FindBy(xpath = "//form//li[2]/span" )
    public WebElement invalidNameOnCard;

    @FindBy(xpath = "//form//div[2]/div[1]/span[1]/span/span/span" )
    public WebElement expirationDateMonth;

    @FindBy(xpath = "//form//li[3]/span" )
    public WebElement invalidExpirationDateMonth;

    @FindBy(xpath = "//li[5]/a" )
    public WebElement expirationDateMonthMay;

    @FindBy(xpath = "//li[6]/a" )
    public WebElement expirationDateMonthJune;

    @FindBy(xpath = "//form//span[3]/span/span/span" )
    public WebElement expirationDateYear;

    @FindBy(xpath = "//li[21]/a" )
    public WebElement expirationDateYear2042;

    @FindBy(xpath = "//form//li[3]/span" )
    public WebElement invalidExpirationDateYear;

    @FindBy(xpath = "//form//div[4]//input[1]" )
    public WebElement securityCodeCVVCVC;

    @FindBy(xpath = "//form//li[4]/span" )
    public WebElement invalidSecurityCodeCVVCVC;

    @FindBy(xpath = "//*[@name=\"ppw-widgetEvent:AddCreditCardEvent\"]" )
    public WebElement AddYourCardBTN;

    @FindBy(xpath = "//*[@name=\"ppw-widgetEvent:CancelAddCreditCardEvent\"]" )
    public WebElement cancelCreditDebitBTN;

    @FindBy(xpath = "//*[@class = \"a-popover a-popover-modal a-declarative\"]" ) // in progress
    public WebElement addACreditOrDebitCardPage;

    @FindBy(xpath = "//form//div[2]/div[3]/div/div/div/div[1]/div" )
    public WebElement MasterCardRadioBTNPage;

    @FindBy(xpath = "//form//div[3]/div/label/input")
    public WebElement radioButtonDifferentCurrencyOption;

    @FindBy(xpath = "//*[@class = \"a-dropdown-prompt\"]")
    public WebElement selectCardCurrencyBTN;

    @FindBy(xpath = "//*[@class = \"a-nostyle a-list-link\"]")
    public WebElement differentCurrencyPopUp;

    @FindBy(xpath = "//div[8]/div/div/ul/li[4]/a")
    public WebElement usDollarOption;

    @FindBy(xpath = "//*[@class = \"a-dropdown-prompt\"]")
    public WebElement CurrencyChangedToUSD;

    @FindBy(xpath = "//*[@name=\"ppw-widgetEvent:SetPaymentPlanSelectContinueEvent\"]")
    public WebElement continueBTNCurrency;

    @FindBy(xpath = "//*[@class=\"a-declarative a-button-text checkout-continue-link\"]")
    public WebElement useThisAddressBTN;

    @FindBy(xpath = "//*[@class=\"checkout spc desktop locale-us  spc-desktop\"]")
    public WebElement placeYourOrderPage;

    @FindBy(xpath = "//*[@class=\"a-button-text place-your-order-button\"]")
    public WebElement placeYourOrderBTN;

    //Check whether Order Placed message is displayed after clicking on place your order button
    @FindBy(xpath = "//*[@class=\"a-color-success\"]" )
    public WebElement orderPlacedPageMessage;



    // Change "Search drop down list" to "Books" option
    public void changingSearchDropDownToBooks(){
        SeleniumActions.clickOnElement(searchDropdownBTN);
        SeleniumActions.clickOnElement(optionBooksSelected);
    }

    // Check if the "Search drop down list" is changed to Books option
    public boolean isSearchDropDownChangedToBooks() {
        return optionLabel.getText().equals("Books");
    }


    // click "All" drop down list next to Today's Deals button
    public void clickAllNextToTodayDeals(){
        SeleniumActions.clickOnElement(allDropDownBTN);
    }

    //Check whether "All" drop down menu is displayed or no
    public boolean isAllDropDownMenuVisible(){
        return dropDownMenu.isDisplayed();
    }


    //Check "Search" Result
    public boolean searchFieldReturnsCorrectBooks(){
        SeleniumActions.sendKeysOnElement(searchField, "Java Schildt 11 Edition");
        SeleniumActions.clickOnElement(searchBTN);
        Waiters.waitForVisibility(searchResultBooksDataPage);
        return searchResultBooksDataPage.isDisplayed();
    }

    //Check if Java Book page is visible after clicking on Java book 11 Edition that is the first search result
    public boolean clickFirstResultJavaBook11Edition(){
        SeleniumActions.clickOnElement(clickJavaBook11Edition);
        Waiters.waitForVisibility(javaBook11EditionPage);
        return DriverFactory.getDriver().getCurrentUrl().contains("Java+Schildt+11+Edition");

    }

    //Click on Buy Now button
    public void clickBuyNowBTN(){
        SeleniumActions.clickOnElement(buyNowBTN);
    }

    //Check whether authPortalPage is displayed after clicking on Buy Now button or no
    public boolean isAuthPortalPageDisplayed(){
        return authPortalPage.isDisplayed();
    }

    //Sign In with already registered user
    public boolean signInAlreadyRegisteredUser(){
        SeleniumActions.sendKeysOnElement(emailField, "ge.beglaryan@gmail.com");
        SeleniumActions.clickOnElement(continueBTN);
        SeleniumActions.sendKeysOnElement(passwordField, "Gevorg1991");
        SeleniumActions.clickOnElement(signInBTN);
        Waiters.waitForVisibility(countryRegionBTN);
        return countryRegionBTN.isDisplayed();
    }

    //Select a shipping address
    public void selectCountryRegion(){
        SeleniumActions.clickOnElement(countryRegionBTN);
    }

    // Check whether the country popup opens or no
    public boolean doesCountryRegionPopUpOpen(){
        return countryRegionPopUp.isDisplayed();
    }

    //Change Country/Region to Armenia
    public void changeCountryRegionToArmenia(){
        SeleniumActions.clickOnElement(countryRegionBTN);
        SeleniumActions.clickOnElement(countryRegionArmeniaBTN);
    }

    //Check if Country/Region is changed to Armenia or no
    public boolean doesCountryRegionChangedToArmenia(){
        return countryRegionArmeniaSelected.isDisplayed();
    }

    //Check whether invalid error message is displayed for Full Name field
    public boolean isInvalidFullNameMessageDisplayed(){
        return invalidFullName.isDisplayed();
    }

    //Check whether invalid error message is displayed for Street Address Field
    public boolean isInvalidStreetAddressMessageDisplayed(){
        return invalidStreetAddress.isDisplayed();
    }

    //Check whether invalid error message is displayed for City Field
    public boolean isInvalidCityMessageDisplayed(){
        return invalidCityField.isDisplayed();
    }

    //Check whether invalid error message is displayed for Zip Code Field
    public boolean isInvalidZipCodeMessageDisplayed(){
        return invalidZipCodeField.isDisplayed();
    }

    //Check whether invalid error message is displayed for Phone Number Field
    public boolean isInvalidPhoneNumberMessageDisplayed(){
        return invalidPhoneNumberField.isDisplayed();
    }

    //Click address button
    public void clickAddressBTN(){
        SeleniumActions.clickOnElement(addressBTN);
    }

    //Check whether Credit Or Debit Card button is displayed
    public boolean isCreditOrDebitCardBTNDisplayed(){
        return creditOrDebitCardBTN.isDisplayed();
    }

    //Click on Credit Or Debit Card button
    public void clickCreditOrDebitCardBTN(){
        SeleniumActions.clickOnElement(creditOrDebitCardBTN);
    }

    //Check whether Credit Or Debit Card Page is visible
    public boolean isCreditOrDebitCardPageDisplayed(){
        return creditOrDebitPage.isDisplayed();
    }

    //Check whether invalid error message is displayed for Card Number Field
    public boolean isInvalidCardNumberMessageDisplayed(){
        return invalidCardNumber.isDisplayed();
    }

    //Check whether invalid error message is displayed for Name On Card Field
    public boolean isInvalidNameOnCardMessageDisplayed(){
        return invalidNameOnCard.isDisplayed();
    }

    //Check whether invalid error message is displayed for Expiration Date Month
    public boolean isInvalidExpirationDateMonthMessageDisplayed(){
        return invalidExpirationDateMonth.isDisplayed();
    }

    //Change Expiration Date Month to June
    public void changeExpirationDateMonthToJune(){
        SeleniumActions.clickOnElement(expirationDateMonth);
        SeleniumActions.clickOnElement(expirationDateMonthJune);
    }

    //Check whether invalid error message is displayed for Expiration Date Year
    public boolean isInvalidExpirationDateYearMessageDisplayed(){
        return invalidExpirationDateYear.isDisplayed();
    }

    //Check whether invalid error message is displayed for Security Code(CVV/CVC)
    public boolean isInvalidSecurityCodeCVVCVCMessageDisplayed(){
        return invalidSecurityCodeCVVCVC.isDisplayed();
    }

    //Click on Cancel button in the Add a Credit Card Or Debit Card pop up page
    public void clickCancelCreditDebitBTN(){
        SeleniumActions.clickOnElement(cancelCreditDebitBTN);
    }

    //Check Add A Credit Or Debit Card Page Displayed // Assert.assertFalse()
    public boolean isAddACreditOrDebitCardPageDisplayed(){
        return addACreditOrDebitCardPage.isDisplayed();
    }

    //Click Add Your Card button
    public void clickAddYourCardBTN(){
        SeleniumActions.clickOnElement(AddYourCardBTN);
    }

    //Check whether Master Card Radio button Page is displayed or no
    public boolean isMasterCardRadioBTNPageDisplayed(){
        return MasterCardRadioBTNPage.isDisplayed();
    }

    //CLick on radio button different currency option
    public void clickRadioButtonDifferentCurrencyOption(){
        SeleniumActions.clickOnElement(radioButtonDifferentCurrencyOption);
        SeleniumActions.clickOnElement(selectCardCurrencyBTN);
    }

    //Check whether Different Currency Pop Up is visible or no
    public boolean isDifferentCurrencyPopUpVisible(){
        return differentCurrencyPopUp.isDisplayed();
    }

    //Change currency to USD
    public void changeCurrencyToUSD(){
        SeleniumActions.clickOnElement(radioButtonDifferentCurrencyOption);
        SeleniumActions.clickOnElement(selectCardCurrencyBTN);
        SeleniumActions.clickOnElement(usDollarOption);
    }

    //Check if the currency is changed to USD
    public boolean isCurrencyChangedToUSD(){
        return CurrencyChangedToUSD.isDisplayed();
    }

    //Click on Continue button
    public void clickOnContinueBTNCurrency(){
        SeleniumActions.clickOnElement(continueBTNCurrency);
    }

    //Check whether Use This Address button is displayed after clicking on Continue button
    public boolean isUseThisAddressBTNVisible(){
        return useThisAddressBTN.isDisplayed();
    }

    public void clickOnUseThisAddressBTN(){
        SeleniumActions.clickOnElement(useThisAddressBTN);
    }

    //Check whether Place Your Order Page is displayed after clicking on Use this address button
    public boolean isPlaceYourOrderPageVisible(){
        return placeYourOrderPage.isDisplayed();
    }

    public void clickPlaceYourOrderBTN(){
        SeleniumActions.clickOnElement(placeYourOrderBTN);
    }

    public boolean isOrderPlacedMessageDisplayed(){
        return orderPlacedPageMessage.isDisplayed();
    }

}
