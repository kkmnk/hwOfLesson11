package com.company;

public enum Color {
    RED("красный"),
    BLUE("синий"),
    BLACK("черный");

    private String description;

    Color(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
