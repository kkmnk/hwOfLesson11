package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] array = new String[5][3];

        int counter;
        for(counter = 0; counter < 5; ++counter) {
            System.out.print("введите размеры " + (counter + 1) + "-го куба:\nвысота: ");
            int height = scanner.nextInt();
            System.out.print("длина: ");
            int length = scanner.nextInt();
            System.out.print("ширина: ");
            int width = scanner.nextInt();
            Box box = new Box(height, length, width);
            array[counter][0] = String.valueOf(box.calculateVolume());
            boolean count = false;

            String str;
            do {
                System.out.print("ЦВЕТ(доступные: красный, синий, желтый, черный, белый, розовый): ");
                str = scanner.next();
                ColorBox colorBox;
                if (str.equals(EnumColor.WHITE.getDescription())) {
                    colorBox = new ColorBox(EnumColor.WHITE);
                    array[counter][1] = ColorBox.getColor();
                    count = true;
                } else if (str.equals(EnumColor.YELLOW.getDescription())) {
                    colorBox = new ColorBox(EnumColor.YELLOW);
                    array[counter][1] = ColorBox.getColor();
                    count = true;
                } else if (str.equals(EnumColor.BLACK.getDescription())) {
                    colorBox = new ColorBox(EnumColor.BLACK);
                    array[counter][1] = ColorBox.getColor();
                    count = true;
                } else if (str.equals(EnumColor.RED.getDescription())) {
                    colorBox = new ColorBox(EnumColor.RED);
                    array[counter][1] = ColorBox.getColor();
                    count = true;
                } else if (str.equals(EnumColor.PINK.getDescription())) {
                    colorBox = new ColorBox(EnumColor.PINK);
                    array[counter][1] = ColorBox.getColor();
                    count = true;
                } else if (str.equals(EnumColor.BLUE.getDescription())) {
                    colorBox = new ColorBox(EnumColor.BLUE);
                    array[counter][1] = ColorBox.getColor();
                    count = true;
                } else {
                    System.out.println("enter right variable!");
                }
            } while(!count);

            do {
                System.out.print("МАТЕРИАЛ(доступные: металл, дерево, пластик, бумага, картон, пластилин): ");
                str = scanner.next();
                if (str.equals(EnumMaterial.CARDBOARD.getDescription())) {
                    box.setMaterial(str);
                    array[counter][2] = box.getMaterial();
                    count = true;
                } else if (str.equals(EnumMaterial.WOOD.getDescription())) {
                    box.setMaterial(str);
                    array[counter][2] = box.getMaterial();
                    count = true;
                } else if (str.equals(EnumMaterial.PAPER.getDescription())) {
                    box.setMaterial(str);
                    array[counter][2] = box.getMaterial();
                    count = true;
                } else if (str.equals(EnumMaterial.PLASTIC.getDescription())) {
                    box.setMaterial(str);
                    array[counter][2] = box.getMaterial();
                    count = true;
                } else if (str.equals(EnumMaterial.PLASTICINE.getDescription())) {
                    box.setMaterial(str);
                    array[counter][2] = box.getMaterial();
                    count = true;
                } else if (str.equals(EnumMaterial.METAL.getDescription())) {
                    box.setMaterial(str);
                    array[counter][2] = box.getMaterial();
                    count = true;
                } else {
                    count = false;
                    System.out.println("enter right variable, noob!");
                }
            } while(!count);
        }

        System.out.println();

        for(counter = 0; counter < 5; ++counter) {
            System.out.println("объем куба " + (counter + 1) + "-го куба: " + array[counter][0] + ";\tцвет: " + array[counter][1] + ";\tматериал: " + array[counter][2]);
        }

        System.out.println("ЕСЛИ ЗНАЧЕНИЕ ПОЛЯ ОБЪЕМА КУБА РАВНО 0 ЭТО ЗНАЧИТ, ЧТО ВЫ ВВЕЛИ НЕКОРРЕКТНОЕ ЗНАЧЕНИЕ");
    }
}