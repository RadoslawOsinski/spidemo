package eu.com.example.implb.text;

import eu.com.example.text.spi.TextAPI;

/**
 * Created by Radosław Osiński
 */
public class TextB implements TextAPI {

    public String getHelloWorldText() {
        return "Text from B implementation";
    }
}
