package com.dio.base;

public class RepeticaocomenhancedFor {
    private final String code;
    private final int totalValue;

    private final String[] items;


    public RepeticaocomenhancedFor(String code, int totalValue, String[] items) {
        this.code = code;
        this.totalValue = totalValue;
        this.items = items;
    }

    // comentario em linha

    /**
     * Esse é um comentario em bloco
     */

    public void printItems() {
        for (String i : items) {
            System.out.println(i);
        }
    }
}

