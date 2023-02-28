package com.example.figurasgui;

public class Cuadrado extends Figura {
    public Cuadrado(float lado) {
        this.lado = lado;
    }

    @Override
    protected float area() {
        float a = this.lado * this.lado;
        return a;
    }

    @Override
    protected float perimetro() {
        float p = this.lado * 4;
        return p;
    }
}
