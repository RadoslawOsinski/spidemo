package eu.com.example.spi.a.application;

import eu.com.example.spi.application.TextAPIProvider;

/**
 * Created by Radosław Osiński
 */
public class DemoA {

    public static void main(String[] args) {
        System.out.println("---> " + TextAPIProvider.getDefaultProvider().getHelloWorldText());
        System.out.println("---> " + TextAPIProvider.getProvider("eu.com.example.impla.text.TextA").getHelloWorldText());
    }
}
