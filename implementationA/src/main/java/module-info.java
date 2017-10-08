/**
 * Created by Radosław Osiński
 */
module eu.com.example.implementationA {
    requires eu.com.example.apiModule;

    provides eu.com.example.text.spi.TextAPI with eu.com.example.impla.text.TextA;

}
