package eu.com.cwsfe.impla.text;

import eu.com.cwsfe.text.spi.TextAPI;

/**
 * Created by Radosław Osiński
 */
public class TextA implements TextAPI {

    public String getHelloWorldText() {
        return "Text from A implementation";
    }
}
