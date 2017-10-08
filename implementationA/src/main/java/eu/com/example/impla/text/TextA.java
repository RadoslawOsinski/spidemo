package eu.com.example.impla.text;

import eu.com.example.text.spi.TextAPI;

/**
 * Created by Radosław Osiński
 */
public class TextA implements TextAPI {

    public String getHelloWorldText() {
        return "Text from A implementation";
    }
}
