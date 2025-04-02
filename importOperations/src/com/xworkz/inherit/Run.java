package com.xworkz.inherit;

public class Run {
    public static void main(String[] args){
        Car car=new Car();
        car.type();
        car.drive();
        car.fuel();
        car.start();
        car.stop();

        Duck duck=new Duck();
        duck.fly();
        duck.swim();
        duck.eat();
        duck.quack();
        duck.sleep();

        Circle myCircle = new Circle();
        myCircle.display();
        myCircle.area();
        myCircle.calculateCircleArea(5.0);

        Smartphone phone=new Smartphone();
        phone.turnOn();
        phone.turnOff();
        phone.browserInternet();
        phone.makeCall();

        Manager manager=new Manager();
        manager.work();
        manager.getSalary();
        manager.manageTeam();
        manager.conductMeeting();


        Motorcycle bike = new Motorcycle();
        bike.move();
        bike.applyBrakes();
        bike.wheelie();
        bike.lean();
    }


}
