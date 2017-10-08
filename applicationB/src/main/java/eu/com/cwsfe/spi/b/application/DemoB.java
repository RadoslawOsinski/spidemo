package eu.com.cwsfe.spi.b.application;

import eu.com.cwsfe.spi.application.TextAPIProvider;

/**
 * Created by Radosław Osiński
 */
public class DemoB {

    public static void main(String[] args) {
        System.out.println("---> " + TextAPIProvider.getDefaultProvider().getHelloWorldText());
        System.out.println("---> " + TextAPIProvider.getProvider("eu.com.cwsfe.implb.text.TextB").getHelloWorldText());
        System.out.println("---> " + TextAPIProvider.getProvider("").getHelloWorldText());
    }
}
