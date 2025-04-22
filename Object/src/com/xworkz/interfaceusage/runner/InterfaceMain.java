package com.xworkz.interfaceusage.runner;


import com.xworkz.interfaceusage.ex1.*;
import com.xworkz.interfaceusage.ex11.*;
import com.xworkz.interfaceusage.ex2.*;
import com.xworkz.interfaceusage.ex3.*;
import com.xworkz.interfaceusage.ex4.*;
import com.xworkz.interfaceusage.ex5.*;
import com.xworkz.interfaceusage.ex6.*;
import com.xworkz.interfaceusage.ex7.*;
import com.xworkz.interfaceusage.ex8.*;
import com.xworkz.interfaceusage.ex9.*;
import com.xworkz.interfaceusage.ex10.*;

public class InterfaceMain {
    public static void main(String[] args) {
        Icc icc=new IndianCricketTeamIccImpl();
        Bcci bcci=new Bcci(icc);
        bcci.display();


        Constitution constitution = new CitizenConstitutionImpl();
        Government govt = new Government(constitution);
        govt.enforce();

        Laptop laptop = new WindowsLaptopImpl();
        OperatingSystem os = new OperatingSystem(laptop);
        os.operate();

        Engine engine = new DieselEngineImpl();
        Vehicle vehicle = new Vehicle(engine);
        vehicle.run();

        Network network = new WifiNetworkImpl();
        Router router = new Router(network);
        router.establishConnection();

        Printer printer = new LaserPrinterImpl();
        Office office = new Office(printer);
        office.startPrinting();

        Light light = new LedLightImpl();
        Room room = new Room(light);
        room.illuminate();

        Camera camera = new DigitalCameraImpl();
        Photographer photographer = new Photographer(camera);
        photographer.takePhoto();

        Speaker speaker = new BluetoothSpeakerImpl();
        MusicPlayer player = new MusicPlayer(speaker);
        player.play();

        Television tv = new SmartTVImpl();
        EntertainmentCenter center = new EntertainmentCenter(tv);
        center.showContent();

        Fan fan=new CeilingFanImpl();
        Hall hall=new Hall(fan);
        hall.coolRoom();


    }
}
