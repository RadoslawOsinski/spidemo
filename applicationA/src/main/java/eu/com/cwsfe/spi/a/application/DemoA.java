package eu.com.cwsfe.spi.a.application;

import eu.com.cwsfe.spi.application.TextAPIProvider;

/**
 * Created by Radosław Osiński
 */
public class DemoA {

    public static void main(String[] args) {
        System.out.println("---> " + TextAPIProvider.getDefaultProvider().getHelloWorldText());
        System.out.println("---> " + TextAPIProvider.getProvider("eu.com.cwsfe.impla.text.TextA").getHelloWorldText());
        System.out.println("---> " + TextAPIProvider.getProvider("").getHelloWorldText());
    }
}
