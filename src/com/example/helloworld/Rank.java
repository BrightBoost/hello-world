package com.example.helloworld;

public enum Rank {
    ACE("test"),
    TWO("tekst"),
    THREE("asd");

    private String value;

    public String getValue() {
        return value;
    }


    Rank(String value) {
        this.value = value;
    }
}
