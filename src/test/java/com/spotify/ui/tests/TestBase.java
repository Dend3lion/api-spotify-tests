package com.spotify.ui.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.spotify.ui.config.ApiConfig;
import io.qameta.allure.selenide.AllureSelenide;
import io.restassured.RestAssured;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {
    private static final ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());

    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = apiConfig.getBaseUrl();
    }

    @BeforeEach
    public void addLogger() {
        SelenideLogger.addListener("Allure", new AllureSelenide());
    }
}
