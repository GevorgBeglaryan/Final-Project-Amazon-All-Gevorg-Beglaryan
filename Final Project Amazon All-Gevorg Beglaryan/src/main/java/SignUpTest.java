import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import SignUp;
import DriverFactory;
import SeleniumActions;
import Waiters;

public class SignUpTest extends HomePageTest{

    @Test
    //Check whether Create Account Pop Up is displayed or no
    void isCreateAccountPopUpDisplayed(){
        SignUp signUp = new SignUp();

        signUp.redirectingToSignUpBTNAndClicking();
        Assert.assertTrue(signUp.isCreateAccountPopUpDisplayed(),"There is issue with displaying Create Account Pop Up");
    }

    @Test
    //Check whether Invalid message is displayed for Sign Up(Your name, Mobile number or email, Password fields) or no
    void isInvalidMessageDisplayedForSignUpFields(){
        SignUp signUp = new SignUp();
        SoftAssert softAssert = new SoftAssert();

        signUp.redirectingToSignUpBTNAndClicking();
        SeleniumActions.sendKeysOnElement(signUp.customerNameField,"");//leave empty
        SeleniumActions.sendKeysOnElement(signUp.mobileNumberOrEmailField,"");//leave empty
        SeleniumActions.sendKeysOnElement(signUp.SignUpPasswordField,"");//leave empty
        signUp.clickVerificationBTN();
        softAssert.assertTrue(signUp.isRequiredCustomerNameFieldDisplayed(),"Enter your name, the required field error message is not displayed");
        softAssert.assertTrue(signUp.isInvalidPhoneOrEmailDisplayed(),"Enter your email or mobile phone number, the required field error message is not displayed");
        softAssert.assertTrue(signUp.isMinimum6CharacterRequirementForPasswordDisplayed(),"Minimum 6 characters required, the required field error message is not displayed");
        softAssert.assertAll();
    }

    @Test
    //Check whether invalid error message is displayed for All fields for Sign Up(Your name, Mobile number or email, Password fields) when inputting only spaces
    void isInvalidErrorMessageDisplayedForSignUpOnlySpaces(){
        SignUp signUp = new SignUp();
        SoftAssert softAssert = new SoftAssert();

        SeleniumActions.sendKeysOnElement(signUp.customerNameField,"       "); //input only spaces
        SeleniumActions.sendKeysOnElement(signUp.mobileNumberOrEmailField,"      "); //input only spaces
        SeleniumActions.sendKeysOnElement(signUp.SignUpPasswordField,"     "); //input 5 spaces
        SeleniumActions.sendKeysOnElement(signUp.reEnterPasswordField,"     "); //input 5 spaces
        signUp.clickVerificationBTN();
        softAssert.assertTrue(signUp.isRequiredCustomerNameFieldDisplayed(),"Enter your name, the required field error message is not displayed");
        softAssert.assertTrue(signUp.isInvalidPhoneOrEmailDisplayed(),"Enter your email or mobile phone number, the required field error message is not displayed");
        softAssert.assertTrue(signUp.isMinimum6CharacterRequirementForPasswordDisplayed(),"Minimum 6 characters required, the required field error message is not displayed");
        softAssert.assertAll();
    }

    @Test
    //Check whether passwords do not match error message is displayed
    void notMatchPassesSignUp(){
        SignUp signUp = new SignUp();
        SoftAssert softAssert = new SoftAssert();

        SeleniumActions.cleanTextFromElement(signUp.customerNameField);
        SeleniumActions.sendKeysOnElement(signUp.customerNameField,"ABC");
        SeleniumActions.cleanTextFromElement(signUp.mobileNumberOrEmailField);
        SeleniumActions.sendKeysOnElement(signUp.mobileNumberOrEmailField,"azb.gevorg@gmail.com");
        SeleniumActions.cleanTextFromElement(signUp.SignUpPasswordField);
        SeleniumActions.sendKeysOnElement(signUp.SignUpPasswordField,"123456");
        SeleniumActions.sendKeysOnElement(signUp.reEnterPasswordField,"1");
        signUp.clickVerificationBTN();
        softAssert.assertTrue(signUp.isNotMatchPassesDisplayed(),"Passwords must match, the required error message for Password field is not displayed");

        SeleniumActions.sendKeysOnElement(signUp.reEnterPasswordField, "23");
        softAssert.assertTrue(signUp.isNotMatchPassesDisplayed(), "Passwords must match, the required error message for Password field is not displayed");

        SeleniumActions.sendKeysOnElement(signUp.reEnterPasswordField, "45");
        softAssert.assertTrue(signUp.isNotMatchPassesDisplayed(), "Passwords must match, the required error message for Password field is not displayed");
        softAssert.assertAll();
    }

    @Test
    //Check whether Conditions Of Use Page is displayed after clicking on Conditions of Use button
    void isConditionsOfUsePageDisplayedSignUp(){
        SignUp signUp = new SignUp();

        signUp.redirectingToSignUpBTNAndClicking();
        Assert.assertTrue(signUp.isConditionsOfUsePageDisplayed(), "There is issue with displaying Conditions Of Use Page");
    }

    @Test
    //Check whether Privacy Notice Page is displayed after clicking on Privacy Notice button
    void isPrivacyNoticePageDisplayedSignUp(){
        SignUp signUp = new SignUp();

        signUp.redirectingToSignUpBTNAndClicking();
        Assert.assertTrue(signUp.isPrivacyNoticePageDisplayed(), "There is issue with displaying Privacy Notice Page");
    }

    @Test
    //Check whether Email address already in use page is displayed or no
    void isEmailAddressAlreadyInUsePageDisplayed(){
        SignUp signUp = new SignUp();

        signUp.redirectingToSignUpBTNAndClicking();
        SeleniumActions.sendKeysOnElement(signUp.customerNameField,"Gevorg Beglaryan");
        SeleniumActions.sendKeysOnElement(signUp.mobileNumberOrEmailField,"ge.beglaryan@gmail.com");
        SeleniumActions.sendKeysOnElement(signUp.SignUpPasswordField,"ABCDEFG");
        SeleniumActions.sendKeysOnElement(signUp.reEnterPasswordField,"ABCDEFG");
        signUp.clickVerificationBTN();
        Assert.assertTrue(signUp.isAlreadyExistingEmailPageDisplayed(), "There is issue with displaying Email Address Already In Use Page");
    }

    @Test
    //Check whether OTP page is displayed after inputting valid data in all fields of Sign Up
    void isOTPPageDisplayed(){
        SignUp signUp = new SignUp();

        signUp.redirectingToSignUpBTNAndClicking();
        SeleniumActions.sendKeysOnElement(signUp.customerNameField,"Gevorg Beglaryan");
        SeleniumActions.sendKeysOnElement(signUp.mobileNumberOrEmailField,"strawberry.durianabc@gmail.com");
        SeleniumActions.sendKeysOnElement(signUp.SignUpPasswordField,"123456");
        SeleniumActions.sendKeysOnElement(signUp.reEnterPasswordField,"123456");
        signUp.clickVerificationBTN();
        Assert.assertTrue(signUp.isOTPPageDisplayed(), "There is issue with displaying OTP page");
    }

    @Test
    //Check whether Country/Region button is displayed after entering OTP code and clicking on verify OTP button
    void isCountryRegionButtonDisplayedAfterEnteringAndClickingOTP(){
        SignUp signUp = new SignUp();

        Assert.assertTrue(signUp.isCountryRegionBTNDisplayedAfterEnteringOTPCode(), "There is issue with displaying Country/Region button after entering OTP Code");
    }

}