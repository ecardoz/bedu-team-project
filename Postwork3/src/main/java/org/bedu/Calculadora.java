package org.bedu;

public class Calculadora {

    private CalculadoraDao calculadoraDao;

    public int suma(int a, int b){
        return a + b + calculadoraDao.findConstante();
    }

    public int resta(int a, int b){
        return a - b + calculadoraDao.findConstante();
    }

    public int multiplicacion(int a, int b){
        return a * b + calculadoraDao.findConstante();
    }

    public float division(float a, float b){
        if(b == 0){
            throw new IllegalArgumentException("No es posible dividir un valor entre 0");
        }
        return a / b;
    }

}
