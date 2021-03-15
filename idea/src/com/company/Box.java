package com.company;
import java.util.Scanner;

public class Box {
    private  int height, length, width;
    private static String color, material;
    private Scanner scanner = new Scanner(System.in);

    public Box(){}

    public Box(int height, int length, int width){  //высота, длина, ширина
        if (length > 0 && height > 0 && width > 0){
            this.height = height;
            this.width = width;
            this.length = length;
        }else{
            this.height = 0;
            this.width = 0;
            this.length = 0;

        }
    }

    public Box(int height, int length, int width, String color, String material){
        new Box(height, length, width);
        this.color = color;
        this.material = material;
    }

    public void setHeight(int height) {
        if (height > 0){
            this.height = height;
        }
    }

    public void setWidth(int width) {
        if (width > 0){
            this.width = width;
        } else {
            this.width = 0;
        }
    }

    public void setLength(int length) {
        if (length > 0){
            this.length = length;
        } else {
            this.length = 0;
        }
    }

    public String setMaterial(String material) {
        this.material = material;
        return material;
    }

    public String setColor(String color) {
        this.color = color;
        return this.color;
    }

    public int getHeight(){
        if (height <= 0 ){
            return Integer.parseInt(null);
        } else {
            return height;
        }
    }

    public int getLength() {
        if (length <= 0){
            return Integer.parseInt(null);
        } else {
            return length;
        }
    }

    public int getWidth() {
        if (width <= 0){
            return Integer.parseInt(null);
        } else {
            return width;
        }
    }

    public static String getColor() {
        return color;
    }

    public static String getMaterial() {
        return material;
    }

    public int calculateVolume(){
        return height*length*width;
    }
}