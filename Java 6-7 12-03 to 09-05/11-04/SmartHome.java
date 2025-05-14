abstract class SmartDevice {
    String brand;

    abstract void turnOn();
    abstract void turnOff();

    void showDetails() {
        System.out.println("Brand name is " + brand);
    }
}

interface MediaPlayable {
    // variables are by default public, static and final
    int soundVolume = 10;

    // methods by default public and abstract
    void playMedia(String mediaName);

    // non abstract methods not possible in interfaces
    // void increaseVolume() {
    //     System.out.println("");
    // }
}

interface WifiEnable {
    void connectWifi(String wifiName);
}

class SmartTv extends SmartDevice implements MediaPlayable, WifiEnable {
    @Override
    void turnOn() {
        System.out.println("Smart TV turned on");
    }

    @Override
    void turnOff() {
        System.out.println("Smart TV turned off");
    }

    // from WifiEnable interface
    @Override
    public void connectWifi(String wifiName) {
        System.out.println("Smart TV connected to wifi: " + wifiName);
    }

    // from MediaPlayable interface
    @Override
    public void playMedia(String mediaName) {
        System.out.println("Smart tv playing media on " + mediaName);
    }
}

class SmartLight extends SmartDevice implements WifiEnable {
    @Override
    void turnOn() {
        System.out.println("Smart light turned on");
    }

    @Override
    void turnOff() {
        System.out.println("Smart light turned off");
    }

    // from WifiEnable interface
    @Override
    public void connectWifi(String wifiName) {
        System.out.println("Smart light connected to wifi: " + wifiName);
    }
}

class SmartHome {
    public static void main(String[] args) {
        SmartDevice tv = new SmartTv();
        tv.brand = "LG";
        SmartDevice light = new SmartLight();
        light.brand = "Bajaj";

        System.out.println("-------Smart TV---------");
        tv.showDetails();
        tv.turnOn();
        ((SmartTv) tv).connectWifi("airtel123");
        ((SmartTv) tv).playMedia("Youtube");
        tv.turnOff();

        System.out.println("-------Smart Light---------");
        light.showDetails();
        light.turnOn();
        ((SmartLight) light).connectWifi("jio123");
        light.turnOff();

        // accessing static variable inside MediaPlayable interface
        System.out.println(MediaPlayable.soundVolume);
    }
}