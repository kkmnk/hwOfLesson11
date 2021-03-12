package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height, length, width;
        String color, material;
        String[][] array = new String[5][3];

        for (int counter = 0; counter < 5; counter++){
            System.out.print("введите размеры " + (counter + 1) + "-го куба:" +
                    "\nвысота: ");
            height = scanner.nextInt();
            System.out.print("длина: ");
            length = scanner.nextInt();
            System.out.print("ширина: ");
            width = scanner.nextInt();
            Box box = new Box(height, length, width);
            array[counter][0] = String.valueOf(box.calculateVolume());
            System.out.print("цвет: ");
            color = scanner.next();
            box.setColor(color);
            array[counter][1] = box.getColor();
            System.out.print("материал: ");
            material = scanner.next();
            box.setMaterial(material);
            array[counter][2] = box.getMaterial();
        }

        System.out.println();

        for (int count = 0; count < 5; count++) {
            System.out.println("объем куба " + (count + 1) + "-го куба: " + array[count][0] +
                    ";\tцвет: " + array[count][1] +
                    "; материал: " + array[count][2]);
        }

        System.out.println("ЕСЛИ ЗНАЧЕНИЕ ПОЛЯ ОБЪЕМА КУБА РАВНО 0 ЭТО ЗНАЧИТ, ЧТО ВЫ ВВЕЛИ НЕКОРРЕКТНОЕ ЗНАЧЕНИЕ");
    }
    
    //for example this string will be test...
}
