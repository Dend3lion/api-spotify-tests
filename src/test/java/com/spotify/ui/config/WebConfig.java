package com.spotify.ui.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/${env}.properties",
})
public interface WebConfig extends Config{
    @Key("baseUrl")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("chrome")
    String getBrowser();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Key("browserVersion")
    @DefaultValue("100.0")
    String getBrowserVersion();

    @Key("isRemote")
    @DefaultValue("false")
    Boolean isRemote();

    @Key("remoteHost")
    String getRemoteHost();
}