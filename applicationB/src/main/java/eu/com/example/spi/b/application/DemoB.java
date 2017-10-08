package eu.com.example.spi.b.application;

import eu.com.example.spi.application.TextAPIProvider;

/**
 * Created by Radosław Osiński
 */
public class DemoB {

    public static void main(String[] args) {
        System.out.println("---> " + TextAPIProvider.getDefaultProvider().getHelloWorldText());
        System.out.println("---> " + TextAPIProvider.getProvider("eu.com.example.implb.text.TextB").getHelloWorldText());
    }
}
