package com.dio.base;

import java.math.BigDecimal;

/**
 * @author Vantuir
 * @version 1.0.0
 * @see BigDecimal
 * @since Release 1.0.0
 *
 *
 *
 * comando do Javadocs
 * javadoc -d javadoc/ -sourcepath src/ -subpackages com.dio
 *
 *
 */




public class OrderJavadosErrors {


    private final String code;
    private final BigDecimal totalValue;
    public OrderJavadosErrors(String code, BigDecimal totalValue) {
        this.code = code;
        this.totalValue = totalValue;
        /**
         * Construtor da classe
         *
         * @param code              descrever o code
         * @param totalValue        descrever o total Value
         */


    }

    /**
     * também documentar aqui
     * @return  é um return
     */
    public BigDecimal calculateFee() {
            if (this.totalValue.signum() < 0) {
                throw new RuntimeException("O pedido não pode ter valor negativo");
        }
            if (this.totalValue.compareTo(new BigDecimal("100.00"))> 100) {
                return this.totalValue.multiply(new BigDecimal("0.99"));
            }
            return this.totalValue;

    }

}
