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

        Pizza pepperoni=new Pizza();
        pepperoni.prepare();
        pepperoni.addCheese();
        pepperoni.bake();
        pepperoni.serve();

        Novel fiction=new Novel();
        fiction.open();
        fiction.close();
        fiction.readChapter();
        fiction.turnPage();

        Guitar myGuitar=new Guitar();
        myGuitar.play();
        myGuitar.tune();
        myGuitar.strum();
        myGuitar.pick();

        Laptop myLaptop=new Laptop();
        myLaptop.processData();
        myLaptop.displayOutput();
        myLaptop.portability();
        myLaptop.batteryLife();

        Flower rose=new Flower();
        rose.grow();
        rose.photosynthesize();
        rose.bloom();
        rose.produceScent();

        Hammer myHammer=new Hammer();
        myHammer.pullNails();
        myHammer.strike();
        myHammer.use();
        myHammer.maintain();

        Coffee myCoffee=new Coffee();
        myCoffee.consume();
        myCoffee.prepare();
        myCoffee.addMilk();
        myCoffee.addSugar();

        Rectangle rect=new Rectangle();
        rect.draw();
        rect.resize();
        rect.calculateArea();
        rect.calculatePerimeter();

        Bicycle bike =new Bicycle();
        bike.move();
        bike.pedal();
        bike.stop();
        bike.ringBell();

        Lion leo = new Lion();
        leo.eat();
        leo.sleep();
        leo.roar();
        leo.hunt();

        Student sam = new Student();
        sam.walk();
        sam.talk();
        sam.study();
        sam.attendClass();

        House home=new House();
        home.garden();
        home.liveIn();
        home.construct();
        home.demolish();

        Chair seat=new Chair();
        seat.adjustHeight();
        seat.sitOn();
        seat.disassemble();
        seat.assemble();

        Television tv=new Television();
        tv.adjustVolume();
        tv.changeChannel();
        tv.powerOff();
        tv.powerOn();

        Box storage=new Box();
        storage.pack();
        storage.unpack();
        storage.store();
        storage.empty();




    }


}
