package tests;

import base.BaseTest;
import org.testng.annotations.Test;

public class BasicAuth extends BaseTest {

    protected final String USERNAME = "admin";
    protected final String PASSWORD = "admin";
    @Test
    public void handleBasicAuth(){

        String url = "https://" + USERNAME + ":" + PASSWORD + "@the-internet.herokuapp.com/basic_auth";
        driver.get(url);

    }

}
