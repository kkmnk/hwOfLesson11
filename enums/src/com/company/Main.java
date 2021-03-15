package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car;
        System.out.print("цвет: ");
        String color = scanner.nextLine();
        if (color.equals(Color.BLUE.getDescription())){
            car = new Car(Color.BLUE);
        } else if (color.equals(Color.RED.getDescription())){
            car = new Car(Color.RED);
        } else {
            car = new Car(Color.BLACK);
        }
        System.out.println(car.getColor());
        System.out.println(car.getColor().getDescription());
    }
}
