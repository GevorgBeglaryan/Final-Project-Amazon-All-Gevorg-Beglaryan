import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
    public static String BASE_URL = "https://www.amazon.com/";


    public void navigateToURI(String path) {
        DriverFactory.getDriver().get(BASE_URL + path);
    }

    @BeforeMethod
    public void driverSetup() {
        DriverFactory.initDriver();
        SeleniumActions.setActions();
    }

    @AfterMethod(alwaysRun = true)
    public void driverQuit() {
        DriverFactory.downDriver();
        SeleniumActions.removeActions();
    }

}