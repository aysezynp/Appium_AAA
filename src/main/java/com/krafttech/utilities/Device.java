package com.krafttech.utilities;

public enum Device {

    Pixel2("emulator-5554","11.0","Pixel 2","Android"),
    Redmi_8("3c7eb8","12","XiaomiNote8","Android");//burdan istediğimiz kadar cihaz ekleyebilirz

    public String udid;
    public String version;
    public String deviceName;
    public String platformName;

    Device(String udid,String version,String deviceName,String platformName){
        this.udid=udid;
        this.version=version;
        this.deviceName=deviceName;
        this.platformName=platformName;
    }
}
