package com.dio.base;

public class Repeticaocomfor {
    private final String code;
    private final int totalValue;

    private final String[] items;


    public Repeticaocomfor(String code, int totalValue, String[] items) {
        this.code = code;
        this.totalValue = totalValue;
        this.items = items;
    }


    public void printItems() {
        for (int i=0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }
}

