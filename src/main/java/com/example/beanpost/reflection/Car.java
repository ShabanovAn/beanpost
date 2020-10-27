//package com.example.beanpost.reflection;
//
//public class Car {
//    private int horsepower;
//
//    @MyAnnotation(name = "Tom")
//    public String serialNumber;
//
//    public Car() {
//        serialNumber = "";
//        horsepower = 0;
//    }
//
//
//@CarServise
//    public Car(int horsepower, String serialNumber) {
//        this.horsepower = horsepower;
//        this.serialNumber = serialNumber;
//    }
//
//    public int getHorsepower() {
//
//        return horsepower;
//    }
//
//    void setHorsepower(int horsepower) {
//
//        this.horsepower = horsepower;
//    }
//
//    protected void printSerialNumber() {
//
//        System.out.println(serialNumber);
//    }
//
//    public void setSerialNumber(String serialNumber) {
//        this.serialNumber = serialNumber;
//    }
//
//    @Override
//    public String toString() {
//        return "Car{" +
//                "horsepower=" + horsepower +
//                ", serialNumber='" + serialNumber + '\'' +
//                '}';
//    }
//}