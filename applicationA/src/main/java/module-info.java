/**
 * Created by Radosław Osiński
 */
module eu.com.example.applicationA {
    requires eu.com.example.apiModule;
    requires transitive eu.com.example.applicationCommon;

    uses eu.com.example.text.spi.TextAPI;
}
