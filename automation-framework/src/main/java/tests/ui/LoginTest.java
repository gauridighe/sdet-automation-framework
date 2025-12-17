package tests.ui;

import base.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLoginPage() {
        driver.get("https://example.com");
        System.out.println("UI test executed successfully");
    }
}
