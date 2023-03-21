package com.example.calculadorafx;

public class Operaciones {
    private int a;
    private int b;

    public Operaciones(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int Suma(){
        return a + b;
    }

    public int Resta(){
        return a - b;
    }

    public int Multiplicar(){
        return a * b;
    }

    public double Dividir(){
        return (double) a/b;
    }
}
