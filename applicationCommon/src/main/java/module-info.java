/**
 * Created by Radosław Osiński
 */
module eu.com.example.applicationCommon {
    requires eu.com.example.apiModule;

    exports eu.com.example.spi.application;

    uses eu.com.example.text.spi.TextAPI;
}
