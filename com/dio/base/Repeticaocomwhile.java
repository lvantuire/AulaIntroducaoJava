package com.dio.base;

public class Repeticaocomwhile {
    private final String code;
    private final int totalValue;

    private final String[] items;


    public Repeticaocomwhile(String code, int totalValue, String[] items) {
        this.code = code;
        this.totalValue = totalValue;
        this.items = items;
    }


    public void printItems() {
        int i = 0;
        while (i < items.length) {
            System.out.println(items[i]);
            i++;
        }
    }
}

