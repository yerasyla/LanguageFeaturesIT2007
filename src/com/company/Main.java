package com.company;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Func{
    int operation(int a, int b);
}

public class Main {

    private static int operate(int a, int b, Func lamda){
        return lamda.operation(a,b);
    }

    public static void main(String[] args) {

        System.out.println("Examples on lambda");




        Func lambdaExpression = (int a, int b) -> a+b;
        System.out.println(Main.operate(5,7, lambdaExpression));

    }
}

class Circle extends Shape {  //subclass of Shape
    /*instantaneous  variable of Circle*/
    protected double radius=1.0;

    //Constructor with no arguments, where radius=1.0
    public Circle(){
        this.radius=1.0;
    }

    //Constructor with 1 argument - radius
    public Circle(double radius){
        this.radius = radius;
    }

    //Constructor with 3 arguments: radius, color and filled
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    //Getter of radius
    public double getRadius() {
        return radius;
    }

    //Setter of radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /*Abstract class implementation for calculating area*/
    @Override
    public double getArea() {
        return 3.1415*getRadius()*getRadius();
    }

    /*Abstract class implementation for calculating perimeter*/
    @Override
    public double getPerimeter() {
        return 2*3.1415*getRadius();
    }

    /*toString method - returning radius and calling super class' toString method, which return color and filled*/
    public String toString() {
        return "A Circle with radius=" + getRadius() + ", which is a subclass of " + super.toString();
    }
}



class Rectangle extends Shape {
    /*instantaneous  variables of Rectangle*/
    protected double width=1.0;
    protected double length=1.0;

    /*Constructor with no arguments, where width=1.0 and length=1.0 */
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    /*Constructor with 2 arguments - length and width*/
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /*Constructor with 4 arguments: width, length, color and filled*/
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /*Getter of width*/
    public double getWidth() {
        return width;
    }

    /*Setter of width*/
    public void setWidth(double width) {
        this.width = width;
    }

    /*Getter of length*/
    public double getLength() {
        return length;
    }

    /*Setter of length*/
    public void setLength(double length) {
        this.length = length;
    }

    /*Abstract class implementation for calculating area*/
    @Override
    public double getArea() {
        return getLength()*getWidth();
    }

    /*Abstract class implementation for calculating perimeter*/
    @Override
    public double getPerimeter() {
        return 2*(getLength()+getWidth());
    }

    /*toString method - returning width, length  and calling super class' toString method, which return color and filled*/
    public String toString() {
        return "A Rectangle with width " + getWidth() + " and length " + getLength()
                + ", which is a subclass of " + super.toString();
    }
}


abstract class Shape {
    /*instantaneous  variables of Shape*/
    protected String color="red";
    protected boolean filled=true;

    /*Constructor with no arguments, where filled = true and color = red*/
    public Shape(){
        this.filled=true;
        this.color="red";
    }

    /*Constructor with 2 arguments: color and filled*/
    public Shape(String color, boolean filled){
        this.filled=filled;
        this.color=color;
    }

    /*Getter of color*/
    public String getColor() {
        return color;
    }

    /*Setter of filled*/
    public void setColor(String color) {
        this.color = color;
    }

    /*Getter of filled*/
    public boolean isFilled() {
        return filled;
    }

    /*Setter of filled*/
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /*abstract class for calculating area*/
    public abstract double getArea();

    /*abstract class for calculating perimeter*/
    public abstract double getPerimeter();

    /*toString method - returning color and filled*/
    public String toString() {
        if(isFilled()) return "Filled shape with color " + color;
        return "Not filled shape with color " + color;
    }
}

