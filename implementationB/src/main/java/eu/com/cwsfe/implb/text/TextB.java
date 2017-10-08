package eu.com.cwsfe.implb.text;

import eu.com.cwsfe.text.spi.TextAPI;

/**
 * Created by Radosław Osiński
 */
public class TextB implements TextAPI {

    public String getHelloWorldText() {
        return "Text from B implementation";
    }
}
