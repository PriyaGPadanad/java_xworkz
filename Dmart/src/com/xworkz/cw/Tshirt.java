package com.xworkz.cw;

public class Tshirt {

    private String Tshirt;
    private String color;
    private String brand;
    private double price;
    private int size;


    @Override
    public boolean equals(Object obj){
        if(obj!=null){
            System.out.println("ref is not null");
            if(obj instanceof Tshirt){
                System.out.println("ref is tshirt,will compare");
                Tshirt tshirt1=this;
                Tshirt tshirt2=(Tshirt)obj;
                if(tshirt1.price==tshirt2.price && tshirt1.brand==tshirt2.brand && tshirt1.color==tshirt2.color && tshirt1.size==tshirt2.size){
                    System.out.println("both tshirts are same");
                    return true;
                }
            }
            return false;
        }
    }
}
