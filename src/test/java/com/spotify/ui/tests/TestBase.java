package com.spotify.ui.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.spotify.ui.config.ApiConfig;
import com.spotify.ui.config.WebConfig;
import com.spotify.ui.helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import io.restassured.RestAssured;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {
//    private static final WebConfig webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());
    ;
    private static final ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());
    ;

    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = apiConfig.getBaseUrl();

//        Configuration.pageLoadStrategy = "eager";
//        Configuration.baseUrl = webConfig.getBaseUrl();
//        Configuration.browser = webConfig.getBrowser();
//        Configuration.browserSize = webConfig.getBrowserSize();
//        Configuration.browserVersion = webConfig.getBrowserVersion();
//
//        if (webConfig.isRemote()) {
//            Configuration.remote = webConfig.getRemoteHost();
//
//            DesiredCapabilities capabilities = new DesiredCapabilities();
//            capabilities.setCapability("selenoid:options", Map.of(
//                    "enableVNC", true,
//                    "enableVideo", true
//
//            ));
//            Configuration.browserCapabilities = capabilities;
//        }
    }

    @BeforeEach
    public void addLogger() {
        SelenideLogger.addListener("Allure", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
//        Attach.screenshotAs("Last screenshot");
//        Attach.pageSource();
//        Attach.browserConsoleLogs();
//        if (webConfig.isRemote()) {
//            Attach.addVideo();
//        }
//
//        closeWebDriver();
    }
}
