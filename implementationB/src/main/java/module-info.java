/**
 * Created by Radosław Osiński
 */
module eu.com.example.implementationB {
    requires eu.com.example.apiModule;

    provides eu.com.example.text.spi.TextAPI with eu.com.example.implb.text.TextB;

}
