package com.dio.base;

public class Repeticaocomdowhile {
    private final String code;
    private final int totalValue;

    private final String[] items;


    public Repeticaocomdowhile(String code, int totalValue, String[] items) {
        this.code = code;
        this.totalValue = totalValue;
        this.items = items;
    }


    public void printItems() {
        int i = 0;
        do {System.out.println(items[i]);
            i++;
        } while (i< items.length);
    }
}

