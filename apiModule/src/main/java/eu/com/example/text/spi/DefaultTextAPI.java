package eu.com.example.text.spi;

/**
 * Created by Radosław Osiński
 */
public class DefaultTextAPI implements TextAPI {

    @Override
    public String getHelloWorldText() {
        return "override me!";
    }
}
