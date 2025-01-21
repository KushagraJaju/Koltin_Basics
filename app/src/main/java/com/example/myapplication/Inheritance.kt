package com.example.koltinbasic

/* The class that inherits the feature of another class is called the Sub class or Child class
or Derived class and the class whose features are inherited is called the Super class or
Parent Class or Base Class */


// The class needs to be open if u want to inherit it
//Super Class open class Vehicle{
//properties
//methods

//The sealed keyword can make a class non inheritable ----- sealed class Car1 : Vehicle()
//Sub Class of the vehicle
open class Car1 (val name1 : String, val brand1 : String){

}

// sub class of the class Car
class ElectricCar(name1: String, brand1: String) : Car1(name1, brand1){

}