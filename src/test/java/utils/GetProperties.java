package utils;

import java.io.InputStream;
import java.util.Properties;

public class GetProperties {
    private static GetProperties getProperties = null;
    private String device ;
    private String deviceName;
    private String platformVersion;
    private String appPackage;
    private String appActivity;

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getPlatformVersion() {
        return platformVersion;
    }

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    public String getAppPackage() {
        return appPackage;
    }

    public void setAppPackage(String appPackage) {
        this.appPackage = appPackage;
    }

    public String getAppActivity() {
        return appActivity;
    }

    public void setAppActivity(String appActivity) {
        this.appActivity = appActivity;
    }



    private GetProperties() {

        Properties prop = new Properties();
        String fileName = "prop.properties";

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName);

        if (inputStream != null) {
            try {
                prop.load(inputStream);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            throw new RuntimeException("property file '" + fileName + "' not found in the classpath");
        }
        device = prop.getProperty("device");
        deviceName = prop.getProperty("deviceName");
        platformVersion = prop.getProperty("platformVersion");
        appPackage = prop.getProperty("appPackage");
        appActivity = prop.getProperty("appActivity");
    }

    public static GetProperties getProperties() {
        if (getProperties == null) {
            getProperties = new GetProperties();
        }
        return getProperties;
    }
}