package eu.com.cwsfe.spi.application;

import eu.com.cwsfe.text.spi.DefaultTextAPI;
import eu.com.cwsfe.text.spi.TextAPI;

import java.util.ServiceLoader;

/**
 * Created by Radosław Osiński
 */
public class TextAPIProvider {

    public static TextAPI getProvider(String providerName) {
        ServiceLoader<TextAPI> serviceLoader = ServiceLoader.load(TextAPI.class);

        for (TextAPI provider : serviceLoader) {
            String className = provider.getClass().getName();
            if (providerName.equals(className)) {
                return provider;
            }
        }

        throw new RuntimeException(providerName + " provider is not found!");
    }

    public static TextAPI getDefaultProvider() {
        return new DefaultTextAPI();
    }
}
