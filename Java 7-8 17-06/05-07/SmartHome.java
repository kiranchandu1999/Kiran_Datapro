abstract class Device {
    abstract void turnOn();

    abstract void turnOff();
}

interface Wifi {
    void connectWifi();
}

interface Media {
    void playMusic();
}

class SmartTv extends Device implements Wifi, Media {
    void turnOn() {
        System.out.println("Tv turned on");
    }

    void turnOff() {
        System.out.println("Tv turned off");
    }

    public void connectWifi() {
        System.out.println("Wifi connected to TV");
    }

    public void playMusic() {
        System.out.println("Playing music on TV");
    }
}

class SmartLight extends Device implements Wifi {
    void turnOn() {
        System.out.println("Light turned on");
    }

    void turnOff() {
        System.out.println("Light turned off");
    }

    public void connectWifi() {
        System.out.println("Wifi connected to Light");
    }
}

public class SmartHome {
    void controlDevice(Device device) {
        device.turnOn();

        ((Wifi) device).connectWifi();

        if(device instanceof Media) {
            ((Media) device).playMusic();
        }

        device.turnOff();
    }

    public static void main(String[] args) {
        SmartHome home = new SmartHome();
        // if we want to control smart tv
        home.controlDevice(new SmartTv());

        // if we want to control smart light
        home.controlDevice(new SmartLight());
    }
}
