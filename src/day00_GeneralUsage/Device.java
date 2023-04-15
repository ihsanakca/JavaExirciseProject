package day00_GeneralUsage;

public enum Device {

    PIXEL2("emulator-5554",
            "11",
            "Pixel2",
            "Android"),
    Redmi_Note_8(
            "3c7eb8",
            "12",
            "Xaomi Redmi Note 8",
            "Android");


    public String udid;
    public String version;
    public String deviceName;
    public String platformName;

    Device(String udid, String version, String deviceName, String platformName) {
        this.udid = udid;
        this.version = version;
        this.deviceName = deviceName;
        this.platformName = platformName;
    }

    @Override
    public String toString() {
        return this.name();
    }


}