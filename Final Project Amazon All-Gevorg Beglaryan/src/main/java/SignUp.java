import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import DriverFactory;
import SeleniumActions;
import Waiters;

public class SignUp extends HomePage{


    public int randomInt = (int)(Math.random()*10000);
    public String emailForSignUp = "gevorbeglaryan" + randomInt + "@gmail.com";

    @FindBy(xpath = "//*[@id=\"createAccountSubmit\"]" )
    public WebElement createYourAmazonAccountBTN;

    /*@FindBy(xpath = "//*[@id=\"a-page\"]" )
    public WebElement createAccountPopUp;*/

    @FindBy(xpath = "//*[@name=\"customerName\"]" )
    public WebElement customerNameField;

    @FindBy(xpath = "//form/div/div/div[1]/div/div/div")
    public WebElement requiredCustomerNameField;

    @FindBy(xpath = "//*[@class=\"a-input-text a-span12 a-spacing-micro auth-required-field auth-require-claim-validation\"]" )
    public WebElement mobileNumberOrEmailField;

    @FindBy(xpath = "//form/div/div/div[2]/div[3]/div/div")
    public WebElement invalidPhoneOrEmail;

    @FindBy(xpath = "//*[@class=\"a-input-text a-span12 auth-required-field auth-require-fields-match auth-require-password-validation\"]" )
    public WebElement SignUpPasswordField;

    /*@FindBy(xpath = "//form//div[3]/div[1]/div[2]/div/div")
    public WebElement invalidSignUpPassword;*/

    @FindBy(xpath = "//form//div[3]/div[1]/div[3]/div/div")
    public WebElement Minimum6CharacterRequirementPassword;

    @FindBy(xpath = "//*[@id="ap_password_check"]")
    public WebElement reEnterPasswordField;

    @FindBy(xpath = "//form//div[2]/div[2]/div/div")
    public WebElement notMatchPass;

    @FindBy(xpath = "//*[@href=\"/gp/help/customer/display.html/ref=ox_signin_condition_of_use?ie=UTF8&nodeId=508088\"]")
    public WebElement conditionsOfUseBTN;

    @FindBy(xpath = "//*[@class=\"cs-help-v4\"]")
    public WebElement conditionsOfUsePage;

    @FindBy(xpath = "//*[@class=\"/gp/help/customer/display.html/ref=ox_signin_privacy?ie=UTF8&nodeId=468496\"]")
    public WebElement privacyNoticeBTN;

    @FindBy(xpath = "//*[@class=\"cs-help-content\"]")
    public WebElement privacyNoticePage;

    @FindBy(xpath = "//*[@class=\"a-button-input\"]")
    public WebElement verificationBTN;

    @FindBy(xpath = "//*[@class=\"a-section\"]")
    public WebElement alreadyExistingEmailPage;

    @FindBy(xpath = "//*[@class=\"cvf-widget-form fwcim-form a-spacing-none\"]")
    public WebElement OTPPage;

    @FindBy(xpath = "//*[@name=\"code\"]")
    public WebElement enterOTPField; //489781

    @FindBy(xpath = "//*[@class=\"a-button-input\"]")
    public WebElement verifyOTPBTN;


    /*public void clickCreateYourAmazonAccountBTN() {
        SeleniumActions.clickOnElement(createYourAmazonAccountBTN);
    }*/

    //Check whether Create Account Pop Up is displayed or no
    public boolean isCreateAccountPopUpDisplayed(){
        return DriverFactory.getDriver().getCurrentUrl().contains("register");
    }

    //Check whether Required Customer Name Field is displayed for Sign Up or no
    public boolean isRequiredCustomerNameFieldDisplayed(){
        return requiredCustomerNameField.isDisplayed();
    }

    //Check whether Invalid Phone Or Email message is displayed for Sign Up or no
    public boolean isInvalidPhoneOrEmailDisplayed(){
        return invalidPhoneOrEmail.isDisplayed();
    }

    //Check whether Invalid Phone Or Email is displayed for Sign Up or no
    /*public boolean isInvalidSignUpPasswordDisplayed(){
        return invalidSignUpPassword.isDisplayed();
    }*/

    public boolean isMinimum6CharacterRequirementForPasswordDisplayed(){
        return Minimum6CharacterRequirementPassword.isDisplayed();
    }

    // Check whether passwords do not match error message is displayed or no
    public boolean isNotMatchPassesDisplayed() {
        return notMatchPass.isDisplayed();
    }

    //Check whether Conditions Of Use Page is displayed after clicking on Conditions of Use button
    public boolean isConditionsOfUsePageDisplayed(){
        SeleniumActions.clickOnElement(conditionsOfUseBTN);
        return conditionsOfUsePage.isDisplayed();
    }

    //Check whether Privacy Notice Page is displayed after clicking on Privacy Notice button
    public boolean isPrivacyNoticePageDisplayed(){
        SeleniumActions.clickOnElement(privacyNoticeBTN);
        return privacyNoticePage.isDisplayed();
    }

    public void clickVerificationBTN(){
        SeleniumActions.clickOnElement(verificationBTN);
    }

    //Check whether Email address already in use page is displayed or no
    public boolean isAlreadyExistingEmailPageDisplayed(){
        return alreadyExistingEmailPage.isDisplayed();
    }

    //Check whether OTP page is displayed or no
    public boolean isOTPPageDisplayed(){
        return OTPPage.isDisplayed();
    }

    //Check whether Country/Region button is displayed after entering OTP code and clicking on verify OTP button
    public boolean isCountryRegionBTNDisplayedAfterEnteringOTPCode(){
        SeleniumActions.sendKeysOnElement(enterOTPField,"489781");
        SeleniumActions.clickOnElement(verifyOTPBTN);
        Waiters.waitForVisibility(countryRegionBTN);
        return countryRegionBTN.isDisplayed();
    }

    //Redirecting to Sign Up
    public void redirectingToSignUpBTNAndClicking(){
        SeleniumActions.sendKeysOnElement(searchField, "Java Schildt 11 Edition");
        SeleniumActions.clickOnElement(searchBTN);
        SeleniumActions.clickOnElement(clickJavaBook11Edition);
        SeleniumActions.clickOnElement(buyNowBTN);
        SeleniumActions.clickOnElement(createYourAmazonAccountBTN);
    }

}
