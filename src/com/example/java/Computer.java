package com.example.java;

public class Computer {
    String brand;
    float screenSize;
    int numberOfCores;
    String type;

    public Computer(String brand, float screenSize){
        this.brand = brand;
        this.screenSize = screenSize;
    }

    public static void main(String[] args){
        Computer macBookPro = new Computer("Apple", 13.3f);
        Computer acerAspire = new Computer("Acer", 15.6f);
    }
}
