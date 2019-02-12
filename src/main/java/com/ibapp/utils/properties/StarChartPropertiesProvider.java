package com.ibapp.utils.properties;

import java.io.InputStream;
import java.util.Properties;

import static com.ibapp.utils.exceptions.Exceptions.uncheck;

// TODO: Write a test for this
public class StarChartPropertiesProvider {

    private static Properties properties = new Properties();

    static {
        InputStream inputStream = StarChartPropertiesProvider.class
                .getClassLoader()
                .getResourceAsStream("start-chart-service.properties");
        uncheck(() -> {
            properties.load(inputStream);
            return null;
        });
    }

    public static Properties getProperties(){
        return properties;
    }

}
