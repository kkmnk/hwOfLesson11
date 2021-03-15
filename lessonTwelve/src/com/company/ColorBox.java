package com.company;

public class ColorBox extends Box{
    private static String color;

    public ColorBox(EnumColor enumColor) {
        color = enumColor.getDescription();
    }

    public static String getColor() {
        return color;
    }
}