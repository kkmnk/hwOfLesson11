package com.company;

public enum EnumColor {
    RED("красный"),
    BLUE("синий"),
    YELLOW("желтый"),
    BLACK("черный"),
    WHITE("белый"),
    PINK("розовый");

    private final String description;

    private EnumColor(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}