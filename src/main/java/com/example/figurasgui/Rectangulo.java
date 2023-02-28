package com.example.figurasgui;

public class Rectangulo extends Figura {
    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    protected float area() {
        float a = this.base * this.base;
        return a;
    }

    @Override
    protected float perimetro() {
        float p = (this.base * 2) + (this.altura * 2);
        return p;
    }
}
