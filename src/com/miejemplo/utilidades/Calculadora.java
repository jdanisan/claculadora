/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.miejemplo.utilidades;

/**
 *
 * @author usuario
 */

public class Calculadora {

    public int resultado;
    
    public static int sumar(int sumando1, int sumando2) {
        return sumando1 + sumando2;
    }

    public static int restar(int restar1, int restar2) {
        return restar1 - restar2;
    }

    public static int multiplicar(int multiplicar1, int multiplicar2) {
        return multiplicar1 * multiplicar2;
    }

    public static int dividir(int dividir1, int dividir2) {
        if (dividir2 == 0) {
            throw new ArithmeticException("División por cero");
        }
        return dividir1 / dividir2;
    }

    public static int modulo(int modulo1, int modulo2) {
        if (modulo2 == 0) {
            throw new ArithmeticException("Módulo por cero");
        }
        return modulo1 % modulo2;
    }
    
    public static int operacion(int operador1, int operador2, String operacion) {
        switch(operacion){
            case "sumar":
                return sumar(operador1,operador2);
            case "restar":
                return restar(operador1,operador2);
            case "multiplicar":
                return multiplicar(operador1,operador2);
            case "dividir":
                return dividir(operador1,operador2);
            case"modulo":
                return modulo(operador1,operador2);
            default:        
        throw new IllegalArgumentException("Operación no válida");
        }
        
    }
  

}